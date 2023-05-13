package ar.unrn.domain.model;

import java.io.File;

public class CheckNull implements Reporte {

	private Reporte reporte;

	public CheckNull(Reporte reporte) {
		super();
		this.reporte = reporte;
	}

	@Override
	public void export(File file) throws DomainExceptions {
		if (file == null) {
			throw new DomainExceptions("File es NULL; no puedo exportar...");
		}
		this.reporte.export(file);
	}

}
