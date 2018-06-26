
package Model;

/**
 *
 * Essa classe mantém os dados do arquivo de regras para serem utilizadas no tempo de execução
 * implemente o padrão singleton para assugurar que haja somente uma intancia da classe
 */
public class Regras {
    
    private GerenciaArquivos arquivo = GerenciaArquivos.getInstancia();
    
    private int ptPremium;
    private int ptVIP;
    private int ptDataVIP;
    private int prazoVIP;
    private int caracFree;
    private int caracPremium;
    private int caracVIP;
    private int estrela1;
    private int estrela2;
    private int estrela3;
    private int estrela4;
    
    
    private static Regras Instancia;
    
    private Regras(){// quando instanciada a classe carrega as regras do aqruivo de regras nos atributos da classe, para
                    // serem utilizada em tempo de execução
        String conteudo = arquivo.carregaArquivo("regras.txt");
        
        this.ptPremium = (Integer.parseInt(conteudo.split(";")[0]));
        this.ptVIP = (Integer.parseInt(conteudo.split(";")[1]));
        this.ptDataVIP = (Integer.parseInt(conteudo.split(";")[2]));
        this.prazoVIP = (Integer.parseInt(conteudo.split(";")[3]));
        this.caracFree = (Integer.parseInt(conteudo.split(";")[4]));
        this.caracPremium = (Integer.parseInt(conteudo.split(";")[5]));
        this.caracVIP = (Integer.parseInt(conteudo.split(";")[6]));
        this.estrela1 = (Integer.parseInt(conteudo.split(";")[7]));
        this.estrela2 = (Integer.parseInt(conteudo.split(";")[8]));
        this.estrela3 = (Integer.parseInt(conteudo.split(";")[9]));
        this.estrela4 = (Integer.parseInt(conteudo.split(";")[10]));
        
    }

    
    public static Regras getInstancia() {
        if(Instancia == null){
            Instancia = new Regras();
        }
        return Instancia;
        
    }

    public int getPtPremium() {
        return ptPremium;
    }

    public int getPtVIP() {
        return ptVIP;
    }

    public int getPtDataVIP() {
        return ptDataVIP;
    }

    public int getPrazoVIP() {
        return prazoVIP;
    }

    public int getCaracFree() {
        return caracFree;
    }

    public int getCaracPremium() {
        return caracPremium;
    }

    public int getCaracVIP() {
        return caracVIP;
    }

    public int getEstrela1() {
        return estrela1;
    }

    public int getEstrela2() {
        return estrela2;
    }

    public int getEstrela3() {
        return estrela3;
    }
    
    public int getEstrela4() {
        return estrela4;
    }
    
    
 

    
}
