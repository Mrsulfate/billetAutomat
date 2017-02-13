package Uge3;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Eventyr
{
	public static void main(String[] arg)
	{
                JFrame frame = new JFrame("InputDialog Example #1");
                JFrame frame1 = new JFrame("InputDialog Example #2");
                String antal = JOptionPane.showInputDialog(frame, "Vælg antal personer der skal være med i eventyret");
                int antalPersoner = Integer.parseInt(antal);  
            
		ArrayList<String> personer = new ArrayList<String>(); // liste af strenge
                
                for (int i =0; i<antalPersoner; i++)
                {
                String navn = JOptionPane.showInputDialog(frame1, "Vælg navn");
                personer.add(navn);
                }
                int randomperson = (int) (Math.random()*antalPersoner);
		ArrayList<String> handlinger = new ArrayList<String>();
		handlinger.add("er den vildeste");
		handlinger.add("holder ud");
		handlinger.add("har det for sygt");
                handlinger.add("har været ude for en spirituel opvågning");
                handlinger.add("kan godt lide peanut butter");
                //handlinger.add("holder meget af " + personer.get(randomperson));
                handlinger.add("holder meget af " + personer.get((int)(Math.random()*antalPersoner)));
                      
                // handlinger.add(personer.get(randomperson)) + "holder");
		for (int i=0; i<6; i++) {
			
			int personNummer = (int) (Math.random()*antalPersoner); // giver 0-2
			String person = personer.get( personNummer );
                        int hej = (int)(Math.random()*handlinger.size());
			String handling = handlinger.get(hej);
			System.out.println(person + " " + handling);
                        //handlinger.remove((int)(Math.random()*handlinger.size()));
                        handlinger.remove(hej);
                         
    }
                
  }
}