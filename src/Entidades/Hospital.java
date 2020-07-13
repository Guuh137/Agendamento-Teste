package Entidades;

public class Hospital {

	private Integer id;
	private String nome;
	private String endereco;
	private String cidade;
	private String telefone;

	public Hospital(Integer id, String nome, String endereco, String cidade, String telefone) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", cidade=" + cidade + ", telefone="
				+ telefone + "]";
	}

}
