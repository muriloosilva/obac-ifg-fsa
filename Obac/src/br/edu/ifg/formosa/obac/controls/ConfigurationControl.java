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
import br.edu.ifg.formosa.obac.view.InfoPanelView;
import br.edu.ifg.formosa.obac.view.ObjectView;
import br.edu.ifg.formosa.obac.view.ScaleView;
import br.edu.ifg.formosa.obac.view.SurfaceView;

public class ConfigurationControl {

	private EnvironmentView environmentView;
	private InfoPanelView infoPanelView;
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
	private final String planetaLua = "Lua";
	private final String planetaMarte = "Marte";
	private ObjectGenericControl objectGenericControl = null;
	private boolean removedPanelFriction  =false;

	public ConfigurationControl(Obac obac, ConfigurationView configurationView,
			Environment environment, ScaleView scaleView,
			SurfaceView surfaceView, EnvironmentView environmentView, InfoPanelView infoPanelView) {
		this.environment = environment;
		this.configurationView = configurationView;
		this.scaleView = scaleView;
		this.surfaceView = surfaceView;
		this.environmentView = environmentView;
		this.infoPanelView = infoPanelView;
		addActionListeners();
	}

	public boolean verificaCampos() {
		// verifica se a velocidade inicial e a massa foram preenchidas quando a propulsão
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
	
	public void lockAll(){
		configurationView.getCbPropulsion().setEnabled(false);
		configurationView.getTxVelocity().setEnabled(false);
		configurationView.getPlane().setEnabled(false);
		configurationView.getPlaneClimb().setEnabled(false);
		configurationView.getPlaneDescent().setEnabled(false);
		configurationView.getPlaneCliff().setEnabled(false);
		configurationView.getFall().setEnabled(false);
		configurationView.getCbFriction().setEnabled(false);
		configurationView.getCbGravity().setEnabled(false);
		configurationView.getNotobstacle().setEnabled(false);
		configurationView.getYesobstacle().setEnabled(false);
		configurationView.getTxMass().setEnabled(false);
		configurationView.getcDeslizante().setEnabled(false);
	}
	
	public void unLockAll(){
		configurationView.getCbPropulsion().setEnabled(true);
		configurationView.getPlaneClimb().setEnabled(true);
		configurationView.getTxVelocity().setEnabled(true);
		configurationView.getPlane().setEnabled(true);
		configurationView.getPlaneClimb().setEnabled(true);
		configurationView.getPlaneDescent().setEnabled(true);
		configurationView.getPlaneCliff().setEnabled(true);
		configurationView.getFall().setEnabled(true);
		configurationView.getCbFriction().setEnabled(true);
		configurationView.getCbGravity().setEnabled(true);
		configurationView.getNotobstacle().setEnabled(true);
		configurationView.getYesobstacle().setEnabled(true);
		configurationView.getTxMass().setEnabled(true);
		configurationView.getcDeslizante().setEnabled(true);
		
	}
	
	public void resetInfoPanel(){
		infoPanelView.getInfoPanelControl().changeValueGravity(0);
		infoPanelView.getInfoPanelControl().changeValueCoefAtrito(0); 
		infoPanelView.getInfoPanelControl().changeValueForçaAtrito(0);
		infoPanelView.getInfoPanelControl().changeValueForçaNormal(0);
		infoPanelView.getInfoPanelControl().changeValuePosFinal(0);
		infoPanelView.getInfoPanelControl().changeValueAceleração(0);
		infoPanelView.getInfoPanelControl().changeValueTempo(0);
		infoPanelView.getInfoPanelControl().changeValuePosAtualEixox(0);
		infoPanelView.getInfoPanelControl().changeValuePosAtualEixoy(0);
	}

	public void addActionListeners() {

		// evento de seleção do tipo de superficie
		configurationView.getPlane().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CheckImages.checkImageSelected(configurationView, environmentView, surfaceView, false);
				configurationView.getCbFriction().setEnabled(true);
				
				if(removedPanelFriction){
					configurationView.getpAmbient().remove(configurationView.getpCoefRestitution());
					configurationView.getpAmbient().remove(configurationView.getLbCoefRestitution());
					configurationView.getpAmbient().add(configurationView.getpFriction());
					configurationView.getpAmbient().add(configurationView.getLbFriction());
					configurationView.getpAmbient().repaint();
					removedPanelFriction = false;
					
				}
				
			}
		});
		
		

		// evento de seleção do tipo de superficie
		configurationView.getPlaneClimb().addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						CheckImages.checkImageSelected(configurationView, environmentView, surfaceView, false);
						configurationView.getCbFriction().setEnabled(true);
						
						if(removedPanelFriction){
							configurationView.getpAmbient().remove(configurationView.getpCoefRestitution());
							configurationView.getpAmbient().remove(configurationView.getLbCoefRestitution());
							configurationView.getpAmbient().add(configurationView.getpFriction());
							configurationView.getpAmbient().add(configurationView.getLbFriction());
							configurationView.getpAmbient().repaint();
							removedPanelFriction = false;
							
						}
						
					}
				});

		// evento de seleção do tipo de superficie
		configurationView.getPlaneDescent().addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						CheckImages.checkImageSelected(configurationView, environmentView, surfaceView, false);
						configurationView.getCbFriction().setEnabled(true);
						
						if(removedPanelFriction){
							configurationView.getpAmbient().remove(configurationView.getpCoefRestitution());
							configurationView.getpAmbient().remove(configurationView.getLbCoefRestitution());
							configurationView.getpAmbient().add(configurationView.getpFriction());
							configurationView.getpAmbient().add(configurationView.getLbFriction());
							configurationView.getpAmbient().repaint();
							removedPanelFriction = false;
							
						}
						
					}
				});

		// evento de seleção do tipo de superficie
		configurationView.getPlaneCliff().addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						CheckImages.checkImageSelected(configurationView, environmentView, surfaceView, false);
						configurationView.getCbFriction().setEnabled(true);
						
						if(removedPanelFriction){
							configurationView.getpAmbient().remove(configurationView.getpCoefRestitution());
							configurationView.getpAmbient().remove(configurationView.getLbCoefRestitution());
							configurationView.getpAmbient().add(configurationView.getpFriction());
							configurationView.getpAmbient().add(configurationView.getLbFriction());
							configurationView.getpAmbient().repaint();
							removedPanelFriction = false;
							
						}
						
					}
				});
		
		// evento de seleção do tipo de simulação
		configurationView.getFall().addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						CheckImages.checkImageSelected(configurationView, environmentView, surfaceView, false);
						configurationView.getpAmbient().remove(configurationView.getpFriction());
						configurationView.getpAmbient().remove(configurationView.getLbFriction());
						configurationView.getpAmbient().add(configurationView.getpCoefRestitution());
						configurationView.getpAmbient().add(configurationView.getLbCoefRestitution());
						configurationView.getpAmbient().repaint();
						removedPanelFriction = true;
					}
				});
		
		configurationView.getCbFriction().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CheckImages.checkImageSelected(configurationView, environmentView, surfaceView, false);
			}
		});
		
		configurationView.getCbGravity().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CheckImages.checkImageSelected(configurationView, environmentView, surfaceView, false);
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
								lockAll();
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
							environment.getSurface().setCoefFriction(Surface.asphaltFriction);
						} else if (configurationView.getCbFriction().getSelectedItem() == atritoMadeira) {
							environment.getSurface().setCoefFriction(Surface.woodFriction);
						} else if(configurationView.getCbFriction().getSelectedItem() == atritoAluminio){
							environment.getSurface().setCoefFriction(Surface.aluminumFriction);
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

						} else if (configurationView.getButtonGroupPlane().getSelection().getActionCommand().equalsIgnoreCase(ConfigurationView.sDescent)) {
							
							obacControl.descentControl();
							objectGenericControl = new ObjectDescentControl(obacControl, environment, scaleView, surfaceView);
							//environment.getSurface().setEscala(SurfaceView.widthPlaneCliff/SurfaceView.widthPlaneCliffPx);
							surfaceView.alteraPontosEscala(environment.getSurface().getPontoFinal());

						}
						
						else if (configurationView.getButtonGroupPlane().getSelection().getActionCommand().equalsIgnoreCase(ConfigurationView.sFall)) {
							
							CheckImages.checkImageSelected(configurationView, environmentView, surfaceView, true);
							obacControl.fallControl(Double.parseDouble(configurationView.getLbCurrentCoefRestitution().getText()));
							objectGenericControl = new ObjectFallControl(obacControl, environment, scaleView, surfaceView);
							//environment.getSurface().setEscala(SurfaceView.widthPlaneCliff/SurfaceView.widthPlaneCliffPx);
							surfaceView.alteraPontosEscala(environment.getSurface().getPontoFinal());

						}
						
						else if (configurationView.getButtonGroupPlane().getSelection().getActionCommand().equalsIgnoreCase(ConfigurationView.sClimb)) {
							
							obacControl.climbControl();
							objectGenericControl = new ObjectClimbControl(obacControl, environment, scaleView, surfaceView);
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
							CheckImages.checkImageSelected(configurationView, environmentView, surfaceView, false);
							configurationView.remove(configurationView.getBtNewsimulation());
							configurationView.repaint();
							unLockAll();
							resetInfoPanel();
						}
				});
	}
}
