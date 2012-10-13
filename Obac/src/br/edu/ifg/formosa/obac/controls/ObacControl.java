package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.models.Environment;

public class ObacControl {
	
	private Environment environment;
	
	public ObacControl(Environment environment){
		
		ObjectControl objectControl = new ObjectControl(environment);
		SurfaceControl surfaceControl = new SurfaceControl(environment);
		objectControl.calculaNormal();
		surfaceControl.calculaAtrito();
		objectControl.calculaAceleracao();
		objectControl.calculaPosicaoFinal();
		objectControl.calculaTempo();
		
	}
	
	
	
	
	
	

}
