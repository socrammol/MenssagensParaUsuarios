
package Model;

import java.text.ParseException;

/**
 *
 * @author PEM
 */
public class FactoryCarregaAss {
    
    public Assinante novoAssinante(int id , String nome, String tipo, int qtdMensagem, int pontuacao) throws ParseException{
        if (tipo.equals ("Free"))
            return new Assinante_Free(id ,nome, qtdMensagem, pontuacao);
        if (tipo.equals("Premium"))
            return new Assinante_Premium(id ,nome, qtdMensagem, pontuacao);
        if (tipo.equals("VIP"))
            return new Assinante_Vip(id ,nome, qtdMensagem, pontuacao);
        return null;
        
    }
    
}
