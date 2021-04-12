package dominio;

import java.util.Date;

public class Utils {
	
	public static DateFormat GetDate(int dia, int mes, int anio, int hora, int minutos) {
		DateFormat date = new DateFormat();
			
		date.setDate(dia);
		date.setMonth(mes-1);
		date.setYear(anio-1900);
		date.setHours(hora);
		date.setMinutes(minutos);
		date.setSeconds(0);
		
		return date;
	}
	
}
