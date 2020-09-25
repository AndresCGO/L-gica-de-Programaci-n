public class Banderas{
	public static void main(String[]args){
		char colores[][];
		colores= new char [24][30];
		for(int i=0;i<8;i++){
			for(int j=0;j<colores[0].length;j++){
				colores[i][j]='R';
				
			}
			

		}
		for(int i=8;i<16;i++){
			for(int j=0;j<colores[0].length;j++){
				colores[i][j]='B';
			}
		}
		for(int i=16;i<24;i++){
			for(int j=0;j<colores[0].length;j++){
				colores[i][j]='A';
			}
		}
		for(int i=0;i<colores.length;i++){
			for(int j=0;j<colores[0].length;j++){
				if(colores[i][j]=='R'){
					System.out.print(ConsoleColors.RED_BACKGROUND+"   ");

				}
				if(colores[i][j]=='B'){
					System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");

				}
				if(colores[i][j]=='A'){
				System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");	
			  	}
			  	System.out.print(ConsoleColors.RESET);

			  }
			System.out.println();
		}
	}
}