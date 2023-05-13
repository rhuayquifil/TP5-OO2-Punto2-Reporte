package ar.unrn.main;

import java.io.File;

import ar.unrn.domain.model.CheckExist;
import ar.unrn.domain.model.CheckNull;
import ar.unrn.domain.model.DefaultReporte;
import ar.unrn.domain.model.DomainExceptions;
import ar.unrn.domain.model.Reporte;

public class Main {

	public static void main(String[] args) {
		File fichero = new File("C:\\Users\\ezehu\\git\\TP5-OO2-Punto2-Reporte\\reporte.txt");

//		DefaultReporte reporte = new DefaultReporte("registro prueba2");

//		Reporte checkNull = new CheckNull(new DefaultReporte("registro prueba2222"));

		Reporte checkExistsYNull = new CheckExist(new CheckNull(new DefaultReporte("registro prueba2")));

		try {
			checkExistsYNull.export(fichero);
		} catch (DomainExceptions e) {
			System.out.println(e.getMessage());
		}
	}

}
