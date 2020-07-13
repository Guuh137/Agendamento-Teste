package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Onibus {

	private Integer id;
	private String modelo;
	private Integer quantidadeAssentos;
	private Motorista motorista;
	private List<Consulta> consultas = new ArrayList<Consulta>();

	public Onibus(Integer id, String modelo, Integer quantidadeAssentos, Motorista motorista, List<Consulta> consultas) {
		if (consultas.size() > quantidadeAssentos) {
			System.out.println("Há mais passageiros do que assentos!!!");
			throw new IllegalArgumentException();
		}
		this.id = id;
		this.modelo = modelo;
		this.quantidadeAssentos = quantidadeAssentos;
		this.motorista = motorista;
		this.consultas = consultas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getQuantidadeAssentos() {
		return quantidadeAssentos;
	}

	public void setQuantidadeAssentos(Integer quantidadeAssentos) {
		this.quantidadeAssentos = quantidadeAssentos;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public List<Consulta> getPacientes() {
		
		for (Consulta c : consultas) {
			System.out.println(c.getPaciente().getNome());
		}
		
		return consultas;
	}

	@Override
	public String toString() {
		return "Onibus [id=" + id + ", modelo=" + modelo + ", Quantidade de Assentos: " + quantidadeAssentos + "]";
	}

}
