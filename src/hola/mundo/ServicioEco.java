package hola.mundo;

import java.util.Scanner;

public class ServicioEco {

    public static void main(String[] args) {

//Lee la entrada del usuario y lo almacena en la variable scanner
//Scanner pelicula_favorita = new Scanner(System.in);
//
// Solicita el mensaje
//System.out.println("Introduce un mensaje: ");
//
//Lee la cadena escrita por el usuario y lo asigna a la variable mensaje
//String mensaje = pelicula_favorita.nextLine(); //nextLine lee una linea completa
//
// Imprime el mensaje introducido por el usuario
//System.out.println("Tu pelicula favorita: "+mensaje);

//public class ServicioEcoNombre {
//public static void main(String[] args) {
Scanner consola = new Scanner(System.in);

System.out.println("Escribe tu nombre:");
String nombre = consola.nextLine();

System.out.println("Escribe tus apellidos:");
String apellidos = consola.nextLine();

System.out.println("Tu nombre es: " + nombre );
System.out.println("Tus apellidos son: " + apellidos);

System.out.println("Tu nombre completo es: " + nombre +" "+ apellidos);
}
























    }

}