package entities;

public class MenorMaior {
    public int x;
    public int y;

    public int comparation () {
        if(x < y)
            return x;
        else
            return y;
    }
}
