package br.edu.ifg.formosa.obac.view;

import java.io.File;
import java.security.AccessController;
import java.security.PrivilegedAction;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.edu.ifg.formosa.obac.main.Obac;

public class EnvironmentView extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SurfaceView surfaceView;
	private ImageIcon img;
	private JLabel jLabel;
	private static String dir = "br/edu/ifg/formosa/obac/images/";
	
	//Terra: Asfalto - Madeira - Alumínio: Plano - Plano e Precipício - Plano e Subida - Plano e Descida;
	public static String terraAsfaltoPlano= "terraasfaltoplano.png";
	public static String terraAsfaltoPlanoPrecipicio = "terraasfaltoplanoprecipicio.png";
	public static String terraAsfaltoSubida = "terraasfaltosubida.png";
	public static String terraAsfaltoDescida = "terraasfaltodescida.png";
	public static String terraMadeiraPlano = "terramadeiraplano.png";
	public static String terraMadeiraPlanoPrecipicio = "terramadeiraplanoprecipicio.png";
	public static String terraMadeiraSubida = "terramadeirasubida.png";
	public static String terraMadeiraDescida = "terramadeiradescida.png";
	public static String terraAluminioPlano = "terraaluminioplano.png";
	public static String terraAluminioPlanoPrecipicio = "terraaluminioplanoprecipicio.png";
	public static String terraAluminioSubida = "terraaluminiosubida.png";
	public static String terraAluminioDescida = "terraaluminiodescida.png";
	
	//Lua: Asfalto - Madeira - Alumínio: Plano - Plano e Precipício - Plano e Subida - Plano e Descida;
	public static String luaAsfaltoPlano = "luaasfaltoplano.png";
	public static String luaAsfaltoPlanoPrecipicio = "luaasfaltoplanoprecipicio.png";
	public static String luaAsfaltoSubida = "luaasfaltosubida.png";
	public static String luaAsfaltoDescida = "luaasfaltodescida.png";
	public static String luaMadeiraPlano = "luamadeiraplano.png";
	public static String luaMadeiraPlanoPrecipicio = "luamadeiraplanoprecipicio.png";
	public static String luaMadeiraSubida = "luamadeirasubida.png";
	public static String luaMadeiraDescida = "luamadeiradescida.png";
	public static String luaAluminioPlano = "luaaluminioplano.png";
	public static String luaAluminioPlanoPrecipicio= "luaaluminioplanoprecipicio.png";
	public static String luaAluminioSubida = "luaaluminiosubida.png";
	public static String luaAluminioDescida = "luaaluminiodescida.png";
	
	//Marte: Asfalto - Madeira - Alumínio: Plano - Plano e Precipício - Plano e Subida - Plano e Descida;
	public static String marteAsfaltoPlano = "marteasfaltoplano.png";
	public static String marteAsfaltoPlanoPrecipicio = "marteasfaltoplanoprecipicio.png";
	public static String marteAsfaltoSubida = "marteasfaltosubida.png";
	public static String marteAsfaltoDescida = "marteasfaltodescida.png";
	public static String marteMadeiraPlano = "martemadeiraplano.png";
	public static String marteMadeiraPlanoPrecipicio = "martemadeiraplanoprecipicio.png";
	public static String marteMadeiraSubida = "martemadeirasubida.png";
	public static String marteMadeiraDescida = "martemadeiradescida.png";
	public static String marteAluminioPlano = "martealuminioplano.png";
	public static String marteAluminioPlanoPrecipicio = "martealuminioplanoprecipicio.png";
	public static String marteAluminioSubida = "martealuminiosubida.png";
	public static String marteAluminioDescida = "martealuminiodescida.png";
	
	private Obac obac;
	
	
	
	public void changeImage(String image){
		
		jLabel.setIcon(new ImageIcon(obac.getImage(obac.getCodeBase(), dir + image)));
		jLabel.repaint();
	}
	
	public EnvironmentView(ScaleView scaleView, SurfaceView surfaceView, InfoPanelView infoPanelView, Obac obac){
		//System.out.println()
		this.obac = obac;
		img = new ImageIcon("");
		
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
		changeImage(terraAsfaltoPlano);
	}
}