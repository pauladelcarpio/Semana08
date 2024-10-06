
package sesion8;
import java.util.Scanner ;
public class ejercicio3 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();
        
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) { // Verifica si es impar
                suma += i;
            }
        }
        
        System.out.println("La suma de los números impares del 1 al " + N + " es: " + suma);
    }
}
    
        
   
