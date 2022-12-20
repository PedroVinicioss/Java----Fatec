package entities;
import java.util.Random;

public class Jogar {
    
    public int dado() {
        Random aleatorio = new Random();
        return  aleatorio.nextInt(1, 7);
    }
}
