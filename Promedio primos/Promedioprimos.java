public class Promedioprimos{
    public static void main(String []args) {
        short division=0;
		short divisores=0;
		int n=1;
		short cont=0;
		double suma=0;

		while(cont<=100){
			divisores=0;
			for(division=1;division<=n;division++){
				if(n%division==0){
					divisores++;
				}
			}
			n++;
			if(divisores<=2){
				cont++;
				suma=suma+n;
				
			}
		}
		System.out.println("El promedio es "+suma/cont);
		}
    }
