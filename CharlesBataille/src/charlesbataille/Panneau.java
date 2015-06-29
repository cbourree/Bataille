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

import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.dnd.DropTarget;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
    
    public JPanel pan_menu = new JPanel();
    Bouton bouton_jouer = new Bouton("Jouer");
    Bouton_credits bouton_credits = new Bouton_credits("Crédits");
    Font font = new Font("Courier", Font.BOLD, 70);
    JLabel text = new JLabel();
    Font font_text = new Font("Courier", Font.BOLD, 20);
    JLabel titre = new JLabel();
    Font font_titre = new Font("Courier", Font.BOLD, 50);
    
    @Override
    public void paintComponent(Graphics g){
        this.setLayout(new BorderLayout());
        //Image de fond
        try {
            Image img = ImageIO.read(new File("space.jpg"));
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
        } catch (IOException e) {
            System.out.println("Impossible de charger l'image de fond :");
            e.printStackTrace();
        }
        //Label        
        g.setFont(font);
        g.setColor(Color.white);          
        g.drawString("SPACE", this.getWidth() - 280,  120);
        
        pan_menu.add(bouton_jouer);

        bouton_jouer.setBounds(this.getWidth() - 280, 200, 150, 100);
        
        pan_menu.add(bouton_credits);
        bouton_credits.setBounds(this.getWidth() - 280, 300, 170, 100);
        this.add(pan_menu, CENTER);
        pan_menu.setOpaque(false);
        pan_menu.setBackground(new Color(0,true));
        
        text.setForeground(new Color(255,255, 255));
        text.setText("Bienvenue sur Bataille Navale Online\n");
        text.setText("Ici un petit message de règle ou ...");
        text.setFont(font_text);
        text.setBounds(100, 0, 500, 500);       
        pan_menu.add(text);
        titre.setForeground(new Color(255,255, 255));
        titre.setText("Bievenue");
        titre.setFont(font_titre);
        titre.setBounds(100, 100, 500, 40);       
        pan_menu.add(titre);
        
    }      


}
