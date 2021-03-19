
package diagramadeflujo;

import java.util.Scanner;


public class punto6 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double n, Supin, Toca, i, Newi;
    System.out.println("¿Cual es el número de generaciones?");
    n = entrada.nextInt();
    System.out.println("¿Cuál es la superficie inicial?");
    Supin = entrada.nextInt();
    Toca = Supin;
    i = 1;
        while (i<=n) {
            System.out.println("¿Cuál es el número de herederos de la generación"+i+"?");
            i = entrada.nextInt();
            Toca = Toca / i;
        }
        System.out.println("Al heredero actual le corresponde una superficie de "+Toca);
    

    
    }
}
