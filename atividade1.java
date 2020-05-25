package trabalho4;
//Faça um programa que leia 10 valores e escreva se o valor lido é negativo ou positivo.

import java.util.Scanner;

public class atividade1 {
	
	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
		
	    int number;
	   int contagem = 1 ;
	    
	    System.out.println(" digite 10 numeros ");   
	    
  do {
	  System.out.println("numero: " );
	  number = leitor.nextInt();
 	contagem++;
 	
 	if(number%2 == 0){
    	 System.out.println(number + " é par");
    	 
     } else {
     	System.out.println(number + " é impar");
     }
     	
     
 	  
  } while(contagem <=  10);
  System.out.println("você digitou 10 numeros");
	 
		
	}

}
