package entities;

public class isPositivo {
    
    public double num;
  
    public boolean isPositiv () {
        /*Função para o Ex01 da lista 01 */
        if(num >= 0)
            return true;
        else
            return false;
    }

    public boolean isZero () {
        /*Função para o Ex02 da lista 01 */
        if(num == 0)
            return true;
        else
            return false;
    }

    public int isTest () {
        /*Função para o Ex03 da lista 01 */
        if(num > 0)
            return 1;
        else if(num < 0)
            return -1;
        else
            return 0;
    }
}
