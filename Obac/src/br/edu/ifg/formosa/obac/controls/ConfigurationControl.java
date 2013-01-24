package br.edu.ifg.formosa.obac.controls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import br.edu.ifg.formosa.obac.main.Obac;
import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.models.Object;
import br.edu.ifg.formosa.obac.models.Surface;
import br.edu.ifg.formosa.obac.utils.CheckImages;
import br.edu.ifg.formosa.obac.utils.KeyBoardControl;
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
	private final String planetaMarte = "Marte";
	private ObjectGenericControl objectGenericControl = null;

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
			return false;
		}
		return true;
	}

	public void addActionListeners() {

		// evento de seleção do tipo de superficie
		configurationView.getPlane().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CheckImages.checkImageSelected(configurationView, environmentView, surfaceView);
			}
		});
		
		

		// evento de seleção do tipo de superficie
		configurationView.getPlaneClimb().addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						CheckImages.checkImageSelected(configurationView, environmentView, surfaceView);
					}
				});

		// evento de seleção do tipo de superficie
		configurationView.getPlaneDescent().addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						CheckImages.checkImageSelected(configurationView, environmentView, surfaceView);
					}
				});

		// evento de seleção do tipo de superficie
		configurationView.getPlaneCliff().addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						CheckImages.checkImageSelected(configurationView, environmentView, surfaceView);
					}
				});
		
		configurationView.getCbFriction().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CheckImages.checkImageSelected(configurationView, environmentView, surfaceView);
			}
		});
		
		configurationView.getCbGravity().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CheckImages.checkImageSelected(configurationView, environmentView, surfaceView);
			}
		});
		
		configurationView.getTxMass().addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				KeyBoardControl.verifyIsNumber(arg0, configurationView.getTxMass());
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
	
			}
		});
		
		configurationView.getTxVelocity().addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				KeyBoardControl.verifyIsNumber(arg0, configurationView.getTxVelocity());
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				
				
			}
		});
			

		// evento botao simular
		configurationView.getBtSimulation().addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
			
						if (verificaCampos() == true) {
							
							if (configurationView.getBtSimulation().getText() == "Iniciar Simulação"){
								configurationView.getBtSimulation().setText("Parar Simulação");
								configurationView.add(configurationView.getBtNewsimulation());
								configurationView.repaint();
							}
							else if (configurationView.getBtSimulation().getText() == "Parar Simulação"){
								configurationView.getBtSimulation().setText("Continuar Simulação");
								objectGenericControl.pausar();
								return;
								
							}
							else if (configurationView.getBtSimulation().getText() == "Continuar Simulação"){
								configurationView.getBtSimulation().setText("Parar Simulação");
								objectGenericControl.continuar();
								return;
							}

							environment.getObjeto().setMassa(
									Double.parseDouble(configurationView
											.getTxMass().getText()));

							if (configurationView.getCbPropulsion()
									.getSelectedItem().equals("Manual")) {

								environment.getObjeto().setPropulsao(0);
								environment.getObjeto().setVelocidadeInicial(
										Double.parseDouble(configurationView.getTxVelocity().getText()));
							} else {
								environment.getObjeto().setPropulsao(1);
								environment.getObjeto().setVelocidadeInicial(0);
								configurationView.getTxVelocity().setEditable(false);
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
							objectGenericControl = new ObjectPlaneControl(obacControl, environment, scaleView, surfaceView);
							surfaceView.alteraPontosEscala(environment.getSurface().getPontoFinal());

						} else if (configurationView.getButtonGroupPlane().getSelection().getActionCommand().equalsIgnoreCase(ConfigurationView.sPlaneCliff)) {
							
							obacControl.cliffControl();
							objectGenericControl = new ObjectPlaneCliffControl(obacControl, environment, scaleView, surfaceView);
							//environment.getSurface().setEscala(SurfaceView.widthPlaneCliff/SurfaceView.widthPlaneCliffPx);
							surfaceView.alteraPontosEscala(environment.getSurface().getPontoFinal());

						}

						// evento da seleção do tipo da propulsão
						configurationView.getCbPropulsion().addActionListener(
								new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
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
					}	
				});
		
		configurationView.getBtNewsimulation().addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
							configurationView.getTxVelocity().setText("");
							configurationView.getTxMass().setText("");
							configurationView.getBtSimulation().setText("Iniciar Simulação");
							objectGenericControl.parar();
							surfaceView.alteraPontosEscala(SurfaceView.pontoFinalEscalaDefault);
							CheckImages.checkImageSelected(configurationView, environmentView, surfaceView);
							configurationView.remove(configurationView.getBtNewsimulation());
							configurationView.repaint();
						}
				});
	}
}
