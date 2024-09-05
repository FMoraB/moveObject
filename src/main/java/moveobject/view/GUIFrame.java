/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moveobject.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author fegem
 */
public class GUIFrame extends JFrame {

    private JButton btnMove;
    //private JPanel jpanelCanva;
    private PanelCanva lienzo;
    
    public GUIFrame() {
            
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        this.btnMove = new JButton("Hola ke ace");
        this.add(this.btnMove, BorderLayout.SOUTH);
        
        //this.jpanelCanva = new JPanel();
        //this.jpanelCanva.setBackground(Color.blue);
        
        //this.add(this.jpanelCanva, BorderLayout.CENTER);
        
        lienzo = new PanelCanva();
        
        this.lienzo.setBackground(Color.blue);
        this.add(this.lienzo, BorderLayout.CENTER);
        
        
    }
    
   
    
    
}
