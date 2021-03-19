
package diagramadeflujo;

import java.util.Scanner;


public class punto1java{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n, media=0, conta=0 , i;
        System.out.println("Leer numero");
        n = entrada.nextDouble();
        while (n>=0) {
            media = media+n;
            conta = conta+1;
            System.out.println("Leer numero");
            n = entrada.nextDouble();
        }
        i = media / conta;
        System.out.println("La edad media es: "+i);
    }
    
}
