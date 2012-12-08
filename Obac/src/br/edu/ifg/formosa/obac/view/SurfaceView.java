package br.edu.ifg.formosa.obac.view;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JPanel;

import br.edu.ifg.formosa.obac.models.Object;

public class SurfaceView extends JPanel{
	
	private long escala=100;
	private Image offScreenImage; //imagem auxiliar declarada na classe
	private Object objeto;
	private boolean ver = false;
	private boolean desenhaEscala = true;
	
	public SurfaceView(ScaleView scaleView){
		this.setLayout(null);
		//objectView.setBounds(50, 0, 30, 30);
		//this.add(objectView);
		scaleView.setBounds(0, 100, 600, 50);
		this.add(scaleView);
		//this.setBackground(Color.blue);
		this.setOpaque(false);
	}
	
	public void repinta(Object objeto){
		this.objeto = objeto;
		this.ver = true;
		//this.repaint();
		//this.setBounds((int)objeto.getPosicaoAtual()+50, 0, 30, 30);
		//this.setLocation((int)objeto.getPosicaoAtual()+50, 0);
		this.repaint();
	}
	
//	public void alteraEscala(long pontoFinal){
//		desenhaEscala = true;
//		escala = pontoFinal;
//		repaint();		
//	}
	
	@Override
	public void paint(Graphics g) {
		
		//super.paint(g);
		g.setColor(Color.BLACK);
		if(ver){
			g.fillRect((int)objeto.getPosicaoAtual()+50, 0, 30, 30);
		}
		else{
			g.fillRect(50, 0, 30, 30);
			ver = true;
		}
	
//		if(desenhaEscala){
//			g.setColor(Color.white);
//			g.drawLine(0, 50, 600, 50);
//			g.drawString("|", 50, 55);
//			g.drawString("|", 175, 55);
//			g.drawString("|", 300, 55);
//			g.drawString("|", 425, 55);
//			g.drawString("|", 550, 55);
//			
//			g.drawString("0", 50, 70);
//			g.drawString(""+(escala*0.25), 175, 70);
//			g.drawString(""+(escala*0.5), 300, 70);
//			g.drawString(""+(escala*0.75), 425, 70);
//			g.drawString(""+(escala), 550, 70);
//			desenhaEscala = false;
//		}
		
	}

	
	public void update(Graphics g){ 
	     // Criar a imagem auxiliar e buscar o seu context gráfico
	     if(offScreenImage == null) 
	    	 offScreenImage = createImage( getSize().width, getSize().height ); 
	     	Graphics2D offScreenGraphics = (Graphics2D)offScreenImage.getGraphics();
	     	offScreenGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	     	offScreenGraphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.1f));
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
