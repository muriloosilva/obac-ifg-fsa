package br.edu.ifg.formosa.obac.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EnvironmentView extends JPanel{
	
	private ImageIcon img;
	
	public EnvironmentView(ObjectView objectView){
		img = new ImageIcon("asfaltoreto.png");
		this.setLayout(null);
		this.setSize(600, 600);
		JLabel jLabel = new JLabel(img);
		jLabel.setBounds(0, 0, 600, 600);
		//this.add(jLabel);
		this.setLocation(200, 0);
		SurfaceView surface = new SurfaceView(objectView);
		
		surface.setBounds(0, 450, 600, 150);
		this.add(surface, 0);
		this.add(jLabel, 1);
		
		
	}
	
//	public void paint(Graphics g) {  
//        super.paint(g);  
//        if (img != null)  
//            g.drawImage(img, 0, 0, null, null);  
//    }  

}
