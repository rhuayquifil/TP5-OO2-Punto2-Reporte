package ar.unrn.domain.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class DefaultReporte implements Reporte {
	private String reporte;

	public DefaultReporte(String reporte) {
		this.reporte = reporte;
	}

	public void export(File file) throws DomainExceptions {

		try {
			Files.write(file.toPath(), this.reporte.getBytes());
		} catch (IOException e) {
			throw new DomainExceptions(e.getMessage());
		}
	}
}
