package Main;

public class Medias {

	
	//Sobrecarga - Retorna o menor
	public double Menor(double nota1, double nota2) {
		
		return Math.min(nota1, nota2);
	}
	
	public double Menor(double nota1, double nota2, double nota3) {
		return Math.min(nota3, Menor(nota1, nota2));
	}
	
	//Sobrecarga - Retorna o maior
	public double Maior(double nota1, double nota2) {
		return Math.max(nota1, nota2);
	}
	
	public double Maior(double nota1, double nota2, int nota3) {
		return Math.max(nota3, Maior(nota1, nota2));
	}
	
	//Descobre a média entre os maiores
	public double medMaior(double nota1, double nota2, double nota3, double menor) {
	
		if(menor == nota1) {
			return (nota2 + nota3) / 2;
		}else if(menor == nota2) {
			return (nota1 + nota3) / 2;
		}else {
			return (nota1 + nota2) / 2;			
		}
	}
	
	//Descobre a média aritmética
	public double medArit(double nota1, double nota2, double nota3) {
		return (nota1 + nota2 + nota3) / 3;
	}
	

}
