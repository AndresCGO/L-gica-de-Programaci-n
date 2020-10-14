import java.util.Arrays;


public class Cajanegra{
	public static void main(String[]args){
		int datos[]={3,2,1,-55,77,6,32,11,789,982,1,4,2,0,-2,3,4};
		System.out.println(Arrays.toString(datos));
		Arrays.sort(datos);
		System.out.println(Arrays.toString(datos));

		System.out.println(Arrays.binarySearch(datos,77));

	}
}