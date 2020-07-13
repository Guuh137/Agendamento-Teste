package Aplicacao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entidades.Consulta;
import Entidades.Hospital;
import Entidades.Motorista;
import Entidades.Onibus;
import Entidades.Paciente;
import Servicos.Viagem;
import utils.FormatarData;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		
		try {
			
			// ---------------------------- Dados Pré Definidos --------------------------------- //
			
			Hospital hospital1 = new Hospital(1, "Hospital de Base", "Rua das flores Invertidas", "Bauru", "(14) 99543-3211");
			Hospital hospital2 = new Hospital(2, "UPA", "Rua da Alvorada", "Bauru", "(14) 99532-4322");
			Hospital hospital3 = new Hospital(3, "Pronto Socorro", "Rua dos Molinos", "Bauru", "(14) 99554-2832");
			
			Motorista motorista1 = new Motorista(1, "Jeremias do Buzão", FormatarData.sdfData.parse("10/03/1999"), 
					"3434-6787", "(14 99853-6543)", "B");
			Motorista motorista2 = new Motorista(2, "Jorel Basílio", FormatarData.sdfData.parse("02/06/1999"), 
					"3434-6787", "(14 97543-5566)", "B");
						
			// ---------------------------------------------------------------------------------- //
			
			System.out.println("Olá, Bem vindo ao sistema de Agendamento ----------------------");
			
			System.out.println("Insira dados do Ônibus: ");

			System.out.print("Modelo: ");
			String modeloOnibus = sc.next();
			
			System.out.print("Quantidade de Assentos: ");
			Integer qntAssentos = sc.nextInt();
			
			System.out.print("Insira a quantidade de passageiros: ");
						
			Integer qntPacientes = sc.nextInt();
			
			Paciente paciente1 = null;
			Onibus onibus1 = null;
			Consulta consulta1 = null;
			
			for (int i = 1; i <= qntPacientes; i++) {
				System.out.println("Insira informações do " + i + "° Paciente");
				
				System.out.print("Nome: ");
				String nome = sc.next();
				
				System.out.print("Data de Nascimento: (dd/MM/aaaa)");
				Date dataNascimento = FormatarData.sdfData.parse(sc.next());
				
				System.out.print("CPF: ");
				String cpf = sc.next();
				
				System.out.print("Telefone: ");
				String telefone = sc.next();
				
				System.out.print("Número do Sus: ");
				String numSus = sc.next();
				
				paciente1 = new Paciente(1, nome, dataNascimento, cpf, telefone, numSus);
								
				List<Consulta> consultas = new ArrayList<Consulta>();
				
				consultas.add(new Consulta(1, paciente1, hospital1, FormatarData.sdfDataHora.parse("13/07/2020 13:40")));

				onibus1 = new Onibus(1, modeloOnibus, qntAssentos, motorista1, consultas);
				
			}
			
			System.out.println();
			
			System.out.println("Insira dados sobre a viagem ----------------");

			Viagem viagem = new Viagem(onibus1, FormatarData.sdfDataHora.parse("13/07/2020 13:40"), 
					FormatarData.sdfDataHora.parse("22/10/2020 12:30"));		
			
			
			System.out.println("Processando Viagem!!!");
			System.out.println();
			
			System.out.println("Dados do Ônibus: ");
			System.out.println(onibus1);
			
			System.out.println("Pacientes no ônibus: ");
			onibus1.getPacientes();
			
			System.out.println("Dados da Viagem: ");
			System.out.println(viagem);
			
			System.out.println("Destinos: ");
			viagem.getRotas();
			
		} catch(ParseException e) {
			System.out.println("Erro ao validar dado: " + e.getMessage());
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}
