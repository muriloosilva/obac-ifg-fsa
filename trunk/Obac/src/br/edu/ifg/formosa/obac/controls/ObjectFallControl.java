package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.models.Surface;
import br.edu.ifg.formosa.obac.view.ScaleView;
import br.edu.ifg.formosa.obac.view.SurfaceView;

public class ObjectFallControl implements Runnable, ObjectGenericControl{
	
	private Thread t;
	private final int delayMs = 20;
	private double delayS = 0.04;
	private boolean movendo = false;
	private Environment environment;
	private ObacControl obacControl;
	private ScaleView scaleView;
	private SurfaceView surfaceView;
	private boolean continuar = true;
	private boolean fall = true;
	
	public ObjectFallControl(ObacControl obacControl, Environment environment, ScaleView scaleView, SurfaceView surfaceView){
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
				//if(!obacControl.getObjectControl().parada()) {
				double v1f;
				if(environment.getObjeto().getPosicaoAtualYPixel() >= Surface.widthY){
					//v1f = v1i*(m1-m2*e)/(m1+m2)
					v1f = environment.getObjeto().getVelocidadeInicial()*(environment.getObjeto().getMassa()- 1000000000 *1)/(environment.getObjeto().getMassa() + 1000000000);
					System.out.println("v1f: " + v1f);
					environment.getObjeto().setVelocidadeInicial(v1f *(-1));
					environment.getObjeto().setAceleracao(environment.getObjeto().getAceleracao() * (-1));
					delayS = 0.04;
					fall = false;
					
				}
				
                System.out.println("qualquer coisa");
                
                if(fall){
                
	                environment.getObjeto().setPosicaoAtualY((((((environment.getObjeto().getVelocidadeInicial())*
	                		delayS)+((environment.getObjeto().getAceleracao())*(delayS*delayS))/2))));
	                environment.getObjeto().setPosicaoAtualYPixel(environment.getObjeto().getPosicaoAtualY()/environment.getSurface().getEscala());
	                
                }
                else{
                	
                	environment.getObjeto().setPosicaoAtualY((((((environment.getObjeto().getVelocidadeInicial())*
	                		delayS)+((environment.getObjeto().getAceleracao())*(delayS*delayS))/2))));
	                environment.getObjeto().setPosicaoAtualYPixel(environment.getObjeto().getPosicaoAtualYPixel() - (environment.getObjeto().getPosicaoAtualY()/environment.getSurface().getEscala()));
                	
                }
                surfaceView.repinta();
                System.out.println("Posição atual Y: "+ environment.getObjeto().getPosicaoAtualY());
                System.out.println("Posição atual Y Pixel: "+environment.getObjeto().getPosicaoAtualYPixel());
                    try {
                        Thread.sleep(delayMs);
                    }
                    catch (InterruptedException e){}
                delayS+=0.04;
           // }
           //else
			//		t.interrupt();
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
		System.out.println("thread: "+ t.isInterrupted());	
	}
}