package br.edu.ifg.formosa.obac.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ScaleView extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long escala;
	
	public ScaleView(){
		this.setLayout(null);
		
		//this.setOpaque(false);
	}
	
	public void alteraEscala(long pontoFinal){
		escala = pontoFinal;
		repaint();		
	}
	
	@Override
	public void paint(Graphics g) {
		//if(desenhaEscala){
			g.setColor(Color.white);
			g.drawLine(0, 50, 600, 50);
			g.drawString("|", 50, 55);
			g.drawString("|", 175, 55);
			g.drawString("|", 300, 55);
			g.drawString("|", 425, 55);
			g.drawString("|", 550, 55);
			
			g.drawString("0", 50, 70);
			g.drawString(""+(escala*0.25), 175, 70);
			g.drawString(""+(escala*0.5), 300, 70);
			g.drawString(""+(escala*0.75), 425, 70);
			g.drawString(""+(escala), 550, 70);
			//desenhaEscala = false;
		//}
		
	}
	
}
