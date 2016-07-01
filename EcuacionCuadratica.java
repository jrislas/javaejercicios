import java.io.*;

public class EcuacionCuadratica {

	public static void main(String[] args) {
	
		double a=0, b=0 , c=0 , d=0 , raiz=0 , x1=0 , x2=0;
		
		System.out.print("Introduce el valor de a-> ");
		a= Scanf.leerEntero();
		System.out.print("Introduce el valor de b-> ");
		b=Scanf.leerEntero();
		System.out.print("Introduce el valor de c-> ");
		c=Scanf.leerEntero();
		d=((b*b)-(4*a*c));
		if(d<0){
		      System.out.print("La ecuacion no tiene Solucion Real");	
        }else{
        
              raiz=Math.sqrt(d);
              x1=(-b+raiz)/(2*a);
              x2=(-b-raiz)/(2*a);

             System.out.println("El valor de x1: "+x1); 
             System.out.println("El valor de x2: "+x2);
        } 


		System.out.print("Programa realizdo por jrislas@gmail.com");	

	
	}

	
	
	
}

