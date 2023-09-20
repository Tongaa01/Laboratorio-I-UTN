package practica_teoria;

import java.util.Scanner;

public class practica_for {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name;
        for (int i=1;i<10;i++) {
            System.out.println("Ingrese un nombre");
            name = reader.next();
            System.out.println(name);
        }
    }
}
