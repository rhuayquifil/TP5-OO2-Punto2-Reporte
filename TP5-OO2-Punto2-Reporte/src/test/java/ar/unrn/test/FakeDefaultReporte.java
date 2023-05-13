package ar.unrn.test;

import java.io.File;

import ar.unrn.domain.model.DomainExceptions;
import ar.unrn.domain.model.Reporte;

public class FakeDefaultReporte implements Reporte {

	private String reporte;
	private String resultado;

	public FakeDefaultReporte(String reporte) {
		this.reporte = reporte;
		this.resultado = "";
	}

	public void export(File file) throws DomainExceptions {

//		try {
//			Files.write(file.toPath(), this.reporte.getBytes());
//		} catch (IOException e) {
//			throw new DomainExceptions(e.getMessage());
//		}
		resultado = reporte;
	}

	String resultado() {
		return resultado;
	}
}
