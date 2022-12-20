import java.util.Scanner;

// Pedro Vinicios de Oliveira Ribeiro dos Santos

/* [POO-004] Escreva um programa que solicite 3 (três) valores double e calcule a Equação do Segundo 
Grau. O primeiro valor será o ‘a’, o segundo o ‘b’ e o último o ‘c’. Crie um método que receba três valores, 
'a', 'b' e 'c', que são os coeficientes da equação do segundo grau e retorne o valor do delta, que é dado por 
'b² - 4ac'.
 */

import java.util.Scanner;
import entities.Equals;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        Equals equacao;
        equacao = new Equals();

        System.out.print("a: ");
        equacao.a = sc.nextInt();
        
        System.out.print("b: ");
        equacao.b = sc.nextInt();

        System.out.print("c: ");
        equacao.c = sc.nextInt();

        double result = equacao.delta();

        System.out.println("Delta é " + result);

        sc.close();
    }
}
