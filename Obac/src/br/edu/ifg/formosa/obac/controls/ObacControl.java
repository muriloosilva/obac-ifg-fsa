package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.models.Environment;

public class ObacControl {
	
	private Environment environment;
	private ObjectControl objectControl;
	private SurfaceControl surfaceControl;
	
	public ObacControl(Environment environment){
		this.objectControl = new ObjectControl(environment);
		this.surfaceControl = new SurfaceControl(environment);
	}
	
	public void planControl(){
		
		objectControl.calculaNormal();
		surfaceControl.calculaAtrito();
		objectControl.calculaAceleracao();
		objectControl.calculaPosicaoFinal();
		surfaceControl.calculaEscala();
		objectControl.calculaPosicaoFinalPixel();
		objectControl.calculaTempo();
	}
	
	public void cliffControl(){

		objectControl.calculaNormal();
		surfaceControl.calculaAtrito();
		objectControl.calculaAceleracao();
		objectControl.calculaPosicaoFinal();
		
		surfaceControl.calculaEscalaCliff();
		objectControl.calculaPosicaoFinalPixel();
		objectControl.calculaTempo();
	}
	
	public void descentControl(){
		
		objectControl.calculaNormal();
		surfaceControl.calculaAtrito();
		objectControl.calculaAceleracao();
		objectControl.calculaPosicaoFinal();
		surfaceControl.calculaEscala();
		objectControl.calculaPosicaoFinalPixel();
		objectControl.calculaTempo();
	}
	
	public void climbControl(){
		
		objectControl.calculaNormal();
		surfaceControl.calculaAtrito();
		objectControl.calculaAceleracao();
		objectControl.calculaPosicaoFinal();
		surfaceControl.calculaEscala();
		objectControl.calculaPosicaoFinalPixel();
		objectControl.calculaTempo();
	}
	
	public void fallControl(){
		
		objectControl.calculaNormal();
		surfaceControl.calculaAtrito();
		objectControl.calculaAceleracao();
		objectControl.calculaPosicaoFinal();
		surfaceControl.calculaEscala();
		objectControl.calculaPosicaoFinalPixel();
		objectControl.calculaTempo();
	}
	
	public ObjectControl getObjectControl(){
		return objectControl;
	}
}
