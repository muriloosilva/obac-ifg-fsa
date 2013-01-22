package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.models.Surface;
import br.edu.ifg.formosa.obac.view.ScaleView;
import br.edu.ifg.formosa.obac.view.SurfaceView;

public class ObjectPlaneCliffControl implements Runnable, ObjectGenericControl{
	private Thread t;
	private final int delayMs = 40;
	private double delayS = 0.04;
	private boolean movendo = false;
	private Environment environment;
	private ObacControl obacControl;
	private ScaleView scaleView;
	private SurfaceView surfaceView;
	private boolean continuar = true;
	
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
                environment.getObjeto().setPosicaoAtual(((((((environment.getObjeto().getVelocidadeInicial())*
                		delayS)+((environment.getObjeto().getAceleracao())*(delayS*delayS))/2))))/environment.getSurface().getEscala());
                
                surfaceView.repinta(environment.getObjeto());
                
                if( environment.getObjeto().getPosicaoAtual() >= Surface.widthPlaneCliffPx){
                	environment.getObjeto().setAceleracao(0);
                	environment.getObjeto().setAceleracaoY(environment.getGravidade());
                	environment.getObjeto().setPosicaoAtualY(((((((0)*
                    		delayS)+((environment.getObjeto().getAceleracaoY())*(delayS*delayS))/2))))/environment.getSurface().getEscala());
                	
                }
               
                System.out.println("Posição atual: "+ environment.getObjeto().getPosicaoAtual());
                System.out.println("Posição final pixel: "+environment.getObjeto().getPosicaoFinalPixel());

                    try {
                        Thread.sleep(delayMs);
                    }
                    catch (InterruptedException e){}
                delayS+=0.04;
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
		t.interrupt();
		
	}

}