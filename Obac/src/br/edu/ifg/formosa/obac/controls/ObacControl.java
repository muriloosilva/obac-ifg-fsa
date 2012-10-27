package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.models.Environment;

public class ObacControl {
	
	private Environment environment;
	private ObjectControl objectControl;
	
	public ObacControl(Environment environment){
		
		this.objectControl = new ObjectControl(environment);
		SurfaceControl surfaceControl = new SurfaceControl(environment);
		objectControl.calculaNormal();
		surfaceControl.calculaAtrito();
		objectControl.calculaAceleracao();
		objectControl.calculaPosicaoFinal();
		objectControl.calculaTempo();
		
	}
	
	public ObjectControl getObjectControl(){
		return objectControl;
	}
	
	
	
	
	
	

}
