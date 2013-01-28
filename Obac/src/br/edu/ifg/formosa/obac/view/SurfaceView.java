package br.edu.ifg.formosa.obac.view;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JPanel;

import br.edu.ifg.formosa.obac.models.Object;

public class SurfaceView extends JPanel{
	
	public final static long pontoFinalEscalaDefault = 100;
	public static long pontoFinalEscala = 100;
	private Image offScreenImage; //imagem auxiliar declarada na classe
	private Object objeto;
	private boolean ver = false;
	private boolean desenhaEscala = true;

	public static final int posObjetoDown = 450;
	public static final int posObjetoUp = 170;
	public static final int escalaUp = 1;
	public static final int escalaDown = 2;
	public static final int poslinhaEscalaDown =  525;
	private static final int poslinhaEscalaUp = 550;
	private static final int posTracoEscalaDown = 530;
	private static final int posTracoEscalaUp = 555;
	private static final int posTextoEscalaDown = 550;
	private static final int posTextoEscalaUp = 575;
	private static final int posTextoDown = 520;
	private static final int posTextoUp = 545;
	
	private int posObjetoY = posObjetoDown;
	private int posLinhaEscalaY = poslinhaEscalaDown;
	private int posTracoEscalaY = posTracoEscalaDown;
	private int posTextoEscalaY =  posTextoEscalaDown;
	private int posTextoY = posTextoDown;
	
	public SurfaceView(ScaleView scaleView){
		this.setLayout(null);
		//objectView.setBounds(50, 0, 30, 30);
		//this.add(objectView);
		scaleView.setBounds(0, 50, 600, 400);
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
	
	public void alteraPontosEscala(long pontoFinal){
		desenhaEscala = true;
		pontoFinalEscala = pontoFinal;
		repaint();		
	}
	
	public void setPosObjetoY(int posicao){
		posObjetoY = posicao;
		if(objeto!=null){
			objeto.setPosicaoAtualY(0);
		}
	}
	
	public void resetPosObjetoX(){
		if(objeto!=null){
			objeto.setPosicaoAtual(0);
		}
		
	}
	
	public void setPosEscalaY(int posicao){
		if(posicao == escalaUp){
			posLinhaEscalaY = poslinhaEscalaUp;
			posTracoEscalaY = posTracoEscalaUp;
			posTextoEscalaY = posTextoEscalaUp;
			posTextoY = posTextoUp;
		}
		else{
			posLinhaEscalaY = poslinhaEscalaDown;
			posTracoEscalaY = posTracoEscalaDown;
			posTextoEscalaY = posTextoEscalaDown;
			posTextoY = posTextoDown;
		}
	}
	
	@Override
	public void paint(Graphics g) {
		
		//super.paint(g);
		g.setColor(Color.BLACK);
		if(ver && objeto!=null){
			g.fillRect((int)objeto.getPosicaoAtual()+50, (int)(posObjetoY + objeto.getPosicaoAtualY()), 30, 30);
		}
		else{
			g.fillRect(50, posObjetoY, 30, 30);
			ver = true;
		}
	

		g.setColor(Color.white);
		Font estiloFonte = new Font("Arial", Font.BOLD, 14);
		Font estiloFonteMetros = new Font("Arial", Font.PLAIN, 10);
		g.setFont(estiloFonte);
		g.drawLine(0, posLinhaEscalaY, 600, posLinhaEscalaY);
		g.drawString("|", 50, posTracoEscalaY);
		g.drawString("|", 175, posTracoEscalaY);
		g.drawString("|", 300, posTracoEscalaY);
		g.drawString("|", 425, posTracoEscalaY);
		g.drawString("|", 550, posTracoEscalaY);
		
		g.drawString("0", 50, posTextoEscalaY);
		g.drawString(""+(pontoFinalEscala*0.25), 175, posTextoEscalaY);
		g.drawString(""+(pontoFinalEscala*0.5), 300, posTextoEscalaY);
		g.drawString(""+(pontoFinalEscala*0.75), 425, posTextoEscalaY);
		g.drawString(""+(pontoFinalEscala), 550, posTextoEscalaY);
		g.setFont(estiloFonteMetros);
		g.drawString("(metros)", 560, posTextoY);
		
		if(posLinhaEscalaY == poslinhaEscalaUp){
			g.setFont(estiloFonte);
			double pontoFinalEscalaPlaneCliff = (pontoFinalEscala*30)/100;
			g.setColor(Color.white);
			g.setFont(estiloFonte);
			g.drawLine(0, 210, 200, 210);
			g.drawString("|", 50, 215);
			g.drawString("|", 200, 215);
			
			g.drawString("0", 50, 235);
			g.drawString(""+(pontoFinalEscalaPlaneCliff), 185, 235);

		}
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
	     	offScreenGraphics.fillRect( 0, 0, getSize().width, getSize().height); 
	     	// pintar a imagem auxiliar
	     	offScreenGraphics.setColor( g.getColor() ); 
	     	paint( offScreenGraphics ); 
	     	// transferir a imagem auxiliar para a tela
	     	g.drawImage( offScreenImage, 0, 0, this ); 
	     	offScreenGraphics.dispose(); 
	   }	
}
