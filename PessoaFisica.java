package treina;

public class PessoaFisica extends Pessoa{

	private String rg;
	private String cpf;
	
	
	
	
	
	public String getRg() {
		return rg;
	}





	public void setRg(String rg) {
		this.rg = rg;
	}





	public String getCpf() {
		return cpf;
	}





	public void setCpf(String cpf) {
		this.cpf = cpf;
	}





	public PessoaFisica(String rg, String cpf) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}





	public PessoaFisica(String nome, String email, int idade, double renda, String rg, String cpf) {
		super(nome, email, idade, renda);
		this.rg = rg;
		this.cpf = cpf;
	}





	public PessoaFisica() {
		super();
	}
	
	public String identificador(){
		return"PF";
	}

	
}
