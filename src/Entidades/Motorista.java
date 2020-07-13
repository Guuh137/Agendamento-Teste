package Entidades;

import java.util.Date;

import utils.FormatarData;

public class Motorista extends Pessoa {

	private String cnh;
	
	public Motorista(Integer id, String nome, Date dataNascimento, String cpf, String telefone, String cnh) {
		super(id, nome, dataNascimento, cpf, telefone);
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cnh = cnh;
	}
	
	public String getCNH() {
		return cnh;
	}

	public void setCNH(String cnh) {
		this.cnh = cnh;
	}

	@Override
	public String toString() {
			return "Motorista [id=" + id + ", nome=" + nome + ", dataNascimento=" + FormatarData.sdfData.format(dataNascimento) 
			+ ", cpf=" + cpf
					+ ", telefone=" + telefone + ", CNH=" + cnh + "]";
	}

}
