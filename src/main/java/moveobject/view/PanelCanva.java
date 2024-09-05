/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moveobject.view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author fegem
 */
public class PanelCanva extends JPanel{
    
    private int x;
    private int y;
    
    public PanelCanva(){
        
        this.x=20;
        this.y=20;
        
    }
    
    @Override
    protected void paintComponent(Graphics g){
        
        super.paintComponent(g);
        g.setColor(Color.black);
        
        g.fillOval(this.x, this.y, 50, 40);
        g.fillRect(40, 100, 40, 60);
        
        
        
    }
    
}
