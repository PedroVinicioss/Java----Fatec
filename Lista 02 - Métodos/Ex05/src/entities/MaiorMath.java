package entities;

public class MaiorMath{

    public int  Maior(int x, int y) {
        return Math.max(x, y);
    }

    public int Maior(int x, int y, int z){
        return Maior(z, Maior(x, y));
    }
}