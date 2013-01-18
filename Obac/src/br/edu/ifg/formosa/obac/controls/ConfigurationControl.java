package br.edu.ifg.formosa.obac.controls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifg.formosa.obac.main.Obac;
import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.models.Object;
import br.edu.ifg.formosa.obac.models.Surface;
import br.edu.ifg.formosa.obac.view.ConfigurationView;
import br.edu.ifg.formosa.obac.view.EnvironmentView;
import br.edu.ifg.formosa.obac.view.ObjectView;
import br.edu.ifg.formosa.obac.view.ScaleView;
import br.edu.ifg.formosa.obac.view.SurfaceView;

public class ConfigurationControl {

	private EnvironmentView environmentView;
	private ConfigurationView configurationView;
	private Environment environment;
	private Object objeto;
	private Surface surface;
	private Obac obac;
	private ScaleView scaleView;
	private SurfaceView surfaceView;
	private final String atritoAsfalto = "Asfalto";
	private final String atritoMadeira = "Madeira";
	private final String atritoAluminio = "Aluminio";
	private final String planetaTerra = "Terra";
	private final String planetaLua = "lua";
	private final String planetaMarte = "marte";

	public ConfigurationControl(Obac obac, ConfigurationView configurationView,
			Environment environment, ScaleView scaleView,
			SurfaceView surfaceView, EnvironmentView environmentView) {
		this.environment = environment;
		this.configurationView = configurationView;
		this.scaleView = scaleView;
		this.surfaceView = surfaceView;
		this.environmentView = environmentView;
		addActionListeners();
	}

	public boolean verificaCampos() {
		// verifica se a velocidade inicial está preenchida quando a propulsão
		// for manual
		if (configurationView.getCbPropulsion().getSelectedItem().toString() == "Manual"
				&& configurationView.getTxVelocity().getText().equals("")) {
			JOptionPane.showMessageDialog(obac,
					"Preencha o campo: 'Velocidade Inicial'");
			return false;
		}else if(configurationView.getTxMass().getText().equals("")){
			JOptionPane.showMessageDialog(obac,
					"Preencha o campo: 'Massa'");
		}
		return true;
	}
	
	public void verificaImage(){
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

	public void addActionListeners() {

		// evento de seleção do tipo de superficie
		configurationView.getPlane().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				verificaImage();
			}
		});
		
		

		// evento de seleção do tipo de superficie
		configurationView.getPlaneClimb().addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						verificaImage();
					}
				});

		// evento de seleção do tipo de superficie
		configurationView.getPlaneDescent().addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						verificaImage();
					}
				});

		// evento de seleção do tipo de superficie
		configurationView.getPlaneCliff().addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						verificaImage();
					}
				});
		
		configurationView.getCbFriction().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				verificaImage();
			}
		});
		
		configurationView.getCbGravity().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				verificaImage();
			}
		});

		// evento botao simular
		configurationView.getBtSimulation().addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						if (verificaCampos() == true) {

							environment.getObjeto().setMassa(
									Double.parseDouble(configurationView
											.getTxMass().getText()));

							if (configurationView.getCbPropulsion()
									.getSelectedItem().equals("Manual")) {

								environment.getObjeto().setPropulsao(0);
								environment.getObjeto().setVelocidadeInicial(
										Integer.parseInt(configurationView
												.getTxVelocity().getText()));
							} else {
								environment.getObjeto().setPropulsao(1);
								environment.getObjeto().setVelocidadeInicial(0);
								// configurationView.getTxVelocity().setEditable(false);
							}

						}

						if (configurationView.getCbFriction().getSelectedItem() == atritoAsfalto) {
							environment.getSurface().setCoefFriction(Surface.asphalt);
						} else if (configurationView.getCbFriction().getSelectedItem() == atritoMadeira) {
							environment.getSurface().setCoefFriction(Surface.woodFriction);
						}

						if (configurationView.getCbGravity().getSelectedItem() == planetaTerra) {
							environment.setGravidade(Environment.earth);
						} else if (configurationView.getCbGravity().getSelectedItem() == planetaLua) {
							environment.setGravidade(Environment.moon);
						} else if (configurationView.getCbGravity().getSelectedItem() == planetaMarte) {
							environment.setGravidade(Environment.mars);
						}

						ObacControl obacControl = new ObacControl(environment);

						if (configurationView.getButtonGroupPlane().getSelection().getActionCommand().equalsIgnoreCase(ConfigurationView.sPlane)) {
							obacControl.planControl();
							new ObjectPlaneControl(obacControl, environment, scaleView, surfaceView);
							surfaceView.alteraEscala(environment.getSurface().getPontoFinal());

						} else if (configurationView.getButtonGroupPlane().getSelection().getActionCommand().equalsIgnoreCase(ConfigurationView.sPlaneCliff)) {
							
							obacControl.cliffControl();
							new ObjectPlaneCliffControl(obacControl, environment, scaleView, surfaceView);
							environment.getSurface().setEscala(SurfaceView.widthPlaneCliff/SurfaceView.widthPlaneCliffPx);
							//surfaceView.alteraEscala(environment.getSurface().getPontoFinal());

						}

						// evento da seleção do tipo da propulsão
						configurationView.getCbPropulsion().addActionListener(
								new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent arg0) {
										if (configurationView.getCbPropulsion()
												.getSelectedItem() == "Mola") {
											configurationView.getTxVelocity()
													.setEditable(false);
										} else {
											configurationView.getTxVelocity()
													.setEditable(true);
										}
									}
								});

					}
				});
	}
}
