package br.edu.ifg.formosa.obac.visual;

import javax.swing.JPanel;

public class FrictionView extends JPanel{
	
	 private javax.swing.JButton jButton1;
	 private javax.swing.JLabel jLabel1;
	 private javax.swing.JPanel jPanel1;
	 private javax.swing.JPasswordField jPasswordField1;
	
	public FrictionView(){
		
	
		
		jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        
        this.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);

        jButton1.setText("jButton1");
        jPanel1.add(jButton1);

        jPasswordField1.setText("jPasswordField1");
        jPanel1.add(jPasswordField1);

        this.add(jPanel1, java.awt.BorderLayout.CENTER);
		
		
	}

}
