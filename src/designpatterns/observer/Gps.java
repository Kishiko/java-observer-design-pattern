
package designpatterns.observer;

import interfaces.Observable;
import interfaces.Observateur;
import java.util.ArrayList;

public class Gps implements Observable
{
    private String positionnement;
    private int precision;
    private ArrayList observateurs;
    
    public Gps()
    {
        this.positionnement = "Inconnu";
        this.precision = 0;
        this.observateurs = new ArrayList();
    }
    
    @Override
    public void ajouter(Observateur o)
    {
        this.observateurs.add(o);
    }
    
    @Override
    public void ajouter(ArrayList<Observateur> o)
    {
        o.forEach((_item) -> 
        {
            this.observateurs.add(o);
        });
    }
    
    @Override
    public void supprimer(Observateur o)
    {
        this.observateurs.remove(o);
    }
    
    @Override
    public void notifier()
    {
        int length = this.observateurs.size();
        
        for(int i=0; i<length; i++)
        {
            Observateur o = (Observateur) this.observateurs.get(i);
            o.actualiser(this); 
        }
    }
    
    public void setMesure(String positionnement, int precision)
    {
        this.positionnement = positionnement;
        this.precision = precision;
        this.notifier();
    }
    
    public String getPositionnement()
    {
        return this.positionnement;
    }
    
    public int getPrecision()
    {
        return this.precision;
    }
}
