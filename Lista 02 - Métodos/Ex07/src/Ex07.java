// Pedro Vinicios de Oliveira Ribeiro dos Santos

/*[POO-012] Crie um programa que pergunte ao usuário se ele deseja lançar/jogar um dado. Por meio de 
um método chamado dado(), retorne, através de sorteio aleatório, um número de 1 até 6. O programa 
deve ser executado enquanto o usuário quiser continuar jogando o dado */

import java.util.Scanner;
import entities.Jogar;

public class Ex07 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Jogar jogo = new Jogar();

        int x = 0;

        while(x == 0){
            System.out.println("Jogar o dado [s/n]:");
            char resp = sc.next().charAt(0);
            
            int result = jogo.dado();
            System.out.println("Saiu: " + result);

            if(resp == 'n')
            x = 1;
        }

        sc.close();
    }
}
