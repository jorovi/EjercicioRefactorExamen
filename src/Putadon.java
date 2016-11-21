import java.util.Scanner;

/*
 * CSI Florida
 * Reto Putadon
 * 
 * El siguiente código busca una letra dentro de una frase
 * y devuelve dónde se ha encontrado y ctas veces
 * 
 * Hay dos errores
 * 
 */
public class Putadon {
	static char letra = 0;
	static String frase="";
	public static void main(String[] args) {
		//Variables inicialización
		int numPos;
		int numRepeticiones=0;
		letra=BuscaLetra();
		EncuentraLetra(letra, frase, numRepeticiones);
		
	}
	//Pedimos datos
	public static char BuscaLetra(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce tu frase");
		frase = sc.nextLine();
		System.out.println("Introduce la letra a buscar");
		letra = sc.nextLine().charAt(0); //charAt(0) devuelve la primera letra
		return letra;
	}
		
		//Buscamos las letras
	public static void EncuentraLetra(char letra, String frase, int numRepeticiones){
		for(int i=0;i<frase.length();i++){
			if(letra==frase.charAt(i)){
				numRepeticiones=numRepeticiones+1;
				System.out.println("Letra "+letra+" encontrada en la posicion "+i);
			}
		}
		System.out.println("Total repeticiones "+numRepeticiones);
	
	}
}
