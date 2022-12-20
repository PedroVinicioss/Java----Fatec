package Main;

public class Conversor {
	
	public int goFahrenheit(int temp) {
		return (9 * temp / 5) + 32;
	}
	
	public int goCelsius(int temp) {
		return  5 * (temp - 32) / 9;
	}
}
