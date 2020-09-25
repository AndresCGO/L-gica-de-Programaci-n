public class Fibonacci{
	public static void main(String[]args){
		long n=1;
		long i=0;
		short cont;
		long suma=0;
		for(cont=1;cont<=200;cont++){
			suma=suma+n;
			n=n+i;
			i=n-i;
		}
		System.out.println("El promedio es "+suma/cont);
	}
}