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
	public static long pontoFinalEscalaFall = 1000;
	private Image offScreenImage; //imagem auxiliar declarada na classe
	private Object objeto;
	private boolean ver = false;
	private boolean desenhaEscala = true;
 
	public static final int posObjetoDown = 450;
	public static final int posObjetoUp = 170;
	
	public static int posObjetoXDefault = 50;
	public static int posObjetoXFall = 287;
	public static int posObjetoX = posObjetoXDefault;
	public static final int posObjetoFallUp = 100;
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
	
	//private int posLinhaEscalaYFall = 
	
	private boolean isDescent = false;
	private boolean isClimb = false;
	private boolean isCliff = false;
	private boolean isFall = false;
	
	private int widthLinePlane = 600;
	private int widthLineInclined = 645;
	private int widthLine = 650;
	
	private Font estiloFonte = new Font("Arial", Font.BOLD, 14);
	private Font estiloFonteMetros = new Font("Arial", Font.PLAIN, 10);
	
	public SurfaceView(ScaleView scaleView){
		this.setLayout(null);
		//objectView.setBounds(50, 0, 30, 30);
		//this.add(objectView);
		scaleView.setBounds(0, 50, 600, 400);
		this.add(scaleView);
		//this.setBackground(Color.blue);
		this.setOpaque(false);
	}
	
	public void setObject(Object objeto){
		
		this.objeto = objeto;
		this.ver = true;
		//this.repaint();
		//this.setBounds((int)objeto.getPosicaoAtual()+50, 0, 30, 30);
		//this.setLocation((int)objeto.getPosicaoAtual()+50, 0);
		this.repaint();
	}
	
	public void repinta(){
		this.repaint();
	}
	
	public void posicaoInicialObjetoEscalaPlane(){
		
		isDescent = false;
		isClimb = false;
		isCliff = false;
		isFall = false;
		
		//reposiciona objeto
		posObjetoY = posObjetoDown;
		posObjetoX = posObjetoXDefault;
		//reposiciona escala
		setPosEscalaY(SurfaceView.escalaDown);
		
		repaint();
		
	}
	
	public void posicaoInicialObjetoEscalaPlaneCliff(){
		
		isDescent = false;
		isClimb = false;
		isCliff = true;
		
		//reposiciona objeto
		posObjetoY = posObjetoUp;
		posObjetoX = posObjetoXDefault;
		resetPosObjetoY();
		//reposiciona escala
		setPosEscalaY(SurfaceView.escalaUp);
		repaint();
		
	}
	
	public void posicaoInicialObjetoEscalaDescent(){
		
		isDescent = true;
		isClimb = false;
		isCliff = false;
		
		//reposiciona objeto
		posObjetoY = posObjetoUp;
		posObjetoX = posObjetoXDefault;
		//reposiciona escala
		setPosEscalaY(SurfaceView.escalaUp);
		repaint();
		
	}
	
	public void posicaoInicialObjetoEscalaClimb(){
		
		isDescent = false;
		isClimb = true;
		isCliff = false;
		
		//reposiciona objeto
		posObjetoY = posObjetoDown;
		posObjetoX = posObjetoXDefault;
		//reposiciona escala
		setPosEscalaY(SurfaceView.escalaDown);
		
		repaint();
		
	}
	
	public void posicaoInicialObjetoEscalaFall(){

		isDescent = false;
		isClimb = false;
		isCliff = false;
		isFall = true;
		resetPosObjetoY();
		posObjetoY = posObjetoFallUp;
		posObjetoX = posObjetoXFall;
		repaint();
	}

	
	public void alteraPontosEscala(long pontoFinal){
		desenhaEscala = true;
		pontoFinalEscala = pontoFinal;
		repaint();		
	}
	
//	public void setPosObjetoY(int posicao){
//		posObjetoY = posicao;
//		if(objeto!=null){
//			objeto.setPosicaoAtualY(0);
//		}
//	}
	
	public void resetPosObjetoX(){
		if(objeto!=null){
			objeto.setPosicaoAtualPixel(0);
		}
		
	}
	
	public void resetPosObjetoY(){
		if(objeto!=null){
			objeto.setPosicaoAtualYPixel(0);
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
	
	public void desenhaObjeto(Graphics2D g2d){
		g2d.fillRect((int)objeto.getPosicaoAtualPixel()+posObjetoX, (int)(posObjetoY + objeto.getPosicaoAtualYPixel()), 30, 30);
	}
	
	public void desenhaEscalaDefault(Graphics g){
		g.setColor(Color.white);
		g.setFont(estiloFonte);
		g.drawLine(0, posLinhaEscalaY, widthLine, posLinhaEscalaY);
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
	}
	
	public void desenhaEscalaFall(Graphics g){
		g.setColor(Color.cyan);
		g.setFont(estiloFonte);
		g.drawLine(260, 100, 260, 550);
		g.drawString("__", 250, 98);
		g.drawString("__", 250, 211);
		g.drawString("__", 250, 323);
		g.drawString("__", 250, 436);
		g.drawString("__", 250, 548);
		
		g.drawString("0", 240, 103);
		g.drawString(""+(pontoFinalEscalaFall*0.25), 213, 216);
		g.drawString(""+(pontoFinalEscalaFall*0.5), 213, 329);
		g.drawString(""+(pontoFinalEscalaFall*0.75), 213, 442);
		g.drawString(""+(pontoFinalEscalaFall), 213, 553);
		g.setFont(estiloFonteMetros);
		g.drawString("(metros)", 250, 565);
	}
	// 0, 112.5, 225, 337.5
	@Override
	public void paint(Graphics g) {
		//super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.blue);
		if(ver && objeto!=null){
			
			if(isDescent){
				g2d.translate(95, 8);
				g2d.rotate(0.476);
				desenhaObjeto(g2d);
				g2d.translate(0, -294);
				widthLine = widthLineInclined;
				desenhaEscalaDefault(g);
			}
			else if(isClimb){
				g2d.translate(-192.7, 53);
				g2d.rotate(-0.476);
				desenhaObjeto(g2d);
				g2d.translate(0, 0);
				widthLine = widthLinePlane;
				desenhaEscalaDefault(g);
			}else if(isCliff){
				desenhaObjeto(g2d);
				g.setFont(estiloFonte);
				double pontoFinalEscalaPlaneCliff = (pontoFinalEscala*30)/100;
				g.setColor(Color.white);
				g.setFont(estiloFonte);
				g.drawLine(0, 210, 200, 210);
				g.drawString("|", 50, 215);
				g.drawString("|", 200, 215);
				g.drawString("0", 50, 235);
				g.drawString(""+(pontoFinalEscalaPlaneCliff), 185, 235);
				desenhaEscalaDefault(g);
			}else if(isFall){
				desenhaObjeto(g2d);
				widthLine = widthLinePlane;
				desenhaEscalaFall(g);
			}
			else{
				desenhaObjeto(g2d);
				desenhaEscalaDefault(g);
			}
		}
		else{
			g2d.fillRect(50, posObjetoY, 30, 30);
			ver = true;
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
