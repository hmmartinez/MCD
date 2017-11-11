package calculos_matematicos;
import java.util.Scanner;

public class Calculos_Matematicos_Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int  x = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int y = leer.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int z = leer.nextInt();
        
        System.out.println("\n"+Calculos_Matematicos.mcd_euclides(x, y, z));

    }

}
