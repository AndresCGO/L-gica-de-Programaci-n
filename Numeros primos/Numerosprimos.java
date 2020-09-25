public class Numerosprimos{
	public static void main(String[]args){
		//programa que calcula los numeros primos entre 453 y 3500
		int division=0;
		int divisores=0;
		int n;

		for(n=453;n<=3500;n++){
			divisores=0;
			for(division=1;division<=n;division++){
				if(n%division==0){
					divisores++;
				}
			}
			if(divisores<=2){
				System.out.println("El número "+n+" es primo");
			}
		}
		
		}
	}
