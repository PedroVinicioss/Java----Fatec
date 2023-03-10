//Pedro Vinicios de Oliveira Ribeiro dos Santos

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int numero2 = sc.nextInt();
        sc.close();

        int resultado = mdc(numero1, numero2);
        System.out.println("O MDC entre " + numero1 + " e " + numero2 + " é " + resultado);
    }

    private static int mdc(int numero1, int numero2) {
        int primos[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int mdc = 1;
        for(int i = 0; i < primos.length; i++) {
            while(numero1 % primos[i] == 0 && numero2 % primos[i] == 0) {
                mdc *= primos[i];
                numero1 /= primos[i];
                numero2 /= primos[i];
            }
        }
        return mdc;
    }

}