
package Model;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

/*
Essa classe contém uma série de métodos que manipulam um arraylist de assinantes
*/
public class GerenciaAssinantes{
    
    private ArrayList<Assinante> assinanteArray = new ArrayList();      
    
    
    public void addAssinante(Assinante novoAsssinante){ // Adiciona novo assinante ao array   
        assinanteArray.add(novoAsssinante);
        
    }
    
    
    public void pontuar(int prazo, int ptData, int ptPremium, int ptVIP){// atribui pontuação aos assinante VIP e Premium
    
        for(Assinante assinante : assinanteArray){
            
            if(assinante.getTipo().equals("VIP")){
                int pontuacao = this.calculaDias(assinante, prazo, ptData);
                pontuacao = pontuacao + (assinante.getQtdMensagem() *  ptVIP);
                assinante.setPontuacao(pontuacao);
                
            }else if(assinante.getTipo().equals("Premium")){
                int pontuacao = (assinante.getQtdMensagem() *  ptPremium);
                assinante.setPontuacao(pontuacao);
            }
        
        } 
    }
    
    public String getRancking(){// Retorna uma série de dados dos assinantes ordenados
        
        
        Collections.sort(assinanteArray); // ordena o arraylist de acordo com a pontuação
        
        String iteracao = "";
        String assinantes = "RG(ID)   |NOME |MENSAGENS |PONTOS |CLASSIFICAÇÃO \n\n";
        for (Assinante assinante : assinanteArray) {
            iteracao = assinante.getId()
                    + "   |" + assinante.getNome()
                    + "  |" + assinante.getQtdMensagem()
                    + "  |"+ assinante.getPontuacao() 
                    + "  |" + assinante.getCategoria() + "\n";
            
            assinantes +=iteracao;
        }
        return assinantes; // retorna todos os dados dde todos os assinantes para quem o chamou
    }
    
    
    public boolean existeAssinante(int id){//verifica a existência de um assinante através de seu ID
        for (Assinante assinante : assinanteArray) {
            if (assinante.getId() == id) {
                return true;
            }
        }
        return false;
    }
    
    public String encontraNomeAssinante(int id){// encontra e retorna o nome do assinante procurando pelo seu ID
        
        for (Assinante assinante : assinanteArray) {
            if (assinante.getId() == id) {
                return assinante.getNome();
            }
        }
        return null;
    }
    
    public Assinante getInstanciaAssinante(int id){// retorna uma instancia do assinante procurando pelo seu id
        
        for (Assinante assinante : assinanteArray) {
            if (assinante.getId() == id) {
                
                return assinante;
            }
        }
        return null;
    }
    
    
    
    public ArrayList getArrayAssinantes(){ // retorna o array de assinantes
        
        return assinanteArray;  
    }
        
    public int calculaDias(Assinante assinante, int prazo, int ptData){//calcula o tempo em dias que o assinantes VIP tem
        Calendar hoje = Calendar.getInstance();                        //retorna a pontuação do aswsinante VIP de acordo com seu prazo
        int pontuacao = 0;
        
        long dia = (hoje.getTimeInMillis() - assinante.getData())/86400000;
        
        int i = 0;
        
        while(i < dia){
            
            pontuacao += ptData; 
            i += prazo;
            
        }
        
        return pontuacao;
        
    }
    
    
     
}
