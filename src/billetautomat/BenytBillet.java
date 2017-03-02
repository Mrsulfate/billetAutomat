/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;
import java.util.ArrayList;

/**
 *
 * @author Bruger
 */
public class BenytBillet {
    ArrayList<Billet> kurve = new ArrayList<Billet>();
    
    public void makeBillet(int t, int z)
    {
        Billet blt = new Billet(t,z);
        kurve.add(blt);
    }
    
    public void seKurve()
    {
        
    }
}
