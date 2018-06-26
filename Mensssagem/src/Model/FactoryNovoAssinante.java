/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.V;

/**
 *
 * @author mmol
 */
public class FactoryNovoAssinante{

   
    public Assinante novoAssinante(int id , String nome, String tipo, int qtdMensagem, long data) throws ParseException{
        if (tipo.equals ("Free"))
            return new Assinante_Free(id ,nome, qtdMensagem);
        if (tipo.equals("Premium"))
            return new Assinante_Premium(id ,nome, qtdMensagem);
        if (tipo.equals("VIP"))
            return new Assinante_Vip(id ,nome, qtdMensagem, data);
        return null;
        
    }

    
    
}
