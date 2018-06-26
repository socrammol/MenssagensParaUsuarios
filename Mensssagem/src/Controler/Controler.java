/*
Grupo: Daniel Aguila, Sandro Caio, Marcos Mol, Pedro Ely e Gabrielle Liberato
 */
package Controler;

import Model.*;
import Views.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;


/**
 *
 * @author PEM
 */
public class Controler {
    
    
    private GerenciaAssinantes gerente = new GerenciaAssinantes();
        
    private CentralSubject cs = new CentralSubject();
    
    private FactoryNovoAssinante factory = new FactoryNovoAssinante();
    
    private GerenciaArquivos arquivo = GerenciaArquivos.getInstancia(); 
    
    private Regras regras = Regras.getInstancia();
    
    
    
    public Controler() throws ParseException{
        
        this.carregaAssinante();
        
        InserirAssinante telaInserir = new InserirAssinante(this); // chama a tela de inserir assinante
        telaInserir.setVisible(true);
    }
    
    public void carregaAssinante() throws ParseException{ //Faz a leitura do arquivo de assiantes, e instancia os assinantes
        
        String conteudo = arquivo.carregaArquivo("assinantes.txt"); // 'conteudo' recebe todo conteudo do arquivo assinante
        Assinante assinante;
        
            int j = 0;

            if(!conteudo.isEmpty()){

                while(!conteudo.split(";")[j].equals("|")){// quando o texto chegar ao '|' significa que o arquivo acabou
                    
                    int id = Integer.parseInt(conteudo.split(";")[j++]);
                    String nome = conteudo.split(";")[j++];                    
                    String tipo = conteudo.split(";")[j++];                    
                    int qtdMensagem = Integer.parseInt(conteudo.split(";")[j++]);                    
                    long data = Long.parseLong(conteudo.split(";")[j++]); 
                    
                    assinante = factory.novoAssinante(id, nome, tipo, qtdMensagem, data);// retorna a instancia de assinante
                    gerente.addAssinante(assinante);// adiciona o assinante na classe GErenciAssiannte
                    cs.addObserver(assinante);// adiciona o acinante na centraSubject
                    
                }
            }
        
    }
    
    
    
    public boolean inserirAssinante(int id, String nome, String tipo) throws ParseException{// Insere novo assinante
        
        if(gerente.existeAssinante(id)){// verifica a existência do assinante
            return false;
        }else{// se o assinante não existe instancia novo assiante
            Assinante assinante = factory.novoAssinante(id, nome, tipo, 0 , 0);
            cs.addObserver(assinante); // adiciona assinante na central subject
            gerente.addAssinante(assinante); // adicciona no vo assinante a classe GerenciAssinante
            this.gravarPrograma();//grava os dados de assiannte no arquivo

            return true;
        }
    
    }
    
    
    public String ranckingAssinantes(){ // retrona o rancking de assinante com todos os seus dados
        gerente.pontuar(regras.getPrazoVIP(), regras.getPtDataVIP(), regras.getPtPremium(), regras.getPtVIP());// atribui a pontuação para cada assinante
        cs.notifyObserverC();// atualiza a categgoria de cada assinante
        return gerente.getRancking(); // recebe o rancking de GerenciarAssinante e retorna para quem o chamou
    
    }
    
    public String encontraNome(int id){ // encontra o nome do assinante e retorna
        String nome = gerente.encontraNomeAssinante(id);
        return nome;
    }
    
    public boolean encontraAssinante(int id){ // retorna se assinante existe ou não
        boolean check = gerente.existeAssinante(id);
        
        if(check){
            return check;
        }
        return false;
    }
    
    public void enviarMensagem(int id, String msg){ // envia mensagem recebida para todos os assinantes 
        
        Assinante assinante = gerente.getInstanciaAssinante(id);
        
        cs.notifyObserverM(msg);// notifica todos os assiantes da mensagem recebida
        
        assinante.setQtdMensagem();// incrementa a quantidade de mensagens do assinante
        
        this.gravarPrograma(); // atualiza o arquivo de assinantes
    }
    
    public void gravarPrograma(){// grava todos os dados de assinantes no arquivo de assinantes
        
        ArrayList<Assinante> assinanteArray = gerente.getArrayAssinantes();
        
        String iteracao;
        String persiste = "";
        for (Assinante assinante : assinanteArray) {
            iteracao = assinante.getDados();
            persiste +=iteracao;
        }
        
        persiste = persiste+"|;";
        arquivo.gravaAssinantes(persiste);

    }
    
    public int getLimiteCarac(int id){ // obtem o limite de caracteres de cada assinante e retorna  para quem o chamou
        Assinante assinante = gerente.getInstanciaAssinante(id);
        
        if(assinante == null){
            return 0;
        } 
        
        switch (assinante.getTipo()) {
            case "Free":
                return regras.getCaracFree();
            case "Premium":
                return regras.getCaracPremium();
            case "VIP":
                return regras.getCaracVIP();
            default:
                return 0;
        }
        
    }
    
      
}
