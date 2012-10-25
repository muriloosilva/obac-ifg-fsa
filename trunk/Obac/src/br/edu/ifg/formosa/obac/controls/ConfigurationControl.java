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
		
	public ConfigurationControl(Obac obac, ConfigurationView configurationView){
		
		this.configurationView = configurationView;
		
		
		
		environment = new Environment();
		objeto = new Object();
		surface = new Surface();
		
		addActionListeners();
		
		//objeto.setAltura(0);
		surface.setCoefFriction(0.62);
		
		environment.setObjeto(objeto);
		environment.setSurface(surface);
		
		ObacControl obacControl = new ObacControl(environment);
		
//		if(configurationView.getComboBoxSupercie() == "plano"){
//			
//			new ObjectPlaneControl(obacControl, environment);
//		}
		
//		configurationView.getBtnInit().addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				
//				//environment.setGravidade(configurationView.getCombox());
//				
//			}
//		});
		
	}
	
	public boolean verificaCampos(){
		//System.out.println(configurationView.getCbPropulsion().getSelectedItem().toString());
		//verifica se a propulsão é "Manual" e se a velocidade inicial está preenchida
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
				System.out.println("Plano");
			}
		});
		
		//evento de seleção do tipo de superficie
		configurationView.getPlaneClimb().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//trocar ambiente
				System.out.println("Plano e Subida");
			}
		});
		
		//evento de seleção do tipo de superficie
		configurationView.getPlaneDescent().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//trocar ambiente
				System.out.println("Plano e Descida");
			}
		});
		
		//evento de seleção do tipo de superficie
		configurationView.getPlanePrecipice().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//trocar ambiente
				System.out.println("Plano e Precipício");
			}
		});
		
		//evento botao simular
		configurationView.getBtSimulation().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (verificaCampos() == true){

					environment.getObjeto().setMassa(Double.parseDouble(configurationView.getTxMass().getText()));
					System.out.println(configurationView.getTxMass().getText());
					if(configurationView.getCbPropulsion().getSelectedItem() == "Manual"){
						
						environment.getObjeto().setPropulsao(0);
						environment.getObjeto().setVelocidade(Integer.parseInt(configurationView.getTxVelocity().getText()));
						System.out.println("Velocidade: "+configurationView.getTxVelocity().getText());
					}
					else{
						environment.getObjeto().setPropulsao(1);
						environment.getObjeto().setVelocidade(0);
						//configurationView.getTxVelocity().setEditable(false);
						System.out.println("Velocidade: 0");						
					}
					
					
				}
				
				
			}
		});
		
		//evento da seleção do tipo da propulsão
		configurationView.getCbPropulsion().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(configurationView.getCbPropulsion().getSelectedItem() == "Mola"){
					configurationView.getTxVelocity().setEditable(false);
					System.out.println("Mola");
				}
				else{
					configurationView.getTxVelocity().setEditable(true);
					System.out.println("Manual");
				}
			}
		});
	
		configurationView.getCbFriction().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(configurationView.getCbFriction().getSelectedItem() == "Asfalto"){
					environment.getSurface().setCoefFriction(Surface.asphalt);
					System.out.println("Atrito: asfalto");
				}
				else if(configurationView.getCbFriction().getSelectedItem() == "Madeira"){
					environment.getSurface().setCoefFriction(Surface.woodFriction);
					System.out.println("Atrito: madeira");
				}
			}
		});
		
		configurationView.getCbGravity().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(configurationView.getCbGravity().getSelectedItem() == "Terra"){
					environment.setGravidade(Environment.earth);
					System.out.println("Gravidade: terra");
				}
				else if(configurationView.getCbGravity().getSelectedItem() == "Lua"){
					environment.setGravidade(Environment.moon);
					System.out.println("Gravidade: Lua");
				}
				else if(configurationView.getCbGravity().getSelectedItem() == "Marte"){
					environment.setGravidade(Environment.mars);
					System.out.println("Gravidade: Marte");
				}
			}
		});
		
	}	
}