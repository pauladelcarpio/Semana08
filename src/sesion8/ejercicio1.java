
package sesion8;
import java.util.Scanner ;
public class ejercicio1 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();
        
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i;
        }
        
        System.out.println("La suma de los números del 1 al " + N + " es: " + suma);
    }
}
        
    
    
