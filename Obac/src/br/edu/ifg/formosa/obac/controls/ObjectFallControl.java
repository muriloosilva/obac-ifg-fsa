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
	double soma = 0.0;
	
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
					
					//environment.getObjeto().setAceleracao(environment.getObjeto().getAceleracao() *(-1));
					if(environment.getObjeto().getAceleracao() < 0)
						environment.getObjeto().setAceleracao(environment.getObjeto().getAceleracao() *(-1));
					
					environment.getObjeto().setPosicaoAtualYPixel(420);
					int vf2 = 0;
					System.out.println("Distancia: " + (soma));
					if(soma >= 0 && !fall)
						vf2 = (int)(0 + 2 * environment.getObjeto().getAceleracao() * (soma)  * environment.getSurface().getEscala());
					else
						vf2 = (int)((environment.getObjeto().getVelocidadeInicial() * environment.getObjeto().getVelocidadeInicial()) + 2 * environment.getObjeto().getAceleracao() * Surface.widthY * environment.getSurface().getEscala());
					
					
					soma=0;
					double vf = Math.sqrt(vf2);
					System.out.println("Velocidade ao tocar o chão: " + vf);
					//v1f = v1i*(m1-m2*e)/(m1+m2)
					v1f = vf*(environment.getObjeto().getMassa()- 1000000000 *0.65)/(environment.getObjeto().getMassa() + 1000000000)*(-1);
					System.out.println("Velocidade da volta: " + v1f);
					if(v1f <=0)
						continuar = false;
					environment.getObjeto().setVelocidadeInicial(v1f);
					environment.getObjeto().setAceleracao(environment.getObjeto().getAceleracao() * (-1));
					delayS = 0.04;
					fall = false;
					
				}
				
                
                if(fall){
                
	                environment.getObjeto().setPosicaoAtualY((((((environment.getObjeto().getVelocidadeInicial())*
	                		delayS)+((environment.getObjeto().getAceleracao())*(delayS*delayS))/2))));
	                environment.getObjeto().setPosicaoAtualYPixel(environment.getObjeto().getPosicaoAtualY()/environment.getSurface().getEscala());
	                
                }
                else{     
                	
                	
                	environment.getObjeto().setPosicaoAtualY((((((environment.getObjeto().getVelocidadeInicial())*
	                		delayS)+((environment.getObjeto().getAceleracao())*(delayS*delayS))/2))));
                	
                	
                	double novaPosicao =Surface.widthY - (environment.getObjeto().getPosicaoAtualY()/environment.getSurface().getEscala());
           
	                if(novaPosicao <= environment.getObjeto().getPosicaoAtualYPixel())
	                	soma = ((environment.getObjeto().getPosicaoAtualY()/environment.getSurface().getEscala()));
	                	
	                environment.getObjeto().setPosicaoAtualYPixel(novaPosicao);	
	                System.out.println("soma: "+ soma);
	                //System.out.println("Posição atual Y Pixel: "+environment.getObjeto().getPosicaoAtualYPixel());
                }
                surfaceView.repinta();
                //System.out.println("Posição atual Y: "+ environment.getObjeto().getPosicaoAtualY());
                //System.out.println("Posição atual Y Pixel: "+environment.getObjeto().getPosicaoAtualYPixel());
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