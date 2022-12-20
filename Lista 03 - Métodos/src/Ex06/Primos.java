package Main;

public class Primos {
	
	static boolean ehPrimo(int y) {
	    for (int j = 2; j < y; j++) {
	        if (y % j == 0)
	            return false;   
	    }
	    return true;
	}
}
