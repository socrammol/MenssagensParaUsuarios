/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mmol
 */
public  class Singleton {
    private static  Singleton Instancia;


    public static Singleton getInstancia() {
        if(Instancia == null){
            Instancia = new Singleton();
        }
        return Instancia;
        
    }
    

    
    
}
