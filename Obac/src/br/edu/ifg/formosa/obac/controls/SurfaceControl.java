package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.models.Surface;
import br.edu.ifg.formosa.obac.view.SurfaceView;

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
		long pontoFinalEscala=0;
		
		for(int i = 1; i<=environment.getObjeto().getPosicaoFinal(); i*=10){
			pontoFinalEscala=i;			
		}
		pontoFinalEscala*=10;
		System.out.println("pontoFinalEscala:....."+pontoFinalEscala);
		
		
		environment.getSurface().setEscala(pontoFinalEscala/Surface.width);
		environment.getSurface().setPontoFinal(pontoFinalEscala);
		
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
	
public void calculaEscalaCliff(){
		
		System.out.println("calculaEscalaCliff");
		System.out.println("posiçãoFinal: "+environment.getObjeto().getPosicaoFinal());
		long pontoFinalEscala=0;
		
		for(int i = 1; i<=environment.getObjeto().getPosicaoFinal(); i*=10){
			pontoFinalEscala=i;			
		}
		pontoFinalEscala*=10;
		System.out.println("pontoFinalEscala:....."+pontoFinalEscala);
		
		
		environment.getSurface().setEscala(SurfaceView.widthPlaneCliff/SurfaceView.widthPlaneCliffPx);
		environment.getSurface().setPontoFinal(pontoFinalEscala);
		
	}
}
