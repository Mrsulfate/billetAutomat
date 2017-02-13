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
                System.out.println("Arraystørrelse"+personer.size());
                while (antalPersoner<personer.size())
                {
		String navn = JOptionPane.showInputDialog(frame1, "Vælg navn");
                // String navn1 = JOptionPane.showInputDialog(frame1, "Vælg navn");
                // String navn2 = JOptionPane.showInputDialog(frame1, "Vælg navn");
                for (int i =0; i<antalPersoner; i++)
                {
                personer.add(navn);
		
                }
                
                System.out.println("hje");
                
		ArrayList<String> handlinger = new ArrayList<String>();
		handlinger.add("er den vildeste");
		handlinger.add("holder ud");
		handlinger.add("har det for sygt");
                handlinger.add("har været ude for en spirituel opvågning");
                handlinger.add("kan godt lide peanut butter");
                
               
                
                
                
               
                
		for (int i=0; i<5; i++) {
			
			int personNummer = (int) (Math.random()*antalPersoner); // giver 0-2
			String person = personer.get( personNummer );
			String handling = handlinger.get( (int)(Math.random()*handlinger.size()));
			System.out.println(person + " " + handling);
    }
  }
}