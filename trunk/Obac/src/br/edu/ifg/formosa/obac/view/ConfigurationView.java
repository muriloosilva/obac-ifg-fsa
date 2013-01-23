package br.edu.ifg.formosa.obac.view;

import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ConfigurationView extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox cbPropulsion;
	private TextField txVelocity;
	private ButtonGroup buttonGroupPlane;
	private JComboBox cbFriction;
	private ButtonGroup buttonGroupObstacle;
	private TextField txMass;
	private JButton btSimulation;
    private JButton btNewsimulation;
	private JRadioButton plane;
	private JRadioButton planeClimb;
	private JRadioButton planeDescent;
	private JRadioButton planePrecipice;
	private JComboBox cbGravity;
	public static final String sPlane = "Plano";
	public static final String sPlaneClimb = "Plano e Subida";
	public static final String sPlaneDescent = "Plano e Descida";
	public static final String sPlaneCliff = "Plano e Precipício";
	
	public ConfigurationView(){
		
		this.setLayout(null);
		this.setSize(200, 600);
		this.setBackground(Color.DARK_GRAY);
		
		Panel pPropulsion = new Panel(null);
		pPropulsion.setBounds(10, 40, 180, 75);
		pPropulsion.setBackground(Color.GRAY);
		
		Panel pAmbient = new Panel(null);
		pAmbient.setBounds(10, 140, 180, 295);
		pAmbient.setBackground(Color.GRAY);
		
		Panel pSurface = new Panel(null);
		pSurface.setBounds(10, 20, 160, 85);
		pSurface.setBackground(Color.WHITE);
		
		Panel pFriction = new Panel(null);
		pFriction.setBounds(10, 125, 160, 40);
		pFriction.setBackground(Color.WHITE);
		
		Panel pGravity = new Panel(null);
		pGravity.setBounds(10, 185, 160, 40);
		pGravity.setBackground(Color.WHITE);
		
		Panel pObstacle = new Panel(null);
		pObstacle.setBounds(10, 245, 160, 40);
		pObstacle.setBackground(Color.WHITE);
		
		Panel pObject = new Panel(null);
		pObject.setBounds(10, 460, 180, 50);
		pObject.setBackground(Color.GRAY);
		
		
		Label lbConfiguration = new Label("Configurações");
		lbConfiguration.setBounds(10, 0, 100, 20);
		lbConfiguration.setForeground(Color.WHITE);
		
		Label lbPropulsion = new Label("Propulsão");
		lbPropulsion.setBounds(10, 20, 100, 20);
		lbPropulsion.setForeground(Color.WHITE);
				
		String[] options = {"Manual", "Mola"}; 
				
		cbPropulsion = new JComboBox(options);
		cbPropulsion.setBounds(10, 5, 100, 20);
		
		
		Label lbVelocity = new Label("Velocidade ini.");
		lbVelocity.setBounds(10, 30, 100, 20);
		lbVelocity.setForeground(Color.WHITE);
		
		txVelocity = new TextField("");
		txVelocity.setBounds(10, 50, 100, 20);
		
		Label lbAmbient = new Label("Ambiente");
		lbAmbient.setBounds(10, 120, 100, 20);
		lbAmbient.setForeground(Color.WHITE);
		
		Label lbSurface = new Label("Superfície");
		lbSurface.setBounds(10, 0, 100, 20);
		lbSurface.setForeground(Color.WHITE);
		
		plane = new JRadioButton(sPlane);
		plane.setBounds(5, 5, 160, 15);
		plane.setBackground(Color.WHITE);
		plane.setActionCommand(sPlane);
		planeClimb = new JRadioButton(sPlaneClimb);
		planeClimb.setBounds(5, 25, 160, 15);
		planeClimb.setBackground(Color.WHITE);
		planeClimb.setActionCommand(sPlaneClimb);
		planeDescent = new JRadioButton(sPlaneDescent);
		planeDescent.setBounds(5, 45, 160, 15);
		planeDescent.setBackground(Color.WHITE);
		planeDescent.setActionCommand(sPlaneDescent);
		planePrecipice = new JRadioButton(sPlaneCliff);
		planePrecipice.setBounds(5, 65, 160, 15);
		planePrecipice.setBackground(Color.WHITE);
		planePrecipice.setActionCommand(sPlaneCliff);
		
		buttonGroupPlane = new ButtonGroup();
		buttonGroupPlane.add(plane);
		buttonGroupPlane.add(planeClimb);
		buttonGroupPlane.add(planeDescent);
		buttonGroupPlane.add(planePrecipice);
	    plane.setSelected(true);
	    
	    Label lbFriction = new Label("Atrito");
		lbFriction.setBounds(10, 105, 100, 20);
		lbFriction.setForeground(Color.WHITE);
		
		String[] options1 = {"Asfalto", "Madeira"}; 
		cbFriction = new JComboBox(options1);
		cbFriction.setBounds(10, 10, 100, 20);
		
		Label lbGravity = new Label("Gravidade");
		lbGravity.setBounds(10, 165, 100, 20);
		lbGravity.setForeground(Color.WHITE);
		
		String[] options2 = {"Terra", "Lua", "Marte"}; 
		cbGravity = new JComboBox(options2);
		cbGravity.setBounds(10, 10, 100, 20);
		
		Label lbObstacle = new Label("Obstaculo?");
		lbObstacle.setBounds(10, 225, 100, 20);
		lbObstacle.setForeground(Color.WHITE);
		
		JRadioButton notObstacle = new JRadioButton("Não");
		notObstacle.setBounds(10, 12, 50, 15);
		notObstacle.setBackground(Color.WHITE);
		JRadioButton yesObstacle = new JRadioButton("Sim");
		yesObstacle.setBounds(80, 12, 50, 15);
		yesObstacle.setBackground(Color.WHITE);
		notObstacle.setSelected(true);
		
		buttonGroupObstacle = new ButtonGroup();
		buttonGroupObstacle.add(yesObstacle);
		buttonGroupObstacle.add(notObstacle);
		
		Label lbObject = new Label("Objeto");
		lbObject.setBounds(10, 440, 100, 20);
		lbObject.setForeground(Color.WHITE);
		
		Label lbMass = new Label("Massa");
		lbMass.setBounds(10, 0, 100, 20);
		lbMass.setForeground(Color.WHITE);
		
		txMass = new TextField("");
		txMass.setBounds(10, 20, 100, 20);
		
		btSimulation = new JButton("Iniciar Simulação");
		btSimulation.setBounds(10, 520, 155, 20);
		btNewsimulation = new JButton("Nova Simulação");
		btNewsimulation.setBounds(10, 545, 155, 20);
	    
		
		
	// ---------------- add---------------
		this.add(lbConfiguration);
	    this.add(lbPropulsion);
	    this.add(pPropulsion);
	    pPropulsion.add(cbPropulsion);
	    pPropulsion.add(lbVelocity);
	    pPropulsion.add(txVelocity);
	    this.add(lbAmbient);
	    this.add(pAmbient);
	    pAmbient.add(lbSurface);
	    pAmbient.add(pSurface);	    
	    pSurface.add(plane);
	    pSurface.add(planeClimb);
	    pSurface.add(planeDescent);
	    pSurface.add(planePrecipice);
	    pAmbient.add(lbFriction);
	    pAmbient.add(pFriction);
	    pFriction.add(cbFriction);
	    pAmbient.add(lbGravity);
	    pAmbient.add(pGravity);
	    pGravity.add(cbGravity);
	    pAmbient.add(lbObstacle);
	    pAmbient.add(pObstacle);
	    pObstacle.add(yesObstacle);
	    pObstacle.add(notObstacle);
	    this.add(lbObject);
	    this.add(pObject);
	    pObject.add(lbMass);
	    pObject.add(txMass);
	    this.add(btSimulation);
	   
	}

	public JComboBox getCbPropulsion() {
		return cbPropulsion;
	}

	public void setCbPropulsion(JComboBox cbPropulsion) {
		this.cbPropulsion = cbPropulsion;
	}

	public TextField getTxVelocity() {
		return txVelocity;
	}

	public void setTxVelocity(TextField txVelocity) {
		this.txVelocity = txVelocity;
	}

	public ButtonGroup getButtonGroupPlane() {
		return buttonGroupPlane;
	}

	public void setButtonGroupPlane(ButtonGroup buttonGroupPlane) {
		this.buttonGroupPlane = buttonGroupPlane;
	}

	public JComboBox getCbFriction() {
		return cbFriction;
	}

	public void setCbFriction(JComboBox cbFriction) {
		this.cbFriction = cbFriction;
	}

	public ButtonGroup getButtonGroupObstacle() {
		return buttonGroupObstacle;
	}

	public void setButtonGroupObstacle(ButtonGroup buttonGroupObstacle) {
		this.buttonGroupObstacle = buttonGroupObstacle;
	}

	public TextField getTxMass() {
		return txMass;
	}

	public void setTxMass(TextField txMass) {
		this.txMass = txMass;
	}

	public JButton getBtSimulation() {
		return btSimulation;
	}

	public void setBtSimulation(JButton btSimulation) {
		this.btSimulation = btSimulation;
	}

	public JRadioButton getPlane() {
		return plane;
	}

	public void setPlane(JRadioButton plane) {
		this.plane = plane;
	}

	public JRadioButton getPlaneClimb() {
		return planeClimb;
	}

	public void setPlaneClimb(JRadioButton planeClimb) {
		this.planeClimb = planeClimb;
	}

	public JRadioButton getPlaneDescent() {
		return planeDescent;
	}

	public void setPlaneDescent(JRadioButton planeDescent) {
		this.planeDescent = planeDescent;
	}

	public JRadioButton getPlaneCliff() {
		return planePrecipice;
	}

	public void setPlanePrecipice(JRadioButton planePrecipice) {
		this.planePrecipice = planePrecipice;
	}

	public JComboBox getCbGravity() {
		return cbGravity;
	}

	public void setCbGravity(JComboBox cbGravity) {
		this.cbGravity = cbGravity;
	}
	
	public JButton getBtNewsimulation() {
		return btNewsimulation;
	}

	public void setBtNewsimulation(JButton btNewsimulation) {
		this.btNewsimulation = btNewsimulation;
	}
}