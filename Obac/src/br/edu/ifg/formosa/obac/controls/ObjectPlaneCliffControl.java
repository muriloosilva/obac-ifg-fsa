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
            	
                System.out.println("qualquer coisa cliff");
                //aux = (((((velI)*i)+((ac)*(i*i))/2)));
                
                
                surfaceView.repinta(environment.getObjeto());
                
                if( environment.getObjeto().getPosicaoAtual() >= Surface.widthPlaneCliffPx){
                	
                	System.out.println("############# tempo: " + tempo);
                	System.out.println("############# Posicao atual: " + environment.getObjeto().getPosicaoAtual());
                	
                	
                	if(first == false){
                		 v = environment.getObjeto().getVelocidadeInicial() - (environment.getObjeto().getAceleracao()* (-1) * (tempo));
                		pos = environment.getObjeto().getPosicaoAtual();
                		tempo=0;
                		//delayS = 0.0252217294900222;
                		first = true;
                		
                	}
                	
                	System.out.println("############# Nova velocidade: " + v);
                	
                	//environment.getObjeto().setAceleracao(0);
                	
                	System.out.println("############# pos: " + pos);
                	

                	
                	double novaPosicao = (pos +(v*(tempo)));
                	System.out.println("############# novaPosicao: " + novaPosicao);
                	double diferenaPosicao = novaPosicao - environment.getObjeto().getPosicaoAtual();
                	System.out.println("############# diferenaPosicao: " + diferenaPosicao);
                	double novaPosicaoEscala = environment.getObjeto().getPosicaoAtual() + (diferenaPosicao/environment.getSurface().getEscala());
                	System.out.println("############# novaPosicaoEscala: " + novaPosicaoEscala);
                	environment.getObjeto().setPosicaoAtual(novaPosicao);
                	
                	
                	System.out.println("############# Nova Posi��o: " + environment.getObjeto().getPosicaoAtual());
                	
                	environment.getObjeto().setAceleracaoY(environment.getGravidade());
                	environment.getObjeto().setPosicaoAtualY(((((((0)*
                			tempo)+((environment.getObjeto().getAceleracaoY())*(tempo*tempo))/2))))/environment.getSurface().getEscala());
                	
                }
                else{
                	
                	environment.getObjeto().setPosicaoAtual(((((((environment.getObjeto().getVelocidadeInicial())*
                			(tempo))+((environment.getObjeto().getAceleracao())*((tempo)*(tempo)))/2))))/environment.getSurface().getEscala());
                }
                	
                System.out.println("Posi��o atual: "+ environment.getObjeto().getPosicaoAtual());
                System.out.println("Posi��o final pixel: "+environment.getObjeto().getPosicaoFinalPixel());
                    try {
                        Thread.sleep(delayMs);
                    }
                    catch (InterruptedException e){}
                    tempo=tempo + delayS;
            }
            else
					t.interrupt();
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