package br.edu.ifg.formosa.obac.controls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.JOptionPane;

import br.edu.ifg.formosa.obac.main.Obac;
import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.models.Surface;
import br.edu.ifg.formosa.obac.view.ConfigurationView;
import br.edu.ifg.formosa.obac.models.Object;

public class ConfigurationControl {
	
	private ConfigurationView configurationView;
	private Environment environment;
	private Object objeto;
	private Surface surface;
	private Obac obac;
		
	public ConfigurationControl(Obac obac, ConfigurationView configurationView, Environment environment){
		this.environment = environment;
		this.configurationView = configurationView;
		
		
		
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

					if(configurationView.getCbPropulsion().getSelectedItem() == "Manual"){
						
						environment.getObjeto().setPropulsao(0);
						environment.getObjeto().setVelocidade(Integer.parseInt(configurationView.getTxVelocity().getText()));
					}
					else{
						environment.getObjeto().setPropulsao(1);
						environment.getObjeto().setVelocidade(0);
						//configurationView.getTxVelocity().setEditable(false);
					}
					
					
				}
				ObacControl obacControl = new ObacControl(environment);
				
				if(configurationView.getButtonGroupPlane().getSelection().getActionCommand().equalsIgnoreCase(ConfigurationView.sPlane)){
					new ObjectPlaneControl(obacControl, environment);
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
	
		//evento da seleção do atrito
		configurationView.getCbFriction().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(configurationView.getCbFriction().getSelectedItem() == "Asfalto"){
					environment.getSurface().setCoefFriction(Surface.asphalt);
				}
				else if(configurationView.getCbFriction().getSelectedItem() == "Madeira"){
					environment.getSurface().setCoefFriction(Surface.woodFriction);
				}
			}
		});
		
		//evento da seleção da gravidade
		configurationView.getCbGravity().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(configurationView.getCbGravity().getSelectedItem() == "Terra"){
					environment.setGravidade(Environment.earth);
				}
				else if(configurationView.getCbGravity().getSelectedItem() == "Lua"){
					environment.setGravidade(Environment.moon);
				}
				else if(configurationView.getCbGravity().getSelectedItem() == "Marte"){
					environment.setGravidade(Environment.mars);
				}
			}
		});
		
	}	
}