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
		
		/*Calcula o ponto final da escala
		Exemplo: se o ponto final do objeto for 50 o ponto final da escala será 100
				 se o ponto final do objeto for 200, o ponto final da escala será 1000
				 se o ponto final do objetor for 4500, o ponto final da escala serpa 10000
				 e assim por diante*/
		
		long pontoFinalEscala=0;
		
		for(int i = 1; i<=environment.getObjeto().getPosicaoFinal(); i*=10){
			pontoFinalEscala=i;			
		}
		pontoFinalEscala*=10;
		System.out.println("pontoFinalEscala:....."+pontoFinalEscala);
		
		//Calcula o comprimento do plano do precipício de acordo com o ponto final da escala
		Surface.widthPlaneCliff = (pontoFinalEscala*Surface.widthPlaneCliffPc)/100;
		//Calcula o comprimento do precipício de acordo com o ponto final da escala
		Surface.widthCliff = (pontoFinalEscala*Surface.widthCliffPc)/100;
		
		System.out.println("widthPlaneCliff:....."+Surface.widthPlaneCliff);
		System.out.println("widthCliff:....."+Surface.widthCliff);
		
		environment.getSurface().setEscala(pontoFinalEscala/Surface.width);
		environment.getSurface().setPontoFinal(pontoFinalEscala);
		
	}
}
