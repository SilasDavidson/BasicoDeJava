package Faculdade;

import java.util.Scanner;




public class Professor {
	public static void main (String [] args) {
		String nome, especializacao;
		
		int idade ;
		
		
		//DECLARANDO OBJ
		
		Scanner Professor1;
		Scanner professor2;
		
		//CONSTRUINDO OBJT
		
		Professor1 = new Scanner (System.in);
		
		System.out.println("Entre com o nome");
	
		nome= Professor1.next();
		
	
		
		
		System.out.println("Digite sua idade:");
		idade = Professor1.nextInt();
		
		
		System.out.println("Entre com sua matéria de especialização :");
		
		String curso= Professor1.next();
		
		System.out.printf(" Obrigado!  Professor (a) %s e parabéns pelos seus %d anos de idade e por ser apaixonado por ensinar  %s%n", nome, idade,curso     );	  
		
		professor2 = new Scanner (System.in);
		
		System.out.println("Entre com o nome");
		nome= professor2.next();
		
		System.out.println("Digite sua idade:");
		idade=professor2.nextInt();
		
		System.out.println("Entre com sua matéria de especialização :");
	
		curso = professor2.nextLine();
				
	
		System.out.printf(" Obrigado!  Professor (a) %s e parabéns pelos seus %d anos de idade e por ser apaixonado por ensinar  %s%n", nome, idade,curso     );
		professor2.close();
		Professor1.close();

	}
	

}
