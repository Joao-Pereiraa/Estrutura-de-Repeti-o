package trabalho4;

import java.util.Scanner;

//Construa um programa que leia 20 números inteiros e calcule ao final da leitura a soma e a 
//média desses números

public class atividade3 {
	public static void main(String[] args) {
		
		int number , soma = 0, media;
		int contagem = 1;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite 20 numeros : ");
		
		do {	
		System.out.println("numero " );
		number = leitor.nextInt();
		++contagem;
		soma = soma + number;
		
		
		
		} while (contagem <= 20);
		System.out.println();
		System.out.println("você digitou 20 numeros. ");
		
		media = soma / 20;
		System.out.println( "soma: " + soma);
		System.out.println("média: " + media);;
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
