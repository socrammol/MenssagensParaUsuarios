
package Model;

import java.util.ArrayList;
import java.util.Iterator;

public class CentralSubjectMsg implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    
    public void addObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObserver(String update){
    
        Iterator<Observer> it = observers.iterator();
        
        while(it.hasNext()){
            Observer obs = it.next();
            obs.updateRecurso(update);
        
        }
    }
}
