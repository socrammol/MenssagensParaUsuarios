/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * 
 */
public class Assinante_Free  extends Assinante{

    
    Assinante_Free(int id, String nome, int qtdMensagem) {
        this.tipo = "Free";
        this.nome = nome;
        this.id = id;
        this.data = 0;
        this.categoria = "Sem Categoria";
        
        if(qtdMensagem > 0){ 
            this.qtdMensagem = qtdMensagem;
        }else{
            this.qtdMensagem = 0;
        }
    }
    
    @Override
    public void updateCategoria(String Categoria){
        //O metodo sobreescreve a categoria, pois assinante freee não pontua
    }
    
    @Override
    public void setPontuacao(int pontuacao){
        //O metodo sobreescreve a categoria, pois assinante freee não pontua
    }
}
