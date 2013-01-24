package br.edu.ifg.formosa.obac.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Label;

import javax.swing.JPanel;

import br.edu.ifg.formosa.obac.utils.TransparentLabel;

public class InfoPanelView extends JPanel{
	
	
	public InfoPanelView(){
		this.setLayout(null);
		this.setSize(600, 40);
		this.setLocation(0, 0);
		this.setOpaque(false);
		//this.setBackground(Color.white);
		
		
		TransparentLabel lbGravity = new TransparentLabel("Gravidade:");
		lbGravity.setBounds(10, 3, 70, 20);
		this.add(lbGravity);
		
		TransparentLabel lbGravityValue = new TransparentLabel("1.1");
		lbGravityValue.setBounds(80, 3, 70, 20);
		this.add(lbGravityValue);
		
		TransparentLabel lbCoefAtrito = new TransparentLabel("Coef. Atrito:");
		lbCoefAtrito.setBounds(10, 20, 70, 20);
		this.add(lbCoefAtrito);
		
		TransparentLabel lbCoefAtritoValue = new TransparentLabel("1.1");
		lbCoefAtritoValue.setBounds(80, 20, 70, 20);
		this.add(lbCoefAtritoValue);
		
		TransparentLabel lbForçaAtrito = new TransparentLabel("Força Atrito:");
		lbForçaAtrito.setBounds(110, 3, 70, 20);
		this.add(lbForçaAtrito);
		
		TransparentLabel lbForçaAtritoValue = new TransparentLabel("1.1");
		lbForçaAtritoValue.setBounds(195, 3, 70, 20);
		this.add(lbForçaAtritoValue);
		
		TransparentLabel lbForçaNormal = new TransparentLabel("Forca Normal:");
		lbForçaNormal.setBounds(110, 20, 80, 20);
		this.add(lbForçaNormal);
		
		TransparentLabel lbForçaNormalValue = new TransparentLabel("1.1");
		lbForçaNormalValue.setBounds(110, 20, 80, 20);
		this.add(lbForçaNormalValue);
		
		TransparentLabel lbPosFinal = new TransparentLabel("Pos. Final:");
		lbPosFinal.setBounds(222, 3, 70, 20);
		this.add(lbPosFinal);
		
		TransparentLabel lbAceleração = new TransparentLabel("Aceleração:");
		lbAceleração.setBounds(222, 20, 80, 20);
		this.add(lbAceleração);
		
		TransparentLabel lbTempo = new TransparentLabel("Tempo:");
		lbTempo.setBounds(330, 3, 45, 20);
		this.add(lbTempo);
		
		
	}
	
	public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Color ppColor = new Color(0, 0, 0, 150); //r,g,b,alpha
        g.setColor(ppColor);
        g.fillRect(0,0,600,40); //x,y,width,height
    }    
	
}
