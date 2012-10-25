package br.edu.ifg.formosa.obac.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import br.edu.ifg.formosa.obac.models.Object;

import javax.swing.ImageIcon;

public class ObjectView extends Panel {
	
	private	ImageIcon imgCubo;
	private Object objeto;
		

	public ObjectView(Object objeto){
		
		this.objeto = objeto;

		//imgCubo = new ImageIcon("cubo.png");
		this.setLayout(null);
		this.setSize(600, 450);
		this.setBackground(Color.BLUE);
		this.setLocation(0, 0);		
	}
	
	public void repinta(){
		this.repaint();
	}
	
	public void paint(Graphics g){
		g.setColor(Color.black);
		g.fillRect((int)objeto.getMovimento()+50, 400, 50, 50);
		
	}
	
}
