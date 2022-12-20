// Pedro Vinicios de Oliveira Ribeiro dos Santos

/* [POO-002] Crie programa que solicite ao usuário um número tipo double. Após verifique se o número é 
zero ou não. A verificação deve ser feita através de um método que receba um valor (parâmetro de 
entrada) e informe se ele é zero ou não através de um retorno do tipo boolean. Declare como: boolean 
isZero ( double num ). */

import java.util.Scanner;

import entities.isPositivo;

public class App {
    public static void main(String[] args) throws Exception {
                
        Scanner sc = new Scanner(System.in);

        isPositivo x;
        x = new isPositivo();

        System.out.println("Entre com um número: ");
        x.num = sc.nextDouble();

        boolean result = x.isZero();

        if(result == true){
            System.out.println("O número " + x.num + " é Zero.");
        }else{
            System.out.println("O número " + x.num + " não é Zero.");
        }

        sc.close();
    }
}