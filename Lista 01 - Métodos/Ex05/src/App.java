// Pedro Vinicios de Oliveira Ribeiro dos Santos

/*  [POO-005] Baseado no exercício anterior, crie uma nova versão, que calcula as raízes de uma equação do 
segundo grau: ax² + bx + c = 0. Para ela existir, o coeficiente 'a' deve ser diferente de zero. Caso o delta seja 
maior ou igual a zero, as raízes serão reais. Caso o delta seja negativo, as reais serão complexas e da forma, 
assim retorne zero.
 */

import java.util.Scanner;
import entities.Equals;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        Equals equacao;
        equacao = new Equals();

        int x = 0;
        
        while(x == 0){

            System.out.print("a: ");
            equacao.a = sc.nextInt();

            if(equacao.a != 0)
                x = 1;
            else
                System.out.println("O coeficiente 'a' não pode ser igual a 0!");
        }

        System.out.print("b: ");
        equacao.b = sc.nextInt();

        System.out.print("c: ");
        equacao.c = sc.nextInt();

        double raiz1 = equacao.raizes();
        double raiz2 = equacao.raizes();

        if(raiz1 != 0 || raiz2 != 0){
            System.out.println("\nAs raizes são reais!");
            System.out.println("A 1º raiz é " + raiz1);
            System.out.println("A 2º raiz é " + raiz2);
        }else{
            System.out.println("\nAs raizes são complexas");
            System.out.println("Por serem complexas é retornado o valor " + raiz1);
        }

        sc.close();
    }
}
