
package Model;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class GerenciaArquivos {
    
    private static GerenciaArquivos Instancia;
    
    private GerenciaArquivos(){
    }
    
    public static GerenciaArquivos getInstancia(){ // implementa o padrão singleton para garantir qeu haja somente um instancia
        if(Instancia == null){
            Instancia = new GerenciaArquivos();
        }
        
        return Instancia;
    }
    
    public String carregaArquivo(String path){// faz a leitura do arquivo de assinantes e retorna o conteudo do arquivo 
        String conteudo = "";
        
        try{
            FileReader arq = new FileReader(path);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try{
                linha = lerArq.readLine();
                while(linha != null){
                    conteudo += linha;
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            }catch(IOException ex){
                return "";
            }
        }catch(IOException e){
            return "";
        }
      
    }
    
    public void gravaAssinantes(String persiste){ // grava no arquivo assinantes os dados recebidos de quem o chamou
        try{
            FileWriter arq = new FileWriter("assinantes.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(persiste);
            gravarArq.close();
            
        }catch(IOException e){
            
        }
    }
    
    
}
