/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evenentryloop;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class EvenEntryLoop {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


 int num = Integer.parseInt(JOptionPane.showInputDialog(    "Enter an even number or 999 to exit"));
 
 while (true) {
 if (num == 999){
      
      break;
  }
 
 else if (num % 2 == 0) {
                JOptionPane.showMessageDialog(null,"Good job!");
            } 
  else {
                JOptionPane.showMessageDialog(null,"Error, Please enter a even number.");
            }
  
 }
 
    }
}
    
    
