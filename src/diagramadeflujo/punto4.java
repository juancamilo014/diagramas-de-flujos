
package diagramadeflujo;

import java.util.Scanner;


public class punto4 {
    public static void main(String[] args) {
        int existencias = 1000, entregadas;
        Scanner entradad =  new Scanner(System.in);
        while (existencias>=200) {
            System.out.println("cuantas vacunas han sido entregadas");
            entregadas = entradad.nextInt();
            existencias = existencias - entregadas;
        }
        System.out.println("El inventario ha bajado de 200 unidades. Debe comunicarlo ");
    }
}
