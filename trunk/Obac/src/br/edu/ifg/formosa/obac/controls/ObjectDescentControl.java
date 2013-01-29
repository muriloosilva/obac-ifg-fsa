package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.view.ScaleView;
import br.edu.ifg.formosa.obac.view.SurfaceView;

public class ObjectDescentControl implements Runnable, ObjectGenericControl{
	
	private Thread t;
	private final int delayMs = 20;
	private double delayS = 0.04;
	private boolean movendo = false;
	private Environment environment;
	private ObacControl obacControl;
	private ScaleView scaleView;
	private SurfaceView surfaceView;
	private boolean continuar = true;
	
	public ObjectDescentControl(ObacControl obacControl, Environment environment, ScaleView scaleView, SurfaceView surfaceView){
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
				if(!obacControl.getObjectControl().parada()) {
                System.out.println("qualquer coisa");
                //aux = (((((velI)*i)+((ac)*(i*i))/2)));
                environment.getObjeto().setPosicaoAtual((((((environment.getObjeto().getVelocidadeInicial())*
                		delayS)+((environment.getObjeto().getAceleracao())*(delayS*delayS))/2))));
                environment.getObjeto().setPosicaoAtualPixel(environment.getObjeto().getPosicaoAtual()/environment.getSurface().getEscala());
//                    double espaco = ((mainApplet.getcuboX()-mainApplet.posicaoObjeto)* mainApplet.escala);
//                environment.getObjeto().setEspacoTemporario((environment.getObjeto().getPosicaoAtual()-
//                		environment.getObjeto().getPosicaoInicial()));
                surfaceView.repinta();
               // objectView.repinta(environment.getObjeto());
                //surfaceView.repaint();
//              System.out.println("Escala: "+ environment.getSurface().getEscala());
                System.out.println("Posição atual: "+ environment.getObjeto().getPosicaoAtualPixel());
                System.out.println("Posição final pixel: "+environment.getObjeto().getPosicaoFinalPixel());
                //                    vel = Math.sqrt((velI*velI)+(2*ac*espaco));
//                    System.out.println("Velocidade: "+vel);
//                    System.out.println("auxxxx: "+aux);
//                    movendo = mainApplet.moveDireita(aux,vel);
//                    mainApplet.repaint();
//                    jt6.setText(""+df.format(vel)+"m/s");
//                    jt5.setText(""+df.format(((vel - velI)/ac))+"s");
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
		pausar();
		//t.interrupt();
		t.stop();
		System.out.println("thread: "+ t.isInterrupted());	
	}
}