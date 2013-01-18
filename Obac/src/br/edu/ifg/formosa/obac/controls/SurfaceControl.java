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
	
	public void calculaEscalaSuperficie(){
		
	}
	
	public void calculaEscala(){
		
		System.out.println("calculaEscala");
		System.out.println("posiçãoFinal: "+environment.getObjeto().getPosicaoFinal());
		long escala=0;
		
		for(int i = 1; i<=environment.getObjeto().getPosicaoFinal(); i*=10){
			escala=i;			
		}
		escala*=10;
		System.out.println("escala:....."+escala);
		
		
		environment.getSurface().setEscala(escala/Surface.width);
		environment.getSurface().setPontoFinal(escala);
		
//		if(environment.getObjeto().getPosicaoFinal() < 100){
//            //desenhaEscala(g, 100);
//            environment.getSurface().setEscala(100/Surface.width);
//     }
//     else if(environment.getObjeto().getPosicaoFinal() > 100 && environment.getObjeto().getPosicaoFinal() < 1000){
//    	 environment.getSurface().setEscala(1000/Surface.width);
//
//     }
//     else if(environment.getObjeto().getPosicaoFinal() > 1000 && environment.getObjeto().getPosicaoFinal() < 10000){
//    	 environment.getSurface().setEscala(10000/Surface.width);
//     }
//     else if(environment.getObjeto().getPosicaoFinal() > 10000){
//    	 environment.getSurface().setEscala(10000000/Surface.width);
//     }
	}
}
