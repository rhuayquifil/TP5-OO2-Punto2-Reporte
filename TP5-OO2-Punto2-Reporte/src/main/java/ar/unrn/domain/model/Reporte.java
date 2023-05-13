package ar.unrn.domain.model;

import java.io.File;

public interface Reporte {

	void export(File file) throws DomainExceptions;
}
