package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.models.Environment;

public class ObjectControl {
	
	private Environment environment;
	
	
	public ObjectControl(Environment environment){
		
		this.environment = environment;
		
	}
	
	public void calculaNormal(){
		//massa*9.8;
		environment.getObjeto().setForcaNormal((environment.getObjeto().getMassa() * environment.getGravidade()));
	}
	
	public void calculaAceleracao(){
		//(fat/massa)*(-1);
		environment.getObjeto().setAceleracao((
				environment.getSurface().getForcaAtrito()/
				environment.getObjeto().getMassa()) * -1);
	}
	
	public void calculaPosicaoFinal(){
		//((velI*velI)*(-1))/(2*(ac));
		environment.getObjeto().setPosicaoFinal((((
				environment.getObjeto().getVelocidadeInicial()*
				environment.getObjeto().getVelocidadeInicial())*-1)/(2*(
						environment.getObjeto().getAceleracao()))));
	}
	
	public void calculaPosicaoFinalPixel(){
		System.out.println("Escala: "+environment.getSurface().getEscala());
		environment.getObjeto().setPosicaoFinalPixel(environment.getObjeto().getPosicaoFinal()/environment.getSurface().getEscala());
		
	}
	
	public void calculaMomentoQueda(){
		
	}
	
	public void calculaTempo(){
		//(0 - velI)/ac;
		environment.getObjeto().setTempo((0-
				environment.getObjeto().getVelocidadeInicial())/
				environment.getObjeto().getAceleracao());
	}

	public boolean parada(){
		if(environment.getObjeto().getPosicaoAtual()>=environment.getObjeto().getPosicaoFinalPixel())
			return true;
		else
			return false;
	}
}
