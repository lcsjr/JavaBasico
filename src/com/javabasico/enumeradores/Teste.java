package com.javabasico.enumeradores;

public class Teste {

	public static void main(String[] args) {
		
		/*======================================================================================================
		 * 
		 ======================================================================================================*/
		DiaSemana dia;
		
		dia = DiaSemana.DOMINGO;
		System.out.println(dia.getValor() + " - " + dia.toString() );
		
		dia = DiaSemana.SEGUNTA;
		System.out.println(dia.getValor() + " - " + dia.toString() );
		
		dia = DiaSemana.TERCA;
		System.out.println(dia.getValor() + " - " + dia.toString() );
		
		dia = DiaSemana.QUARTA;
		System.out.println(dia.getValor() + " - " + dia.toString() );
		
		dia = DiaSemana.QUINTA;
		System.out.println(dia.getValor() + " - " + dia.toString() );
		
		dia = DiaSemana.SEXTA;
		System.out.println(dia.getValor() + " - " + dia.toString() );
		
		dia = DiaSemana.SABADO;
		System.out.println(dia.getValor() + " - " + dia.toString() );
		
		
		System.out.println();
		
		/*======================================================================================================
		 * 
		 ======================================================================================================*/
		Formulario formulario = new Formulario();
		formulario.setNome("Luiz Santos");
		System.out.println("Nome: " + formulario.getNome());
		
		String sexoTipo = "M";
		// DECLARANDO O ENUM DE GENERO
		Genero sexo;
		
		if (sexoTipo == "M") {
			sexo = Genero.MASCULINO;
		}else {
			sexo = Genero.FEMININO;
		}
		
		formulario.setGenero(sexo);
		System.out.println("Sexo: " + sexo.getTipo() + " - Pegando do formulario: " + formulario.getGenero() + " - Ou do Enum: " + sexo.toString());
	
		System.out.println(  );
	}

}
