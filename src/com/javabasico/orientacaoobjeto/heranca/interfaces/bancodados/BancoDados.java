package com.javabasico.orientacaoobjeto.heranca.interfaces.bancodados;

/*=============================================================================================================
 * OBS. SOMENTE É PERMITIDO EXTENDER MAIS DE UMA INTERFACE DENTRO DE UMA INTERFACE.
 *=============================================================================================================*/
public interface BancoDados extends SqlDCL, SqlDML, SqlDDL  {

	void abrirConexao();
	void fecharConexao();
}
