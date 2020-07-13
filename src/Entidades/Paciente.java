package Entidades;

import java.util.Date;

import utils.FormatarData;

public class Paciente extends Pessoa{

	private String numSus;
	
	public Paciente(Integer id, String nome, Date dataNascimento, String cpf, String telefone, String numSus) {
		super(id, nome, dataNascimento, cpf, telefone);
		this.numSus = numSus;
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNumSus() {
		return numSus;
	}

	public void setNumSus(String numSus) {
		this.numSus = numSus;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nome=" + nome + ", dataNascimento=" + FormatarData.sdfData.format(dataNascimento)  
				+ ", cpf=" + cpf
				+ ", telefone=" + telefone + ", numSus=" + numSus + "]";
	}
	
	

}
