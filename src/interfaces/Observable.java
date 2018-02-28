
package interfaces;

import java.util.ArrayList;

public interface Observable 
{
    public void ajouter(Observateur o);
    public void ajouter(ArrayList<Observateur> o);
    public void supprimer(Observateur o);
    public void notifier();
}
