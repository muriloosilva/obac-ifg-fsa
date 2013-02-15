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
	
	//Terra: Asfalto - Madeira - Alumínio: Plano - Plano e Precipício - Plano e Subida - Plano e Descida - Queda Aberto - Queda Fechado;
	public static String terraAsfaltoPlano= "terraasfaltoplano.jpg";
	public static String terraAsfaltoPlanoPrecipicio = "terraasfaltoplanoprecipicio.jpg";
	public static String terraAsfaltoSubida = "terraasfaltosubida.jpg";
	public static String terraAsfaltoDescida = "terraasfaltodescida.jpg";
	public static String terraMadeiraPlano = "terramadeiraplano.jpg";
	public static String terraMadeiraPlanoPrecipicio = "terramadeiraplanoprecipicio.jpg";
	public static String terraMadeiraSubida = "terramadeirasubida.jpg";
	public static String terraMadeiraDescida = "terramadeiradescida.jpg";
	public static String terraAluminioPlano = "terraaluminioplano.jpg";
	public static String terraAluminioPlanoPrecipicio = "terraaluminioplanoprecipicio.jpg";
	public static String terraAluminioSubida = "terraaluminiosubida.jpg";
	public static String terraAluminioDescida = "terraaluminiodescida.jpg";
	public static String terraQuedaLivreAberto = "terraquedalivreaberto.jpg";
	public static String terraQuedaLivreFechado = "terraquedalivrefechado.jpg";
	
	//Lua: Asfalto - Madeira - Alumínio: Plano - Plano e Precipício - Plano e Subida - Plano e Descida - Queda Aberto - Queda Fechado;
	public static String luaAsfaltoPlano = "luaasfaltoplano.jpg";
	public static String luaAsfaltoPlanoPrecipicio = "luaasfaltoplanoprecipicio.jpg";
	public static String luaAsfaltoSubida = "luaasfaltosubida.jpg";
	public static String luaAsfaltoDescida = "luaasfaltodescida.jpg";
	public static String luaMadeiraPlano = "luamadeiraplano.jpg";
	public static String luaMadeiraPlanoPrecipicio = "luamadeiraplanoprecipicio.jpg";
	public static String luaMadeiraSubida = "luamadeirasubida.jpg";
	public static String luaMadeiraDescida = "luamadeiradescida.jpg";
	public static String luaAluminioPlano = "luaaluminioplano.jpg";
	public static String luaAluminioPlanoPrecipicio= "luaaluminioplanoprecipicio.jpg";
	public static String luaAluminioSubida = "luaaluminiosubida.jpg";
	public static String luaAluminioDescida = "luaaluminiodescida.jpg";
	public static String luaQuedaLivreAberto = "luaquedalivreaberto.jpg";
	public static String luaQuedaLivreFechado = "luaquedalivrefechado.jpg";
	
	//Marte: Asfalto - Madeira - Alumínio: Plano - Plano e Precipício - Plano e Subida - Plano e Descida - Queda Aberto - Queda Fechado;
	public static String marteAsfaltoPlano = "marteasfaltoplano.jpg";
	public static String marteAsfaltoPlanoPrecipicio = "marteasfaltoplanoprecipicio.jpg";
	public static String marteAsfaltoSubida = "marteasfaltosubida.jpg";
	public static String marteAsfaltoDescida = "marteasfaltodescida.jpg";
	public static String marteMadeiraPlano = "martemadeiraplano.jpg";
	public static String marteMadeiraPlanoPrecipicio = "martemadeiraplanoprecipicio.jpg";
	public static String marteMadeiraSubida = "martemadeirasubida.jpg";
	public static String marteMadeiraDescida = "martemadeiradescida.jpg";
	public static String marteAluminioPlano = "martealuminioplano.jpg";
	public static String marteAluminioPlanoPrecipicio = "martealuminioplanoprecipicio.jpg";
	public static String marteAluminioSubida = "martealuminiosubida.jpg";
	public static String marteAluminioDescida = "martealuminiodescida.jpg";
	public static String marteQuedaLivreAberto = "martequedalivreaberto.jpg";
	public static String marteQuedaLivreFechado = "martequedalivrefechado.jpg";
	
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