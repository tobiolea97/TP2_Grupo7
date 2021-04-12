package dominio;

import java.util.Date;

public class DateFormat extends Date{

	
	@Override
	public boolean equals(Object fecha) {
		boolean bIguales = true;
		Date objFecha = (Date)fecha;
		
		if(this.getDate() != objFecha.getDate()) {
			bIguales = false;
		}
		if(this.getMonth() != objFecha.getMonth()) {
			bIguales = false;
		}
		if(this.getYear() != objFecha.getYear()) {
			bIguales = false;
		}
		if(this.getHours() != objFecha.getHours()) {
			bIguales = false;
		}
		if(this.getMinutes() != objFecha.getMinutes()) {
			bIguales = false;
		}
		
		return bIguales;
	}
	
}
