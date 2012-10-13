package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.models.Environment;

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
            escala = 100/tamanhoLinha;
     }
     else if(posicaoFinal > 100 && posicaoFinal < 1000){
         desenhaEscala(g, 1000);
         escala = 1000/tamanhoLinha;

     }
     else if(posicaoFinal > 1000 && posicaoFinal < 10000){
         desenhaEscala(g, 10000);        
         escala = 10000/tamanhoLinha;
     }
		
	}
}
