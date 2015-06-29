/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charlesbataille;

/**
 *
 * @author François
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Fenetre extends JFrame {

    private Panneau container = new Panneau();
    
    
    public Fenetre(){     
        this.setTitle("Bataille Navale");
        this.setSize(1236, 700);
        this.setMinimumSize(new Dimension(1000, 700));
        this.setLocationRelativeTo(null);               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(container);      
        this.setVisible(true);
        build();
    }     

    public void build() {
        
    }  
}
