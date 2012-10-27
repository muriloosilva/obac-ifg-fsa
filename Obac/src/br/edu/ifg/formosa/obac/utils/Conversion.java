package br.edu.ifg.formosa.obac.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Conversion {

	public static double rounding(int casas, double valor){
		if(valor!= 0){
			return new BigDecimal(valor).setScale(casas, RoundingMode.HALF_DOWN).doubleValue();
		}
		else
			return 0.0;
	}
	
}
