
package diagramadeflujo;

import java.util.Scanner;


public class punto3 {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
String resp="S";




while (resp.equals("S") || resp.equals("s") ) {
System.out.println("Calcular factoriales.");
System.out.print("Digite el número: ");
int N = sc.nextInt();
int fact=1;
int I;
for(I=1;I<=N;I++) {
fact=I*fact;

}

System.out.println("El factorial de "+N+" es: "+fact);
System.out.print("Desea continuar otro Factorial? S/N ");
resp=sc.next();

}


}

}
