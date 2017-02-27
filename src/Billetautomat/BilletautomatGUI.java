/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
K1) Når en automat opstilles på en station skal installatøren kunne angive prisen per billet. 
Efter installation skal prisen være fast.
K2) Automaten skal kunne fortælle kunden hvad en billet koster.
K3) Automaten skal kunne udskrive en billet mærket med BT's logo.
K4) Automaten vil til enhver tid kunne vise kunden balancen, dvs hvor mange penge kunden har puttet i automaten.
*/
package Billetautomat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;
import java.util.Scanner;
/**
 *
 * @author Alexander
 */

public class BilletautomatGUI extends javax.swing.JFrame {
    
  
    
    public int valgtBilletPris;
 
    public int sum;
   
    public int betalt;
    
    public int betalt2;

    public int valgtAntal;
    
    public int tilbageBetaling;
    
    public int returBeløb;
    
    private ArrayList<String> transaktioner = new ArrayList<String>();
    
    
    
   
    /**
     * Creates new form BilletautomatGUI
     */
    public BilletautomatGUI() {
      
        
        System.out.println("Vælg billetpris");
      java.util.Scanner tastatur = new java.util.Scanner(System.in);
      valgtBilletPris = tastatur.nextInt();
      
        initComponents();
        billetprisGUI.setText(valgtBilletPris+"kr");
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        totalpris = new javax.swing.JTextField();
        billetprisGUI = new javax.swing.JTextField();
        antalGUI = new javax.swing.JTextField();
        købBillet = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        ønsketBetaling = new javax.swing.JTextField();
        manglendeBetaling = new javax.swing.JTextField();
        Betal = new javax.swing.JButton();
        indkastmønt = new javax.swing.JTextField();
        betaling = new javax.swing.JTextField();
        udskrivbillet = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 255));

        totalpris.setBackground(new java.awt.Color(204, 255, 255));

        billetprisGUI.setBackground(new java.awt.Color(204, 255, 255));

        antalGUI.setBackground(new java.awt.Color(204, 255, 255));
        antalGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antalGUIActionPerformed(evt);
            }
        });

        købBillet.setBackground(new java.awt.Color(204, 255, 255));
        købBillet.setText("Køb billet");
        købBillet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                købBilletActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(204, 255, 255));
        jTextField2.setText("Billetpris:  ");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(204, 255, 255));
        jTextField3.setText("Antal:");

        jTextField1.setBackground(new java.awt.Color(204, 255, 255));
        jTextField1.setText("Totalpris:");
        jTextField1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        ønsketBetaling.setBackground(new java.awt.Color(204, 255, 255));
        ønsketBetaling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ønsketBetalingActionPerformed(evt);
            }
        });

        manglendeBetaling.setBackground(new java.awt.Color(204, 255, 255));

        Betal.setBackground(new java.awt.Color(204, 255, 255));
        Betal.setText("Betal");
        Betal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BetalActionPerformed(evt);
            }
        });

        indkastmønt.setBackground(new java.awt.Color(204, 255, 255));

        betaling.setBackground(new java.awt.Color(204, 255, 255));

        udskrivbillet.setBackground(new java.awt.Color(204, 255, 255));
        udskrivbillet.setText("             ");
        udskrivbillet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                udskrivbilletActionPerformed(evt);
            }
        });

        jButton1.setText("Transaktioner");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(indkastmønt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(totalpris, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(antalGUI)
                                    .addComponent(betaling))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ønsketBetaling)
                                    .addComponent(udskrivbillet, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Betal, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(manglendeBetaling, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(billetprisGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                                .addComponent(købBillet))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(billetprisGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(købBillet, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(antalGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalpris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ønsketBetaling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manglendeBetaling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(udskrivbillet, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Betal)
                        .addComponent(indkastmønt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(betaling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    private void købBilletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_købBilletActionPerformed
    
          
      
        JFrame frame = new JFrame("InputDialog Example #1");
    
    // prompt the user to enter their name
        String antalInput = JOptionPane.showInputDialog(frame, "Vælg antal");
        valgtAntal = Integer.parseInt(antalInput);  
       
        
        prisBeregner(valgtAntal, valgtBilletPris);
        totalpris.setText(sum+"kr");
        antalGUI.setText(antalInput+"stk");
        ønsketBetaling.setText("Manglende betaling");
        manglendeBetaling.setText(sum-betalt+"kr");
        Betal.setText("Betal");
        indkastmønt.setText("Betal her");
        
        
                
         
      

    }//GEN-LAST:event_købBilletActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void antalGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antalGUIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_antalGUIActionPerformed

    private void ønsketBetalingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ønsketBetalingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ønsketBetalingActionPerformed

    private void BetalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BetalActionPerformed
     if (betalt != sum)
     {
      String betalt1;
      
        betalt1 = betaling.getText();     
        betalt2 = Integer.parseInt(betalt1);
        betalt = betalt + betalt2;
        manglendeBetaling.setText(sum-betalt+"kr");
        Date tid = new Date();
        transaktioner.add(tid + " Der blev indsat " + betalt1 + "kr"); 
     }
      
         if (betalt == sum || betalt > sum)
    {
       System.out.println("Betaling er opfyldt");
       tilbageBetaling = betalt-sum;
       betalt = sum;             
     manglendeBetaling.setText(0+"kr");
          udskrivbillet.setText("Udskrivbillet");
          Betal.setEnabled(false);
         
    }
         
         
        
    
    }//GEN-LAST:event_BetalActionPerformed

    private void udskrivTransaktioner()
    {
      for (String transaktion : transaktioner)
      {
          
      }
           System.out.println("Transaktioner pr: " + new Date());
           System.out.println(transaktioner);
       }
    private void udskrivbilletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_udskrivbilletActionPerformed
        if (sum == betalt)
        {
            System.out.println("hej");
            udskrivBillet();
        }
// JOptionPane.showMessageDialog(null, "Du får " +tilbageBetaling+ "kr tilbage" ); 
    }//GEN-LAST:event_udskrivbilletActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       udskrivTransaktioner();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
      
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BilletautomatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BilletautomatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BilletautomatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BilletautomatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BilletautomatGUI().setVisible(true);
            }
        });
    }
    
    public int prisBeregner(int antal, int billetPris)
    {
     sum=antal*billetPris;
     return sum;
     
    }
    
    public int manglendeBetaling(int totalPris, int betalt)
    {
       
        return betalt;
        
    }
    public void udskrivBillet() {
        for (int i = 0; i < valgtAntal; i++)
        {
		System.out.println("##########B##T#########");
		System.out.println("# BlueJ Trafikselskab #");
		System.out.println("#                     #");
		System.out.println("#        Billet       #");
		System.out.println("#        " + valgtBilletPris + " kr.       #");
		System.out.println("#                     #");
		System.out.println("##########B##T#########");
		if (sum != tilbageBetaling)
                {
                
                System.out.println("# Returbeløb " + tilbageBetaling + "kr returneres       #");
                }
		System.out.println("##########B##T#########");
		System.out.println();
                Date tid = new Date();
                transaktioner.add(tid + " Der blev udskrevet en billet");

        }
        Date tid = new Date();
        transaktioner.add(tid + " Kunden fik " + tilbageBetaling + "kr retur");
        udskrivbillet.setEnabled(false);
        
		//antalBilletterSolgt = antalBilletterSolgt + 1;
		//total = total + balance; // Opdater total med balance
		// balance = 0;              // Nulstil balance
	}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Betal;
    private javax.swing.JTextField antalGUI;
    private javax.swing.JTextField betaling;
    private javax.swing.JTextField billetprisGUI;
    private javax.swing.JTextField indkastmønt;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton købBillet;
    private javax.swing.JTextField manglendeBetaling;
    private javax.swing.JTextField totalpris;
    private javax.swing.JButton udskrivbillet;
    private javax.swing.JTextField ønsketBetaling;
    // End of variables declaration//GEN-END:variables


}
