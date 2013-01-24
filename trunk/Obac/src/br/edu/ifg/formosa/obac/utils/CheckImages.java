package br.edu.ifg.formosa.obac.utils;

import br.edu.ifg.formosa.obac.view.*;

public class CheckImages {
	private final static String atritoAsfalto = "Asfalto";
	private final static String atritoMadeira = "Madeira";
	private final static String atritoAluminio = "Aluminio";
	private final static String planetaTerra = "Terra";
	private final static String planetaLua = "lua";
	private final static String planetaMarte = "Marte";
	
	public static void checkImageSelected(ConfigurationView configurationView, EnvironmentView environmentView, SurfaceView surfaceView){
		surfaceView.resetPosObjetoX();
		if(configurationView.getPlane().isSelected()){
			surfaceView.setPosObjetoY(SurfaceView.posObjetoDown);
			surfaceView.setPosEscalaY(SurfaceView.escalaDown);
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
		
		else if(configurationView.getPlaneCliff().isSelected()){
			surfaceView.setPosObjetoY(SurfaceView.posObjetoUp);
			surfaceView.setPosEscalaY(SurfaceView.escalaUp);
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
		
		else if(configurationView.getPlaneClimb().isSelected()){
			surfaceView.setPosObjetoY(SurfaceView.posObjetoDown);
			surfaceView.setPosEscalaY(SurfaceView.escalaDown);
			if(configurationView.getCbFriction().getSelectedItem() == atritoAsfalto){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraAsfaltoPlanoSubida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaAsfaltoPlanoSubida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteAsfaltoPlanoSubida);
				}
			}else if(configurationView.getCbFriction().getSelectedItem() == atritoMadeira){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraMadeiraPlanoSubida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaMadeiraPlanoSubida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteMadeiraPlanoSubida);
				}
			}else if(configurationView.getCbFriction().getSelectedItem() == atritoAluminio){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraAluminioPlanoSubida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaAluminioPlanoSubida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteAluminioPlanoSubida);
				}
			}
			
		}
		
		else if(configurationView.getPlaneDescent().isSelected()){
			surfaceView.setPosObjetoY(SurfaceView.posObjetoUp);
			surfaceView.setPosEscalaY(SurfaceView.escalaUp);
			if(configurationView.getCbFriction().getSelectedItem() == atritoAsfalto){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraAsfaltoPlanoDescida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaAsfaltoPlanoDescida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteAsfaltoPlanoDescida);
				}
			}else if(configurationView.getCbFriction().getSelectedItem() == atritoMadeira){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraMadeiraPlanoDescida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaMadeiraPlanoDescida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteMadeiraPlanoDescida);
				}
			}else if(configurationView.getCbFriction().getSelectedItem() == atritoAluminio){
				if(configurationView.getCbGravity().getSelectedItem() == planetaTerra){
					environmentView.changeImage(EnvironmentView.terraAluminioPlanoDescida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaLua){
					environmentView.changeImage(EnvironmentView.luaAluminioPlanoDescida);
				}
				if(configurationView.getCbGravity().getSelectedItem() == planetaMarte){
					environmentView.changeImage(EnvironmentView.marteAluminioPlanoDescida);
				}
			}
			
		}
		
	}
}
