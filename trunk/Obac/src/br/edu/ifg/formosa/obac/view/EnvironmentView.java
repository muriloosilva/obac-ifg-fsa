package br.edu.ifg.formosa.obac.view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EnvironmentView extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SurfaceView surfaceView;
	private ImageIcon img;
	private JLabel jLabel;
	
	//Terra: Asfalto - Madeira - Alumínio: Plano - Plano e Precipício - Plano e Subida - Plano e Descida;
	public static String terraAsfaltoPlano= "terraasfaltoplano.png";
	public static String terraAsfaltoPlanoPrecipicio = "terraasfaltoplanoprecipicio.png";
	public static String terraAsfaltoPlanoSubida = "terraasfaltoplanosubida.png";
	public static String terraAsfaltoPlanoDescida = "terraasfaltoplanodescida.png";
	public static String terraMadeiraPlano = "terramadeiraplano.png";
	public static String terraMadeiraPlanoPrecipicio = "terramadeiraplanoprecipicio.png";
	public static String terraMadeiraPlanoSubida = "terramadeiraplanosubida.png";
	public static String terraMadeiraPlanoDescida = "terramadeiraplanodescida.png";
	public static String terraAluminioPlano = "terraaluminioplano.png";
	public static String terraAluminioPlanoPrecipicio = "terraaluminioplanoprecipicio.png";
	public static String terraAluminioPlanoSubida = "terraaluminioplanosubida.png";
	public static String terraAluminioPlanoDescida = "terraaluminioplanodescida.png";
	
	//Lua: Asfalto - Madeira - Alumínio: Plano - Plano e Precipício - Plano e Subida - Plano e Descida;
	public static String luaAsfaltoPlano = "luaasfaltoplano.png";
	public static String luaAsfaltoPlanoPrecipicio = "luaasfaltoplanoprecipicio.png";
	public static String luaAsfaltoPlanoSubida = "luaasfaltoplanosubida.png";
	public static String luaAsfaltoPlanoDescida = "luaasfaltoplanodescida.png";
	public static String luaMadeiraPlano = "luamadeiraplano.png";
	public static String luaMadeiraPlanoPrecipicio = "luamadeiraplanoprecipicio.png";
	public static String luaMadeiraPlanoSubida = "luamadeiraplanosubida.png";
	public static String luaMadeiraPlanoDescida = "luamadeiraplanodescida.png";
	public static String luaAluminioPlano = "luaaluminioplano.png";
	public static String luaAluminioPlanoPrecipicio= "luaaluminioplanoprecipicio.png";
	public static String luaAluminioPlanoSubida = "luaaluminioplanosubida.png";
	public static String luaAluminioPlanoDescida = "luaaluminioplanodescida.png";
	
	//Marte: Asfalto - Madeira - Alumínio: Plano - Plano e Precipício - Plano e Subida - Plano e Descida;
	public static String marteAsfaltoPlano = "luaasfaltoplano.png";
	public static String marteAsfaltoPlanoPrecipicio = "luaasfaltoplanoprecipicio.png";
	public static String marteAsfaltoPlanoSubida = "luaasfaltoplanosubida.png";
	public static String marteAsfaltoPlanoDescida = "luaasfaltoplanodescida.png";
	public static String marteMadeiraPlano = "luamadeiraplano.png";
	public static String marteMadeiraPlanoPrecipicio = "luamadeiraplanoprecipicio.png";
	public static String marteMadeiraPlanoSubida = "luamadeiraplanosubida.png";
	public static String marteMadeiraPlanoDescida = "luamadeiraplanodescida.png";
	public static String marteAluminioPlano = "luaaluminioplano.png";
	public static String marteAluminioPlanoPrecipicio = "luaaluminioplanoprecipicio.png";
	public static String marteAluminioPlanoSubida = "luaaluminioplanosubida.png";
	public static String marteAluminioPlanoDescida = "luaaluminioplanodescida.png";
	
	
	
	public void changeImage(String image){
		jLabel.setIcon(new ImageIcon(image));
		jLabel.repaint();
	}
	
	public EnvironmentView(ScaleView scaleView, SurfaceView surfaceView, InfoPanelView infoPanelView){
		img = new ImageIcon("terraasfaltoplano.png");
		this.setLayout(null);
		this.setSize(600, 600);
		this.setLocation(200, 0);
		this.surfaceView = surfaceView;
		this.surfaceView.setBounds(0, 0, 600, 600);
		
		
		this.add(infoPanelView, 0);
		this.add(this.surfaceView, 1);
		
		jLabel = new JLabel(img);
		jLabel.setBounds(0, 0, 600, 600);
		this.add(jLabel, 2);		
	}
}