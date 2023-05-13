package ar.unrn.domain.model;

import java.io.File;

public class CheckExist implements Reporte {

	private Reporte reporte;

	public CheckExist(Reporte reporte) {
		super();
		this.reporte = reporte;
	}

	@Override
	public void export(File file) throws DomainExceptions {
		if (file.exists()) {
			throw new DomainExceptions("El archivo ya existe...");
		}
		this.reporte.export(file);
	}

}
