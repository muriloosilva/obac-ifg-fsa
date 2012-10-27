package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.models.Surface;

public class SurfaceControl {
	
	private Environment environment;
	
	public SurfaceControl(Environment environment){
		this.environment = environment;
	}
	
	public void calculaAtrito(){
		//(normal*coef);
		environment.getSurface().setForcaAtrito(
				environment.getObjeto().getForcaNormal()*
				environment.getSurface().getCoefFriction());
	}
	
	public void calculaEscala(){
		
		if(environment.getObjeto().getPosicaoFinal() < 100){
            //desenhaEscala(g, 100);
            environment.getSurface().setEscala(100/Surface.width);
     }
     else if(environment.getObjeto().getPosicaoFinal() > 100 && environment.getObjeto().getPosicaoFinal() < 1000){
    	 environment.getSurface().setEscala(1000/Surface.width);

     }
     else if(environment.getObjeto().getPosicaoFinal() > 1000 && environment.getObjeto().getPosicaoFinal() < 10000){
    	 environment.getSurface().setEscala(10000/Surface.width);
     }
		
	}
}
