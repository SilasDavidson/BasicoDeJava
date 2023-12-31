package Faculdade;

import java.util.Scanner;

public class Dados {
public static void main(String[] args) {
	
	String NOME, SEXO, ENDERECO;
	final String Curso = " Ciência da computação";
	int idade;
	Scanner Aluno;
	Aluno= new Scanner (System.in);
			
	System.out.println("Entre com o nome: ");
	NOME= Aluno.next();
	System.out.println("Entre com a sua idade");
	idade=Aluno.nextInt();
	
	System.out.println("Entre com seu endereço");
	ENDERECO = Aluno.next();
	
	
	System.out.println("Obrigado!!! ");
	
	
	
	System.out.println(NOME + "  tem " + idade + " anos e  cursa  " + Curso+ "  seu endereço é na Av. "  + ENDERECO );
	
	if (idade >=25 ) {
		System.out.println("Isso é massaa");
	} else  if 
	(idade<25 ) {System.out.println("Que isso, muito novo (a)");

	}

	
	
	
	
}
}
