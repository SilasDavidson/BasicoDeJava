package Faculdade;

public class Wrapper {
		
		//Wrapper sig embrulho
		
		//
		
		public static void main(String[] args) {
			
			///ESSES SÃO  TIPOS PRIMITIVOS
			float f;
			long h;
			short g;
			byte b= 100;
			short a= 200;
			double j=2222;
			boolean o = true;
			
			//////NÃO SÃO ORIENTADO POIS NÃO POSSUI METODOS, POR EXEMPLO SE DIGITAR  ( a. não aparecerar METODOS)  POR ISSO TEMOS O CHAMAR+DO WRAPPER
			//WRAPER ENVOLVER PAARA QUE O TIPO PRIMITIVO TENHA METODOS
			
			Integer x = new Integer((a));
			//// AQUI DIGITANDO ( x. HAVERÁ  METODOS)
			a=100;
			
		      x.compareTo(x);
		      
		     Double a1 = new Double ("5"); 
		     
		    a1.byteValue();
		    
		    //// COMO É LONG no "" PODE SÓ NÚMERO APESAR TE TER UTILIZADO STRING ( METODO STRING)
		    
		    Long x1 = new Long("200");
		    
		    System.out.println(x1);
		    System.out.println(a);
		    
		    
		     
		     
		     
			
			
			
			
			
			
			
			
			 //AQUI VAMOS APRENDER A FAZER CONVERSÃO
			//// AQUI TEMOS A UTILIZAÇÃO DO PARSE BOOLEAN PARA CONVERSAO  DO STRING PARA O VALOR BOOLEAN
			Boolean bo = Boolean.parseBoolean("True");
			System.out.println(bo);
			
			///AQUI É CONVERTIDO O 
			
			System.out.println(bo.toString().toUpperCase());
			

		}
}