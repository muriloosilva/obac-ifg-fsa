package br.edu.ifg.formosa.obac.controls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifg.formosa.obac.main.Obac;
import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.models.Object;
import br.edu.ifg.formosa.obac.models.Surface;
import br.edu.ifg.formosa.obac.view.ConfigurationView;
import br.edu.ifg.formosa.obac.view.ObjectView;
import br.edu.ifg.formosa.obac.view.ScaleView;
import br.edu.ifg.formosa.obac.view.SurfaceView;

public class ConfigurationControl {
	
	private ConfigurationView configurationView;
	private Environment environment;
	private Object objeto;
	private Surface surface;
	private Obac obac;
	private ScaleView scaleView;
	private SurfaceView surfaceView;	
	
	public ConfigurationControl(Obac obac, ConfigurationView configurationView, Environment environment, ScaleView scaleView, SurfaceView surfaceView){
		this.environment = environment;
		this.configurationView = configurationView;
		this.scaleView = scaleView;
		this.surfaceView = surfaceView;
		addActionListeners();		
	}
	
	public boolean verificaCampos(){
		//verifica se a velocidade inicial está preenchida quando a propulsão for manual
		if(configurationView.getCbPropulsion().getSelectedItem().toString() == "Manual" &&
				configurationView.getTxVelocity().getText().equals("")){
			JOptionPane.showMessageDialog(obac, "Preencha o campo: Velocidade Inicial"); 
			return false;
		}
		return true;
		
	}
	
	public void addActionListeners(){

		//evento de seleção do tipo de superficie
		configurationView.getPlane().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//trocar ambiente
			}
		});
		
		//evento de seleção do tipo de superficie
		configurationView.getPlaneClimb().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//trocar ambiente
			}
		});
		
		//evento de seleção do tipo de superficie
		configurationView.getPlaneDescent().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//trocar ambiente
			}
		});
		
		//evento de seleção do tipo de superficie
		configurationView.getPlanePrecipice().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//trocar ambiente
			}
		});
		
		//evento botao simular
		configurationView.getBtSimulation().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (verificaCampos() == true){

					environment.getObjeto().setMassa(Double.parseDouble(configurationView.getTxMass().getText()));

					if(configurationView.getCbPropulsion().getSelectedItem().equals("Manual")){
						
						environment.getObjeto().setPropulsao(0);
						environment.getObjeto().setVelocidadeInicial(Integer.parseInt(configurationView.getTxVelocity().getText()));
					}
					else{
						environment.getObjeto().setPropulsao(1);
						environment.getObjeto().setVelocidadeInicial(0);
						//configurationView.getTxVelocity().setEditable(false);
					}
					
					
				}
				
				if(configurationView.getCbFriction().getSelectedItem() == "Asfalto"){
					environment.getSurface().setCoefFriction(Surface.asphalt);
				}
				else if(configurationView.getCbFriction().getSelectedItem() == "Madeira"){
					environment.getSurface().setCoefFriction(Surface.woodFriction);
				}
				
				if(configurationView.getCbGravity().getSelectedItem() == "Terra"){
					environment.setGravidade(Environment.earth);
				}
				else if(configurationView.getCbGravity().getSelectedItem() == "Lua"){
					environment.setGravidade(Environment.moon);
				}
				else if(configurationView.getCbGravity().getSelectedItem() == "Marte"){
					environment.setGravidade(Environment.mars);
				}
				
				ObacControl obacControl = new ObacControl(environment);
				
				if(configurationView.getButtonGroupPlane().getSelection().getActionCommand().equalsIgnoreCase(ConfigurationView.sPlane)){
					new ObjectPlaneControl(obacControl, environment, scaleView, surfaceView);
					scaleView.alteraEscala(environment.getSurface().getPontoFinal());
				}
				
				
			}
		});
		
		//evento da seleção do tipo da propulsão
		configurationView.getCbPropulsion().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(configurationView.getCbPropulsion().getSelectedItem() == "Mola"){
					configurationView.getTxVelocity().setEditable(false);
				}
				else{
					configurationView.getTxVelocity().setEditable(true);
				}
			}
		});
		
	}	
}