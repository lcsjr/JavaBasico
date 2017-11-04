package com.javabasico.orientacaoobjeto.heranca.interfaces.bancodados;

public interface SqlDCL {

	void grant(String access);
	void revoke(String access);
	
}
