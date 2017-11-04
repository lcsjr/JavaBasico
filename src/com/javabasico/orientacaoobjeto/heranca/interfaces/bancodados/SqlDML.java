package com.javabasico.orientacaoobjeto.heranca.interfaces.bancodados;

public interface SqlDML {

	void insert(String query);
	void update(String query);
	void delete(String query);
	void select(String query);
}
