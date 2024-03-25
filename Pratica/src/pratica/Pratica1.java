
package pratica;

import java.util.Scanner;


public class Pratica1 {
    public static void main (String[] args){
        double r, areaCirculo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
            r = sc.nextDouble();
        
        areaCirculo = Math.PI + r * r;
        
        System.out.println("A área do círculo é: "+ areaCirculo);
        
        
    }
}
