package practica_teoria;

import java.util.Scanner;

public class practica_while {
    public static void main(String[] args) {
        String name;
        int i=0;
        Scanner reader = new Scanner(System.in);

        while (i<4) {
            System.out.println("Ingrese un nombre:");
            name = reader.next();
            System.out.println(name);
            i++;
        }
        System.out.println("Salio con exito");
    }
}
