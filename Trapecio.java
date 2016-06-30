import java.io.*;

public class Trapecio {

	public static void main(String[] args) {
	
		double basemayor=0, basemenor=0 ,altura=0 , area=0;
		
		System.out.print("Introduce la Base Mayor:  ");
		basemayor= Entrada.leerEntero();
		
        System.out.print("Introduce la Base Menor:  ");
		basemenor= Entrada.leerEntero();
		

		System.out.print("Inntroduce la Altura: ");
		altura=Scanf.leerDoble();

		area=((basemayor+basemenor)*altura)/2;

		System.out.println("El area del trapecio es: "+area+" Unidades");		
		System.out.println("Gracias por usar el Metodo");
		System.out.print("Programa realizdo por jrislas@gmail.com");	

	
	}

	
	
	
}
