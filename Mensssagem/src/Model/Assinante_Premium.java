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
public class Assinante_Premium extends Assinante {
    
     Assinante_Premium(int id ,String nome, int qtdMensagem){
        this.tipo = "Premium";
        this.nome = nome ;
        this.id = id;
        this.data = 0;
        
        if(qtdMensagem > 0){ 
            this.qtdMensagem = qtdMensagem;
        }else{
            this.qtdMensagem = 0;
        }
     }
    
}
