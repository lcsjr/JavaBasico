package com.javabasico.orientacaoobjeto.relacionamento_entre_classes;

/*
 * Exercicio: http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-36
 */
public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("Luiz Santos");
		//contato.setEndereco("Vila Olimpia");
		//contato.setTelefone("11 94169-6021");
		
		// criar objeto endereco
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua Cardoso de Melo");
		endereco.setNumero("1024");
		endereco.setComplemento("8º andar");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setCep("59001-000");
		
		// RELACIONAMENTO TEM-UM: atribui o objeto endereco no objeto contato
		contato.setEndereco(endereco);
		
		// criar objeto Telefone
		Telefone telefone1 = new Telefone();
		telefone1.setTipo("Celular");
		telefone1.setDdd("11");
		telefone1.setNumero("94169-6021");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Celular");
		telefone2.setDdd("11");
		telefone2.setNumero("94169-4595");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone1;
		telefones[1] = telefone2;
		
		// RELACIONAMENTO TEM-UM: atribui o objeto telefone no objeto contato		
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		
		if (contato.getEndereco() != null ) {
			System.out.println(contato.getEndereco().getNomeRua());
			System.out.println(contato.getEndereco().getNumero());
			System.out.println(contato.getEndereco().getComplemento());
			System.out.println(contato.getEndereco().getCep());
			System.out.println(contato.getEndereco().getCidade());
			System.out.println(contato.getEndereco().getEstado());
		}
		
		if (contato.getTelefones() != null) {
			for ( Telefone tel : contato.getTelefones() ) {
				System.out.print(tel.getTipo()  +" : ");
				System.out.print("("+ tel.getDdd()+")");
				System.out.println(tel.getNumero());	
			}
			
		}
		
		
	}

}
