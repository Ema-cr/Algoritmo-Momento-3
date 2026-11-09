import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] marcas = {"Naf Naf", "Americanino", "Esprit", null, null};
        Scanner leer = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println(" === Bienvenido al Menu === \n"
            + "1. Ver Marcas " + "\n"
            + "2. Validar Disponibilidad de Marca" + "\n"
            + "3. Registrar una Nueva Marca" + "\n"
            + "4. Salir");
            opcion = leer.nextInt();

            if (opcion == 1) {
                for (int i = 0; i < marcas.length; i++) {
                    if (marcas[i] != null) {
                        System.out.println(marcas[i]);
                    }
                }
            } else if (opcion == 4) {
                System.out.println("Gracias por usar nuestro sistema, Hasta la proxima. ");
            } else {
                System.out.println("Ingresa una opcion valida. ");
            }
        } while (opcion != 4);
    }
}