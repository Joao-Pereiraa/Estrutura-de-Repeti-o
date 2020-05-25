package trabalho4;

import java.util.Scanner;

//Construa um programa que leia 15 números inteiros e, ao final, mostre qual foi o maior valor fornecido.

public class atividade4 {
	public static void main(String[] args) {
		
		int number;
		int contagem = 1;
		int maior = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite 15 numeros ");
		
		do{
			System.out.println("numero: ");
			number = leitor.nextInt();
			++contagem;
			
			if(number >  maior){
				 maior = number;	
			
				}
			
		} while(contagem <= 15);
		System.out.println("você digitou 15 numeros. ");
		
	
		

		 System.out.println("maior numero: " + maior);
	
		}}


