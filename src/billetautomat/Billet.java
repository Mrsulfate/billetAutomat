/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

/**
 *
 * @author Bruger
 */
public class Billet {
    static int billetAntal;
    String type;
    int price;
    int zoner;
    
    public Billet(int t , int z)
    {
        if (t == 1)
        {
            type = "Adult";
            zoner = z;
            price = z*24;
        }
        else if (t == 2)
        {
            type = "Student";
            zoner = z;
            price = z*17;
        }
        else if (t == 3)
        {
            type = "Kid";
            zoner = z;
            price = z*12;
        }
        else if (t == 4)
        {
            type = "bike";
            zoner = z;
            price = 20;
        }
        else if (t == 5)
        {
            type = "baby";
            zoner = z;
            price = 0;
        }
    }
    
    String getType()
    {
        return type;
    }
    
    int getPrice()
    {
        return price;
    }
}
