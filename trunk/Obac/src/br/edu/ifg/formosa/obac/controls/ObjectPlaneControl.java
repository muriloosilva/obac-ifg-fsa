package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.view.ObjectView;

public class ObjectPlaneControl implements Runnable{
	
	private Thread t;
	private final int delayMs = 40;
	private double delayS = 0.04;
	private boolean movendo = false;
	private Environment environment;
	private ObacControl obacControl;
	private ObjectView objectView;
	
	public ObjectPlaneControl(ObacControl obacControl, Environment environment, ObjectView objectView){
		this.obacControl = obacControl;
		this.environment = environment;
		this.objectView = objectView;
		t = new Thread(this);
		movendo = true;
		t.start();
		
	}

	@Override
	public void run() {
		while (true) {
            if(!obacControl.getObjectControl().parada()){
                System.out.println("qualquer coisa");
                //aux = (((((velI)*i)+((ac)*(i*i))/2)));
                environment.getObjeto().setPosicaoAtual((((((environment.getObjeto().getVelocidadeInicial())*
                		delayS)+((environment.getObjeto().getAceleracao())*(delayS*delayS))/2)))/environment.getSurface().getEscala());
//                    double espaco = ((mainApplet.getcuboX()-mainApplet.posicaoObjeto)* mainApplet.escala);
//                environment.getObjeto().setEspacoTemporario((environment.getObjeto().getPosicaoAtual()-
//                		environment.getObjeto().getPosicaoInicial()));
                
                objectView.repinta(environment.getObjeto());
                System.out.println("Posição atual: "+ environment.getObjeto().getPosicaoAtual());
                System.out.println(environment.getObjeto().getPosicaoFinal());
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
        }
		
	}
}
