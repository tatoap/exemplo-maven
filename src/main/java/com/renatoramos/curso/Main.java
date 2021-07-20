package com.renatoramos.curso;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)){
			System.out.println("Informe seu nome: ");
			String nome = entrada.nextLine();
			
			System.out.println("Informe sua idade: ");
			int idade = entrada.nextInt();
			
			Usuario usuario = new Usuario(nome, idade);
			System.out.println("Obrigado " + usuario.getNome() + " por se cadastrar!");
		}
	}

}
