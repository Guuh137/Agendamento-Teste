package Entidades;

import java.util.Date;

public class Consulta {

	private Integer id;
	private Paciente paciente;
	private Hospital hospital;
	private Date dataAtendimento;

	public Consulta(Integer id, Paciente paciente, Hospital hospital, Date dataAtendimento) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.hospital = hospital;
		this.dataAtendimento = dataAtendimento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Date getDataAtendimento() {
		return dataAtendimento;
	}

	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	@Override
	public String toString() {
		return "Consulta [id=" + id + ", paciente=" + paciente + ", hospital=" + hospital + ", dataAtendimento="
				+ dataAtendimento + "]";
	}
	
}
