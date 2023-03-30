package hola.mundo;

import java.util.Scanner;

public class Suma {
    
    public static void main(String[] args) {
        
        Scanner ejemplo_suma= new Scanner (System.in);
        System.out.println("Escribe un número");
        
        int valornumero1= Integer.parseInt(ejemplo_suma.nextLine());
                
        System.out.println("Escribe otro número");
        
        int valornumero2= Integer.parseInt(ejemplo_suma.nextLine());
        
        int suma = valornumero1 + valornumero2;
        System.out.println("suma total = " + suma);
    }

      
}
