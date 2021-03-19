
package diagramadeflujo;


public class punto2java {
    public static void main(String[] args) {
        int suma=0, conta=0;
        do {            
            conta = conta+1;
            suma = suma+conta;
        } while (conta<100);
        System.out.println("la suma es: "+suma);
    }
}
