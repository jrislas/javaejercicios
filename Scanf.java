import java.util.Scanner;


public class Scanf {
	

private static Scanner Lector = new Scanner(System.in);
	

	
	public static int leerEntero(){
		return Lector.nextInt();

	}
 
	public static double leerDoble(){
        return Lector.nextDouble();
	}

   
    public static char leerCaracter(){
	   return Lector.nextLine().charAt(0);
    }

    public static String leerCadena(){
    	return Lector.nextLine();
    }

	
}	