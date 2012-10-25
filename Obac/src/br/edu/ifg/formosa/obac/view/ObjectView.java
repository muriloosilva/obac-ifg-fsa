package br.edu.ifg.formosa.obac.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;

import javax.swing.ImageIcon;

public class ObjectView extends Panel {
	
	private	ImageIcon imgCubo;
		

	public ObjectView(){

		//imgCubo = new ImageIcon("cubo.png");
		this.setLayout(null);
		this.setSize(600, 450);
		this.setBackground(Color.BLUE);
		this.setLocation(0, 0);		
	}
	
	public void paint(Graphics g){
		g.setColor(Color.black);
		g.fillRect(50, 400, 50, 50);
		
	}
	
}
