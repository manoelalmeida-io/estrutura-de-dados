package com.example;

import java.util.Scanner;

public class Ex1 {

	public static void main( String[] args ) {
		Scanner leitor = new Scanner(System.in);
		String[][] listaTelefonica = new String[5][2];

		for (int i = 0; i < listaTelefonica.length; i++) {
			System.out.print("Digite o nome do contato: ");
			listaTelefonica[i][0] = leitor.nextLine();

			System.out.printf("Digite o número de telefone para %s:", listaTelefonica[i][0]);
			listaTelefonica[i][1] = leitor.nextLine();
		}

		System.out.println();
		System.out.print("Digite o nome de um contato: ");
		
		String nome = leitor.nextLine();

		boolean encontrou = false;
		for (int i = 0; i < listaTelefonica.length; i++) {
			if (listaTelefonica[i][0].equals(nome)) {
				System.out.println(listaTelefonica[i][1]);
				encontrou = true;
				break;
			}
		}

		if (!encontrou) {
			System.out.println("Número não encontrado");
		}

		leitor.close();
	}
}
