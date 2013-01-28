package br.edu.ifg.formosa.obac.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Conversion {

	public static double rounding(int casas, double valor){
			return new BigDecimal(valor).setScale(casas, RoundingMode.HALF_DOWN).doubleValue();
	}
	
}