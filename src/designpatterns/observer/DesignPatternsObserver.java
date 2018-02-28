
package designpatterns.observer;

public class DesignPatternsObserver 
{
    public static void main(String[] args) 
    {
        Smartphone smartphone = new Smartphone();
        Ordinateur ordinateur = new Ordinateur();
        
        Gps gps = new Gps();
        gps.ajouter(smartphone);
        gps.ajouter(ordinateur);
        
        gps.setMesure("Lubumbashi", 0);
        gps.setMesure("Kinshasa", 1);
        gps.setMesure("Kisangani", 3);
    }
    
}
