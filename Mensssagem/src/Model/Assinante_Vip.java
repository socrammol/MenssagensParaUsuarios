/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * 
 */
public class Assinante_Vip extends Assinante {
     
    
     Assinante_Vip(int id, String nome, int qtdMensagem, long data) throws ParseException{
        this.tipo = "VIP"; 
        this.id = id;
        this.nome = nome ;
        
        if(qtdMensagem > 0){ 
            this.qtdMensagem = qtdMensagem; //  se o assinante já existe vai receber a quantidade de mensagens que foi armazenada
        }else{
            this.qtdMensagem = 0;
        }
        
        if(data == 0){
            Calendar atual = Calendar.getInstance();
            this.data = atual.getTimeInMillis(); // se o assinante é novo ele recebe a quantidade de milisegundos correspondete à sua data de cadastro
        }else{
            this.data = data;
        }
     }

    
}
