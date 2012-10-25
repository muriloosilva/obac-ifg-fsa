package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.models.Environment;

public class ObjectPlaneControl implements Runnable{
	
	private Thread t;
	private final int delayMs = 50;
	private final double delayS = 0.05;
	private boolean movendo = false;
	private Environment environment;
	private ObacControl obacControl;
	
	public ObjectPlaneControl(ObacControl obacControl, Environment environment){
		this.obacControl = obacControl;
		this.environment = environment;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		while (true) {
            if(movendo==true){
                System.out.println("qualquer coisa");
                //aux = (((((velI)*i)+((ac)*(i*i))/2)));
                environment.getObjeto().setMovimento((((((environment.getObjeto().getVelocidadeInicial())*
                		delayS)+((environment.getObjeto().getAceleracao())*(delayS*delayS))/2))));
//                    double espaco = ((mainApplet.getcuboX()-mainApplet.posicaoObjeto)* mainApplet.escala);
                environment.getObjeto().setEspacoTemporario((environment.getObjeto().getPosicaoAtual()-
                		environment.getObjeto().getPosicaoInicial()));
                //                    vel = Math.sqrt((velI*velI)+(2*ac*espaco));
//                    System.out.println("Velocidade: "+vel);
//                    System.out.println("auxxxx: "+aux);
//                    movendo = mainApplet.moveDireita(aux,vel);
//                    mainApplet.repaint();
//                    jt6.setText(""+df.format(vel)+"m/s");
//                    jt5.setText(""+df.format(((vel - velI)/ac))+"s");
//                    try {
//                        Thread.sleep(50);
//                    }
//                    catch (InterruptedException e){}
//                i+=0.05;
            }
        }
		
	}
}
