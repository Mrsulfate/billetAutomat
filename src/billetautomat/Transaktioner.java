/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billetautomat;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruger
 */
public class Transaktioner 
{
    public Date tid;
    public String beskrivelse;
    public int currentBalance;
    public int money;
    
    public Transaktioner(Date t, String beskr)
    {
        tid = t;
        beskrivelse = beskr;
    }
    
    public Transaktioner(Date t, String beskr, int crBal)
    {
        tid = t;
        beskrivelse = beskr;
        currentBalance = crBal;
    }
    
    public Transaktioner(Date t, String beskr, int crBal, int am) //Adding money
    {
        tid = t;
        beskrivelse = beskr;
        money = am;
        currentBalance = crBal;
    }
    
}
