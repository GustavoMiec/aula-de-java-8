package br.com.fiap.main;

import javax.swing.JOptionPane;

import treina.Endereco;
import treina.PessoaFisica;
import treina.PessoaJuridica;

public class teste {
	static String texto(String j){
		return JOptionPane.showInputDialog(j);		
	}
	
	static int inteiro(String j){
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j){
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	

	public static void main(String[] args) {
		
		
		//String nome, String email, int idade, double renda, String razaoSocial, String cnpj
		PessoaJuridica objPj = new PessoaJuridica(texto("dite o nome da empresa"),
												  texto("Digite o email"),
												  inteiro("digite a idade"),
												  real("Digite a renda da empresa"),
												  texto("Digite a razao social"),
												  texto("Digite o CNPJ"));
		
		Endereco objEnderecoPj = new Endereco(texto("Digite o logradouro da empresa"));
		
		PessoaFisica objPf = new PessoaFisica(texto("digite o nome da pessoa"),
											  texto("Digite o email pessoal"),
											  inteiro("Digite a idade"),
											  real("Digite a renda"),
											  texto("Digite o RG"),
											  texto("Diite o CPF"));
		
		Endereco objEnderecoPf = new Endereco(texto("Digite o Loradouro da pessoa"));
		/*Endereco objEndereco = new Endereco(texto("Informe o Logradouro"));
		
		objPj.setEndereco(objEndereco);
		objPf.setEndereco(objEndereco);*/
		
		/*objPj.setEndereco(objEnderecoPf);
		objPf.setEndereco(objEnderecoPj);*/
		
		System.out.println("Informaçoes PJ");
		System.out.println("Email: " + objPj.getEmail() +
				"\nCNPJ: "+ objPj.getCnpj()
				
				);
		
		
		
	}

}
