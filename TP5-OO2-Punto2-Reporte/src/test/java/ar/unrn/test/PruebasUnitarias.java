package ar.unrn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import ar.unrn.domain.model.CheckExist;
import ar.unrn.domain.model.CheckNull;
import ar.unrn.domain.model.DomainExceptions;
import ar.unrn.domain.model.Reporte;

class PruebasUnitarias {

	@Test
	void checkExistsYNull() {
		File fichero = new File("C:\\Users\\ezehu\\git\\TP5-OO2-Punto1\\reporte.txt");

		FakeDefaultReporte reporte = new FakeDefaultReporte("registro prueba");

		try {
			Reporte checkExistsYNull = new CheckExist(new CheckNull(reporte));

			checkExistsYNull.export(fichero);

			assertEquals("registro prueba", reporte.resultado());
		} catch (DomainExceptions e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	void checkNull() {
		File fichero = new File("C:\\Users\\ezehu\\git\\TP5-OO2-Punto1\\reporte.txt");

		FakeDefaultReporte reporte = new FakeDefaultReporte("registro prueba check null");

		try {
			Reporte checkNull = new CheckNull(reporte);

			checkNull.export(fichero);

			assertEquals("registro prueba check null", reporte.resultado());
		} catch (DomainExceptions e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	void checkExists() {
		File fichero = new File("C:\\Users\\ezehu\\git\\TP5-OO2-Punto1\\reporte.txt");

		FakeDefaultReporte reporte = new FakeDefaultReporte("registro prueba check exist");

		try {
			Reporte checkExists = new CheckExist(reporte);

			checkExists.export(fichero);

			assertEquals("registro prueba check exist", reporte.resultado());
		} catch (DomainExceptions e) {
			System.out.println(e.getMessage());
		}
	}

}
