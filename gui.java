package gui;

import javax.swing.JOptionPane;

 // @author MSI by okon0miyaki
 
public class GUI {

    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("What is your name ?");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Your age ?"));
        JOptionPane.showMessageDialog(null, "You're " + age + " Years Old");
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("How Tall you are?"));
        JOptionPane.showMessageDialog(null, "Your Height is " + height + " cm");
        
        JOptionPane.showMessageDialog(null, "See You Later !");
    }
    
}
