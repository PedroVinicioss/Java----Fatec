package entities;

public class Equals {
    public int a;
    public int b;
    public int c;
    int y = 0;

    public double raizes () {
        double delta = Math.pow(b,2) - 4 * a * c;

        if(delta >= 0){
            if(y == 0){
                y = 1;
                return ((-1 * b) + Math.sqrt(delta)) / 2 * a;
            }
            else{
                y = 1;    
                return ((-1 * b) - Math.sqrt(delta)) / 2 * a;
            }
        }else
            return 0;     
    }
}