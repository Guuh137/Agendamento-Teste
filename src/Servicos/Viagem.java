package Servicos;

import java.util.Date;

import Entidades.Consulta;
import Entidades.Onibus;
import utils.FormatarData;

public class Viagem implements ViagemServico {

	private Onibus onibus;
	private Date dataPartida;
	private Date dataChegada;

	public Viagem(Onibus onibus, Date dataPartida, Date dataChegada) {
		this.onibus = onibus;
		this.dataPartida = dataPartida;
		this.dataChegada = dataChegada;
	}
	
	public Onibus getOnibus() {
		return onibus;
	}

	public Date getDataPartida() {
		return dataPartida;
	}

	public void setDataPartida(Date dataPartida) {
		this.dataPartida = dataPartida;
	}

	public Date getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}
	
	@Override
	public void getRotas() {
		for (Consulta c : onibus.getPacientes()) {
			System.out.println("Hospital: " + c.getHospital().getNome());
		}
	}

	@Override
	public String toString() {
		return "Viagem[ onibus=" + onibus +"\n"+ 
				"Data Partida: " + FormatarData.sdfDataHora.format(dataPartida) + "\n" +
				"Data Chegada: " + FormatarData.sdfDataHora.format(dataChegada) +
	"]";
	}


}
