
package Model;

import java.util.Calendar;

/**
* A classe assinante é mãe dos 3 tipos de assinanteS e implenta a interface Observer para atualizar
* enviar as mensagens e atualizar a maturidade de cada assinante. Implementa também a interface Comparable para ordenar
* o arraylist para o rancking.
 */
public abstract class Assinante implements Comparable<Assinante>, Observer {
    private Calendar atual = Calendar.getInstance();
    
    protected int id; 
    protected String nome;
    protected int pontuacao;
    protected int qtdMensagem;
    protected String mensagem;
    protected String tipo;
    protected long data;
    protected String categoria; 
    
    
    public int getQtdMensagem() {
        return qtdMensagem;
    }

    public void setQtdMensagem() {
        this.qtdMensagem++;
    }
    
    public void setPontuacao(int pontuacao){
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }
    
    public String getMensagem(){
        return this.mensagem;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
    
    public long getData(){
        return data;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    public String getDados(){//Esse método retornas oa dados para serem armazenados no Arquivo assinantes
        String dados;
        
        dados = this.getId()+";"+
                this.getNome()+";"+
                this.getTipo()+";"+
                this.getQtdMensagem()+";"+
                this.getData()+";";
        
        return dados;
                
    }
    
    @Override
     public void updateMensagem(String msg){//esse método atualiza a mensagem
        this.mensagem = " " + this.nome +", nova mensagem: " + msg;
        
     }
     
    @Override
     public void updateCategoria(String categoria){// esse método atualiza a categoria
        this.categoria = categoria;
        
    }
    
     
    @Override
     public int compareTo(Assinante outroAssinante){// este método serve para auxiliar a ordenação do arraylist através da pontuação
            
            if(this.getPontuacao() < outroAssinante.getPontuacao()){
                return 1;
            }else if (this.getPontuacao() > outroAssinante.getPontuacao()){
                return -1;
            }else{
                return 0;
            }
        
        
    }
    
}
