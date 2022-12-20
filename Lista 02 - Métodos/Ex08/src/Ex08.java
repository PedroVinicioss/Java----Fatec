// Pedro Vinicios de Oliveira Ribeiro dos Santos

/*[POO-013] Utilizando o método dado(), criado no exercício [POO-012], lance o dado 1 milhão de vezes. 
Conte quantas vezes cada número saiu. A probabilidade deu certo? Ou seja, a porcentagem dos números 
foi parecida? */

import entities.JogarProb;

public class Ex08 {
    public static void main(String[] args) throws Exception {

        JogarProb jogo = new JogarProb();

        int x = 0;
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;

        for (x = 1; x <= 1000000; x++) {

            int result = jogo.dado();

            switch(result){
                case 1:
                    a++;
                    break;
                
                case 2:
                    b++;
                    break;

                case 3:
                    c++;
                    break;

                case 4:
                    d++;
                    break;
                
                case 5:
                    e++;
                    break;

                case 6:
                    f++;
                    break;
            }
        }

        System.out.println("1: " + a + " - " + a * 100 / 1000000.0 + "%");
        System.out.println("2: " + b + " - " + b * 100 / 1000000.0 + "%");
        System.out.println("3: " + c + " - " + c * 100 / 1000000.0 + "%");
        System.out.println("4: " + d + " - " + d * 100 / 1000000.0 + "%");
        System.out.println("5: " + e + " - " + e * 100 / 1000000.0 + "%");
        System.out.println("6: " + f + " - " + f * 100 / 1000000.0 + "%");

    }
}
