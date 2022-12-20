package Main;

//Pedro Vinicios de Oliveira Ribeiro dos Santos

/*[POO-017] Um professor, muito legal, fez 3 provas durante um semestre, mas só vai levar em conta as 
duas notas mais altas para calcular a média. Crie um programa que solicite ao usuário o valor double das 3 
notas, mostre como seria a média com essas 3 provas, a média com as 2 notas mais altas, bem como a nota 
mais alta e a nota mais baixa. Tente criar apenas um método para retornar essas médias. Este método 
deverá receber as 3 notas como parâmetros de entrada e retornar os valores solicitados. As notas devem 
ser de zero a dez e qualquer valor diferente deverá ser desconsiderado, assumindo zero.*/

import java.util.Scanner;
import Main.Medias;

public class Ex04 {

	public static void main(String[] args) {
		
		Medias media = new Medias();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a nota 1: ");
		double nota1 = sc.nextInt();
		
		if(nota1 > 10 || nota1 < 0)
				nota1 = 0;
		
		System.out.print("Entre com a nota 2: ");
		double nota2 = sc.nextInt();
		
		if(nota2 > 10 || nota2 < 0)
			nota2 = 0;
		
		System.out.print("Entre com a nota 3: ");
		int nota3 = sc.nextInt();
		
		if(nota3 > 10 || nota3 < 0)
			nota3 = 0;
		
		double menor = media.Menor(nota1, nota2, nota3);
		double maior = media.Maior(nota1, nota2, nota3);
		double medMaior = media.medMaior(nota1, nota2, nota3, menor);
		double med = media.medArit(nota1, nota2, nota3);
		
		System.out.print("\nMédia maiores: " + medMaior);
		System.out.print("\nMédia aritmética:: " + med);
		System.out.print("\nMaior nota: " + maior);
		System.out.print("\nMenor nota: " + menor);
		
		sc.close();
	}

}
