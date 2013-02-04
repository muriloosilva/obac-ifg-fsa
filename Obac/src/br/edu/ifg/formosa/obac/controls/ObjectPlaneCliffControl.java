package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.models.Surface;
import br.edu.ifg.formosa.obac.view.ScaleView;
import br.edu.ifg.formosa.obac.view.SurfaceView;

public class ObjectPlaneCliffControl implements Runnable, ObjectGenericControl{
	private Thread t;
	private final int delayMs = 20;
	private double tempo = 0;
	private double delayS = 0.05;
	private double delaySY = 0.05;
	private boolean movendo = false;
	private Environment environment;
	private ObacControl obacControl;
	private ScaleView scaleView;
	private SurfaceView surfaceView;
	private boolean continuar = true;
	private boolean first = false;
	private double v = 0;
	private double pos = 0;
	
	public ObjectPlaneCliffControl(ObacControl obacControl, Environment environment, ScaleView scaleView, SurfaceView surfaceView){
		this.obacControl = obacControl;
		this.environment = environment;
		this.scaleView = scaleView;
		this.surfaceView = surfaceView;
		t = new Thread(this);
		movendo = true;
		t.start();
		
	}
		
	@Override
	public void run() {
		while (true) {
			if(continuar){
				if(!obacControl.getObjectControl().paradaCliff() ) {
                //aux = (((((velI)*i)+((ac)*(i*i))/2)));
                surfaceView.repinta();
                
                if( environment.getObjeto().getPosicaoAtualPixel() >= Surface.widthPlaneCliffPx){
                	
                	//System.out.println("############# tempo: " + tempo);
                	//System.out.println("############# Posicao atual: " + environment.getObjeto().getPosicaoAtual());
                	
                	
                	if(first == false){
                		v = environment.getObjeto().getVelocidadeInicial() - (environment.getObjeto().getAceleracao()* (-1) * (tempo));
                		pos = environment.getObjeto().getPosicaoAtualPixel();
                		tempo=0;
                		//delayS = 0.0252217294900222;
                		first = true;
                	}
                	
                	//System.out.println("############# Nova velocidade: " + v);
                	
                	//environment.getObjeto().setAceleracao(0);
                	
                	//System.out.println("############# pos: " + pos);
                	

                	
                	double novaPosicao = (pos +(v*(tempo)));
                	//System.out.println("############# novaPosicao: " + novaPosicao);
                	double diferencaPosicao = novaPosicao - environment.getObjeto().getPosicaoAtualPixel();
                	//System.out.println("############# diferencaPosicao: " + diferencaPosicao);
                	double novaPosicaoEscala = environment.getObjeto().getPosicaoAtualPixel() + (diferencaPosicao/environment.getSurface().getEscala());
                	//System.out.println("############# novaPosicaoEscala: " + novaPosicaoEscala);
                	environment.getObjeto().setPosicaoAtual(novaPosicao*environment.getSurface().getEscala());
                	environment.getObjeto().setPosicaoAtualPixel(novaPosicao);
                	
                	
                	//System.out.println("############# Nova Posição: " + environment.getObjeto().getPosicaoAtual());
                	
                	environment.getObjeto().setAceleracaoY(environment.getGravidade());
                	environment.getObjeto().setPosicaoAtualYPixel(((((((0)*
                			tempo)+((environment.getObjeto().getAceleracaoY())*(tempo*tempo))/2))))/environment.getSurface().getEscala());
                	
                }
                else{
                	
                	environment.getObjeto().setPosicaoAtual(((((((environment.getObjeto().getVelocidadeInicial())*
                			(tempo))+((environment.getObjeto().getAceleracao())*((tempo)*(tempo)))/2)))));
                	environment.getObjeto().setPosicaoAtualPixel(environment.getObjeto().getPosicaoAtual()/environment.getSurface().getEscala());
                }
                	
                //System.out.println("Posição atual: "+ environment.getObjeto().getPosicaoAtual());
                //System.out.println("Posição final pixel: "+environment.getObjeto().getPosicaoFinalPixel());
                    try {
                        Thread.sleep(delayMs);
                    }
                    catch (InterruptedException e){}
                    tempo=tempo + delayS;
            }
            else
            		parar();
				}
        }
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando ...");
		continuar = false;
		
	}

	@Override
	public void continuar() {
		System.out.println("Continuando ...");
		continuar = true;
		
	}
	
	@Override
	public void parar() {
		pausar();
		//t.interrupt();
		t.stop();
		
	}

}