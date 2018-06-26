
package Model;

import java.util.ArrayList;
import java.util.Iterator;

public class CentralSubject implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private Regras regras = Regras.getInstancia();
    
    public void addObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObserverM(String msg){// esse método envia a mensagem para todos os assinantes
    
        Iterator<Observer> it = observers.iterator();
        
        while(it.hasNext()){
            Observer obs = it.next();
            obs.updateMensagem(msg);
        
        }
    }
    
    public void notifyObserverC(){// esse método atualiza a categoria do assinante de acordo com sua pontuação
    
        Iterator<Observer> it = observers.iterator();
        
        while(it.hasNext()){
            Observer obs = it.next();
            // a pontuação para cada categoria é pega no arquivo de regras, se o usuário tiver acima de 200 pontos ele é 5 estrelas
            if(obs.getPontuacao() < regras.getEstrela1()) obs.updateCategoria("1 Estrela");
            else if(obs.getPontuacao() < regras.getEstrela2()) obs.updateCategoria("2 Estrelas");
            else if(obs.getPontuacao() < regras.getEstrela3()) obs.updateCategoria("3 Estrelas");
            else if(obs.getPontuacao() < regras.getEstrela4()) obs.updateCategoria("4 Estrelas");
            else obs.updateCategoria("5 Estrelas");
        
        }
    }
    
}
