package br.edu.ifg.formosa.obac.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import br.edu.ifg.formosa.obac.models.Object;

import javax.swing.ImageIcon;

public class ObjectView extends Panel {
	
	private Image offScreenImage; // imagem auxiliar declarada na classe
	private	ImageIcon imgCubo;
	private Object objeto;

	public ObjectView(){
		//imgCubo = new ImageIcon("cubo.png");
		this.setLayout(null);
		this.setSize(600, 450);
		this.setBackground(Color.BLUE);
		this.setLocation(0, 0);
	}
	
	public void repinta(Object objeto){
		this.objeto = objeto;
		this.repaint();
	}
	
	public void paint(Graphics g){
	
		g.setColor(Color.black);
		if(objeto!=null)
			g.fillRect((int)objeto.getPosicaoAtual()+50, 400, 30, 30);
		else
			g.fillRect(50, 400, 30, 30);
		
	}
	
	   public void update( Graphics g ) 
	   { 
	     // Criar a imagem auxiliar e buscar o seu context gráfico
	     if( offScreenImage == null ) 
	     offScreenImage = createImage( getSize().width, getSize().height ); 
	     Graphics offScreenGraphics = offScreenImage.getGraphics(); 
	     // limpar a imagem auxiliar
	     offScreenGraphics.setColor( getBackground() ); 
	     offScreenGraphics.fillRect( 0, 0, getSize().width, getSize().height ); 
	     // pintar a imagem auxiliar
	     offScreenGraphics.setColor( g.getColor() ); 
	     paint( offScreenGraphics ); 
	     // transferir a imagem auxiliar para a tela
	     g.drawImage( offScreenImage, 0, 0, this ); 
	     offScreenGraphics.dispose(); 
	   } 
	
}
