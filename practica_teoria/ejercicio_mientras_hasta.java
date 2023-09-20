package practica_teoria;

import java.util.Scanner;

public class ejercicio_mientras_hasta {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int i=0;
        String name;
        do {

                System.out.println("Ingrese un nombre:");
                name = reader.next();
                System.out.println(name);
                i++;
        } while (i<4);


        }
}
