
package diagramadeflujo;

import java.util.Scanner;

public class punto5java {
       public static void main(String[] args) {       
        Scanner entrada =  new Scanner(System.in);
        double i, actual, nuevo ;
        System.out.println("Introduce el precio actual");
        actual = entrada.nextInt();
        nuevo = actual;
        i = 1;
        while (i<=6) {
            System.out.println("Introduzca inflacion mes");
            i = entrada.nextInt();
            nuevo = nuevo *(1+i/100);
        }
        System.out.println("El precio nuevo debe ser "+nuevo);
    }
}
