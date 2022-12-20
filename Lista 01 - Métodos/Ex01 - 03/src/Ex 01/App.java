// Pedro Vinicios de Oliveira Ribeiro dos Santos

/*[POO-001] Crie programa que solicite ao usuário um número tipo double. Após verifique se o número é
positivo ou não. A verificação deve ser feita através de um método que receba um valor (parâmetro de 
entrada) e informe se ele é positivo ou negativo através de um retorno do tipo boolean. Assuma o número 
zero como positivo. Declare como: boolean isPositivo ( double num ). */

import java.util.Scanner;

import entities.isPositivo;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        isPositivo x;
        x = new isPositivo();

        System.out.println("Entre com um número: ");
        x.num = sc.nextDouble();

        boolean result = x.isPositiv();

        if(result == true){
            System.out.println("O número " + x.num + " é positivo.");
        }else{
            System.out.println("O número " + x.num + " é negativo.");
        }

        sc.close();
    }
}
