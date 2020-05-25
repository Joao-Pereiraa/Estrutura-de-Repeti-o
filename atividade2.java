package trabalho4;
//Crie um programa que imprima todos os números inteiros de 1 a N, onde N é um número fornecido pelo usuário.

import java.util.Scanner;
public class atividade2 

{ public static void main(String[] args) {
	
 Scanner leitor = new Scanner(System.in);
 
 int x = 1;
 int number;
	
 System.out.println("digite um numero: ");
	number = leitor.nextInt();
	System.out.println();
	
	do {	System.out.println( x);
	x++;
	
	} while (x <= number);
	
	
}}
