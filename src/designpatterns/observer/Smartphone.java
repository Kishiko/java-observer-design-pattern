
package designpatterns.observer;

import interfaces.Observable;

public class Smartphone implements interfaces.Observateur
{
    @Override
    public void actualiser(Observable o) 
    {
        if(o instanceof Gps)
        {
            String positionnement = ((Gps) o).getPositionnement();
            int precision = ((Gps) o).getPrecision();
            
            System.out.println("SMARTPHONE\n\tPosition: " + positionnement + "\n\tPrecision: " + precision + "\n");
        }
    }
}
