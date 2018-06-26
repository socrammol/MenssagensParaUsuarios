
package Model;

public class Arquivo {

    
    private static Arquivo instanciaUnica;
    
    private static String txtRegras, txtDados;
    
    private Arquivo(){        
    }
    
    public static synchronized Arquivo getInstance() {
    
        if (instanciaUnica == null) {            
            instanciaUnica = new Arquivo();            
        }

        return instanciaUnica;
    }
    
    public static String getInfoRegras(){
        return txtRegras;
    }
    
    public static String getInfoDados(){
        return txtDados;
    }
    public void setInfoRegras(String txt){
        this.txtRegras = txt;
    }
    public void setInfoDados(String txt){
        this.txtDados = txt;
    }
}
