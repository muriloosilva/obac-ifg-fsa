package br.edu.ifg.formosa.obac.view;

import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

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
	private JRadioButton Climb;
	private JRadioButton Descent;
	private JRadioButton planePrecipice;
	private JRadioButton fall;
	
	private Label lbFriction;
	private Label lbCoefRestitution;
	private final Label lbCurrentCoefRestitution;
	
	private final JSlider cDeslizante;
	
	private Panel pAmbient;
	private Panel pFriction;
	private Panel pCoefRestitution;

	private JRadioButton notObstacle = new JRadioButton("Não");
	private JRadioButton yesObstacle = new JRadioButton("Sim");

	private JComboBox cbGravity;
	public static final String sPlane = "Plano";
	public static final String sClimb = "Subida";
	public static final String sDescent = "Descida";
	public static final String sPlaneCliff = "Plano e Precipício";
	public static final String sFall = "Queda";
	
	public ConfigurationView(){
		
		this.setLayout(null);
		this.setSize(200, 600);
		this.setBackground(Color.DARK_GRAY);
		
		Panel pPropulsion = new Panel(null);
		pPropulsion.setBounds(10, 40, 180, 75);
		pPropulsion.setBackground(Color.GRAY);
		
		pAmbient = new Panel(null);
		pAmbient.setBounds(10, 140, 180, 325);
		pAmbient.setBackground(Color.GRAY);
		
		Panel pSimulation = new Panel(null);
		pSimulation.setBounds(10, 20, 160, 105);
		pSimulation.setBackground(Color.WHITE);
		
		pFriction = new Panel(null);
		pFriction.setBounds(10, 155, 160, 40);
		pFriction.setBackground(Color.WHITE);
		
		pCoefRestitution = new Panel(null);
		pCoefRestitution.setBounds(10, 155, 160, 40);
		pCoefRestitution.setBackground(Color.WHITE);
		
		Panel pGravity = new Panel(null);
		pGravity.setBounds(10, 215, 160, 40);
		pGravity.setBackground(Color.WHITE);
		
		Panel pObstacle = new Panel(null);
		pObstacle.setBounds(10, 275, 160, 40);
		pObstacle.setBackground(Color.WHITE);
		
		Panel pObject = new Panel(null);
		pObject.setBounds(10, 490, 180, 50);
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
		
		Label lbSimulation = new Label("Simulação");
		lbSimulation.setBounds(10, 0, 100, 20);
		lbSimulation.setForeground(Color.WHITE);
		
		plane = new JRadioButton(sPlane);
		plane.setBounds(5, 5, 160, 15);
		plane.setBackground(Color.WHITE);
		plane.setActionCommand(sPlane);
		Climb = new JRadioButton(sClimb);
		Climb.setBounds(5, 25, 160, 15);
		Climb.setBackground(Color.WHITE);
		Climb.setActionCommand(sClimb);
		Descent = new JRadioButton(sDescent);
		Descent.setBounds(5, 45, 160, 15);
		Descent.setBackground(Color.WHITE);
		Descent.setActionCommand(sDescent);
		planePrecipice = new JRadioButton(sPlaneCliff);
		planePrecipice.setBounds(5, 65, 160, 15);
		planePrecipice.setBackground(Color.WHITE);
		planePrecipice.setActionCommand(sPlaneCliff);
		fall = new JRadioButton(sFall);
		fall.setBounds(5, 85, 160, 15);
		fall.setBackground(Color.WHITE);
		fall.setActionCommand(sFall);
		
		buttonGroupPlane = new ButtonGroup();
		buttonGroupPlane.add(plane);
		buttonGroupPlane.add(Climb);
		buttonGroupPlane.add(Descent);
		buttonGroupPlane.add(planePrecipice);
		buttonGroupPlane.add(fall);
	    plane.setSelected(true);
	    
	    lbFriction = new Label("Atrito");
		lbFriction.setBounds(10, 135, 100, 20);
		lbFriction.setForeground(Color.WHITE);
		
		lbCoefRestitution = new Label("Coef. de Restituição");
		lbCoefRestitution.setBounds(10, 135, 120, 20);
		lbCoefRestitution.setForeground(Color.WHITE);
		
		String[] optionsFriction = {"Asfalto", "Madeira", "Aluminio"}; 
		cbFriction = new JComboBox(optionsFriction);
		cbFriction.setBounds(10, 10, 100, 20);
		
		cDeslizante = new JSlider(JSlider.HORIZONTAL, 0, 100, 1);
		cDeslizante.setBounds(5, 5, 145, 18);
		
		cDeslizante.setMajorTickSpacing(25);  
		//cDeslizante.setPaintTicks(true);  
	    lbCurrentCoefRestitution = new Label("0.0");
	    lbCurrentCoefRestitution.setBounds(50, 23, 50, 20);
	    
	    cDeslizante.addChangeListener(new javax.swing.event.ChangeListener(){  
	        public void stateChanged(javax.swing.event.ChangeEvent ce){
	        	lbCurrentCoefRestitution.setText("" + (cDeslizante.getValue()/100.0));
	        	System.out.println(cDeslizante.getValue()/100.0);  
	        }  
	      }); 
		
		Label lbGravity = new Label("Gravidade");
		lbGravity.setBounds(10, 195, 100, 20);
		lbGravity.setForeground(Color.WHITE);
		
		String[] optionsPlanet = {"Terra", "Lua", "Marte"}; 
		cbGravity = new JComboBox(optionsPlanet);
		cbGravity.setBounds(10, 10, 100, 20);
		
		Label lbObstacle = new Label("Obstaculo?");
		lbObstacle.setBounds(10, 255, 100, 20);
		lbObstacle.setForeground(Color.WHITE);
		
		notObstacle.setBounds(10, 12, 50, 15);
		notObstacle.setBackground(Color.WHITE);
		yesObstacle.setBounds(80, 12, 50, 15);
		yesObstacle.setBackground(Color.WHITE);
		notObstacle.setSelected(true);
		
		buttonGroupObstacle = new ButtonGroup();
		buttonGroupObstacle.add(yesObstacle);
		buttonGroupObstacle.add(notObstacle);
		
		Label lbObject = new Label("Objeto");
		lbObject.setBounds(10, 470, 100, 20);
		lbObject.setForeground(Color.WHITE);
		
		Label lbMass = new Label("Massa");
		lbMass.setBounds(10, 0, 100, 20);
		lbMass.setForeground(Color.WHITE);
		
		txMass = new TextField("");
		txMass.setBounds(10, 20, 100, 20);
		
		btSimulation = new JButton("Iniciar Simulação");
		btSimulation.setBounds(10, 550, 155, 20);
		btNewsimulation = new JButton("Nova Simulação");
		btNewsimulation.setBounds(10, 575, 155, 20);
	    
		
		
	// ---------------- add---------------
		this.add(lbConfiguration);
	    this.add(lbPropulsion);
	    this.add(pPropulsion);
	    pPropulsion.add(cbPropulsion);
	    pPropulsion.add(lbVelocity);
	    pPropulsion.add(txVelocity);
	    this.add(lbAmbient);
	    this.add(pAmbient);
	    pAmbient.add(lbSimulation);
	    pAmbient.add(pSimulation);	    
	    pSimulation.add(plane);
	    pSimulation.add(Climb);
	    pSimulation.add(Descent);
	    pSimulation.add(planePrecipice);
	    pAmbient.add(lbFriction);
	    pAmbient.add(pFriction);
	    pFriction.add(cbFriction);
	    pCoefRestitution.add(cDeslizante);
	    pCoefRestitution.add(lbCurrentCoefRestitution);
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
	    pSimulation.add(fall);
	   
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
		return Climb;
	}

	public void setPlaneClimb(JRadioButton planeClimb) {
		this.Climb = planeClimb;
	}

	public JRadioButton getPlaneDescent() {
		return Descent;
	}

	public void setPlaneDescent(JRadioButton planeDescent) {
		this.Descent = planeDescent;
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
	
	public void setNotobstacle(JRadioButton notObstacle){
		this.notObstacle = notObstacle;
	}
	
	public JRadioButton getNotobstacle(){
		return notObstacle;
	}
	
	public void setYesobstacle(JRadioButton yesObstacle){
		this.yesObstacle = yesObstacle;
	}

	public JRadioButton getYesobstacle() {
		return yesObstacle;
	}
	public JRadioButton getFall() {
		return fall;
	}

	public void setFall(JRadioButton fall) {
		this.fall = fall;
	}

	public Panel getpFriction() {
		return pFriction;
	}

	public void setpFriction(Panel pFriction) {
		this.pFriction = pFriction;
	}

	public Panel getpCoefRestitution() {
		return pCoefRestitution;
	}

	public void setpCoefRestitution(Panel pCoefRestitution) {
		this.pCoefRestitution = pCoefRestitution;
	}

	public Label getLbFriction() {
		return lbFriction;
	}

	public void setLbFriction(Label lbFriction) {
		this.lbFriction = lbFriction;
	}

	public Label getLbCoefRestitution() {
		return lbCoefRestitution;
	}

	public void setLbCoefRestitution(Label lbCoefRestitution) {
		this.lbCoefRestitution = lbCoefRestitution;
	}

	public Panel getpAmbient() {
		return pAmbient;
	}

	public void setpAmbient(Panel pAmbient) {
		this.pAmbient = pAmbient;
	}

	public Label getLbCurrentCoefRestitution() {
		return lbCurrentCoefRestitution;
	}

	public JSlider getcDeslizante() {
		return cDeslizante;
	}
	
	
}