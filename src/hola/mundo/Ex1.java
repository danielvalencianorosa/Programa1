
package hola.mundo;

import java.util.Scanner;

public class Ex1 {
        
   public static void main(String[] args) {
      
   Scanner ex1 = new Scanner(System.in);

System.out.println("Escribe tu nombre y apellidos:");
String nombreapellidos = ex1.nextLine();

System.out.println("Escribe tu DNI:");
String dni = ex1.nextLine();

System.out.println("Escribe el precio de la matricula:");
double matricula = Double.parseDouble (ex1.nextLine());

System.out.println("Clase virtual:");
boolean claseVirtual = Boolean.parseBoolean (ex1.nextLine());


System.out.println("Tu nombre y apellidos es: " + nombreapellidos );
System.out.println("Tu DNI es: " + dni);
System.out.println("Precio de matricula es: " + matricula );
System.out.println("Clase virtual: " + claseVirtual);





//System.out.println("Tu nombre completo es: " + nombre +" "+ apellidos);  


    
    
    
    
    
    
    
    
    
    
    
    
  }
}