package br.edu.ifg.formosa.obac.utils;

import br.edu.ifg.formosa.obac.view.*;

public class CheckImages {
	private final static String atritoAsfalto = "Asfalto";
	private final static String atritoMadeira = "Madeira";
	private final static String atritoAluminio = "Aluminio";
	private final static String planetaTerra = "Terra";
	private final static String planetaLua = "Lua";
	private final static String planetaMarte = "Marte";
	
	//Verifica todas as configurações do usuário e troca o plano de fundo de acordo com as mesmas
	public static void checkImageSelected(ConfigurationView configurationView, EnvironmentView environmentView, SurfaceView surfaceView, boolean simulation){
		//Coloca o objeto na posição inicial do eixo X
		surfaceView.resetPosObjetoX();
		
		//Caso.: Plano
		if(configurationView.getPlane().isSelected()){
			surfaceView.posicaoInicialObjetoEscalaPlane();
			//surfaceView.setPosObjetoY(SurfaceView.posObjetoDown);
			//surfaceView.setPosEscalaY(SurfaceView.escalaDown);
			if(configurationView.getCbFriction().getSelectedItem() == atritoAsfalto){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraAsfaltoPlano);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaAsfaltoPlano);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteAsfaltoPlano);
				}
			}else if(configurationView.getCbFriction().getSelectedItem() == atritoMadeira){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraMadeiraPlano);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaMadeiraPlano);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteMadeiraPlano);
				}
			}else if(configurationView.getCbFriction().getSelectedItem() == atritoAluminio){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraAluminioPlano);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaAluminioPlano);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteAluminioPlano);
				}
			}
		}
		
		//Caso.: Plano e Precipício
		else if(configurationView.getPlaneCliff().isSelected()){
			surfaceView.posicaoInicialObjetoEscalaPlaneCliff();
			//surfaceView.setPosObjetoY(SurfaceView.posObjetoUp);
			//surfaceView.setPosEscalaY(SurfaceView.escalaUp);
			if(configurationView.getCbFriction().getSelectedItem() == atritoAsfalto){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraAsfaltoPlanoPrecipicio);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaAsfaltoPlanoPrecipicio);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteAsfaltoPlanoPrecipicio);
				}
			}else if(configurationView.getCbFriction().getSelectedItem() == atritoMadeira){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraMadeiraPlanoPrecipicio);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaMadeiraPlanoPrecipicio);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteMadeiraPlanoPrecipicio);
				}
			}else if(configurationView.getCbFriction().getSelectedItem() == atritoAluminio){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraAluminioPlanoPrecipicio);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaAluminioPlanoPrecipicio);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteAluminioPlanoPrecipicio);
				}
			}
		}
		
		//Caso.: Subida
		else if(configurationView.getPlaneClimb().isSelected()){
			surfaceView.posicaoInicialObjetoEscalaClimb();
			//surfaceView.setPosObjetoY(SurfaceView.posObjetoDown);
			//surfaceView.setPosEscalaY(SurfaceView.escalaDown);
			if(configurationView.getCbFriction().getSelectedItem() == atritoAsfalto){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraAsfaltoSubida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaAsfaltoSubida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteAsfaltoSubida);
				}
			}else if(configurationView.getCbFriction().getSelectedItem() == atritoMadeira){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraMadeiraSubida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaMadeiraSubida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteMadeiraSubida);
				}
			}else if(configurationView.getCbFriction().getSelectedItem() == atritoAluminio){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraAluminioSubida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaAluminioSubida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteAluminioSubida);
				}
			}
			
		}
		
		
		//Caso.: Descida
		else if(configurationView.getPlaneDescent().isSelected()){
			surfaceView.posicaoInicialObjetoEscalaDescent();
			//surfaceView.setPosObjetoY(SurfaceView.posObjetoUp);
			//surfaceView.setPosEscalaY(SurfaceView.escalaUp);
			if(configurationView.getCbFriction().getSelectedItem() == atritoAsfalto){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraAsfaltoDescida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaAsfaltoDescida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteAsfaltoDescida);
				}
			}else if(configurationView.getCbFriction().getSelectedItem() == atritoMadeira){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraMadeiraDescida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaMadeiraDescida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteMadeiraDescida);
				}
			}else if(configurationView.getCbFriction().getSelectedItem() == atritoAluminio){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraAluminioDescida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaAluminioDescida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteAluminioDescida);
				}
			}
			
		}
		
		//Caso.: Queda Livre
		else if(configurationView.getFall().isSelected()){
					surfaceView.posicaoInicialObjetoEscalaFall();
					if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
						if(simulation)
							environmentView.changeImage(EnvironmentView.terraQuedaLivreAberto);
						else
							environmentView.changeImage(EnvironmentView.terraQuedaLivreFechado);
					}
					else if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
						if(simulation)
							environmentView.changeImage(EnvironmentView.luaQuedaLivreAberto);
						else
							environmentView.changeImage(EnvironmentView.luaQuedaLivreFechado);
					}else if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
						if(simulation)
							environmentView.changeImage(EnvironmentView.marteQuedaLivreAberto);
						else
							environmentView.changeImage(EnvironmentView.marteQuedaLivreFechado);
					}
	}
}
}
