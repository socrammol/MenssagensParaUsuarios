
package Model;

public interface Subject {
    
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserverM(String msg);
    public void notifyObserverC();
}
