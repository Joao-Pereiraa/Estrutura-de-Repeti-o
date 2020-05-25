package trabalho4;

import java.util.Scanner;

public class atividade5 {
	public static void main(String[] args) {
		
		int cont1000 = 0;
		double salario, altura;
		char sexo;
		double média = 0, soma= 0, maior = 0,menor = 200;
		 int contagem = 1;
		 
		 Scanner leitor = new Scanner(System.in);
		 
		 do{
		 
		 System.out.println("digite seu sexo (m/f): " + contagem);
		 sexo = leitor.next().charAt(0);
		 
		 System.out.println("digite seu salário: ");
		 salario = leitor.nextDouble();
		 
		 System.out.println("digite sua altura:");
		 altura= leitor.nextDouble();
		 contagem++;
		
			 soma = soma + salario;
			 média = soma / 20;
			 
			 if(altura > maior){
		
				 maior = altura;
			 } 
			 else if(altura < menor){
				menor = altura;	 
			 }
			 
			 if(salario <= 1000 && sexo == 'f'){
				cont1000 = cont1000 + 1; 
			 }}
				 while (contagem <= 20);
				 
		  System.out.println("a média do salário dos funcionários: " + média);
		  System.out.println(("maior altura: " + maior) +" e menor altura: " + menor);
		  System.out.println( "quantidade de mulheres com salário até R$1.000: " + cont1000);
	}}
