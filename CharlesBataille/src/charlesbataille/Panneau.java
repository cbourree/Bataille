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
        text.setText("<html><h1 style=\"font-size:50px;margin-left:20px;\">Bienvenue</h1>"
                + "<div style=\"text-align:justify;margin:20px;\"><span style=\"background-color:red;margin-top:100px;\">Bienvenue</span>sur Bataille Navale Online<br />"
                + "ici beaucoup de texte pour voire ce que ça donne... osder+ \"ici beaucoup de texte pour"
                + " voire ce que ça donne... osder+ \"ici beaucoup de texte pour voire ce que ça donne... osder+ "
                + "+ \"ici beaucoup de texte pour voire ce que ça donne... osder+ \"ici beaucoup de texte pour voire "
                + "ce que ça donne... osder+ \"ici beaucoup de texte pour voire ce que ça donne... osder\"ici beaucoup"
                + "+ \"ici beaucoup de texte pour voire ce que ça donne... osder"
                + "+ \"ici beaucoup de texte pour voire ce que ça donne... osder"
                + "+ \"ici beaucoup de texte pour voire ce que ça donne... osder de texte pour voire ce que ça donne... osder"
                + "</div></html>");
        text.setFont(font_text);
        text.setBackground(new Color(0, 0, 0, 175)); 
        text.setBounds(100, 100, this.getWidth() - 500, 500);       
        text.setOpaque(true);
        
        pan_menu.add(text);  
        
    }      


}
