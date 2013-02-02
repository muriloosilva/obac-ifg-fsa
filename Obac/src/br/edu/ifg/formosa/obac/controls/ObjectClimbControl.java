package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.view.ScaleView;
import br.edu.ifg.formosa.obac.view.SurfaceView;

public class ObjectClimbControl implements Runnable, ObjectGenericControl{
	
	private Thread t;
	private final int delayMs = 20;
	private double delayS = 0.04;
	private boolean movendo = false;
	private Environment environment;
	private ObacControl obacControl;
	private ScaleView scaleView;
	private SurfaceView surfaceView;
	private boolean continuar = true;
	
	public ObjectClimbControl(ObacControl obacControl, Environment environment, ScaleView scaleView, SurfaceView surfaceView){
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
				if(!obacControl.getObjectControl().paradaClimb()) {
                environment.getObjeto().setPosicaoAtual((((((environment.getObjeto().getVelocidadeInicial())*
                		delayS)+((environment.getObjeto().getAceleracao())*(delayS*delayS))/2))));
                environment.getObjeto().setPosicaoAtualPixel(environment.getObjeto().getPosicaoAtual()/environment.getSurface().getEscala());
                surfaceView.repinta();
                    try {
                        Thread.sleep(delayMs);
                    }
                    catch (InterruptedException e){}
                delayS+=0.04;
            }
            else{
            	surfaceView.repinta();
				parar();
            	}
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