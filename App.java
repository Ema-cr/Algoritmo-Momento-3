import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int OPCION_INVALIDA = 0;
        String[] marcas = { "Naf Naf", "Americanino", "Esprit", null, null };
        Scanner leer = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println(" === Bienvenido al Menu === \n"
                    + "1. Ver Marcas " + "\n"
                    + "2. Validar Disponibilidad de Marca" + "\n"
                    + "3. Registrar una Nueva Marca" + "\n"
                    + "4. Salir");
            if (leer.hasNextInt()) {
                opcion = leer.nextInt();
            } else {
                leer.next();
                opcion = OPCION_INVALIDA;
            }

            if (opcion == 1) {
                for (int i = 0; i < marcas.length; i++) {
                    if (marcas[i] != null) {
                        System.out.println(marcas[i]);
                    }
                }
            } else if (opcion == 2) {
                System.out.println("Ingresa el nombre de la marca a validar: ");
                leer.nextLine();
                String marca = leer.nextLine();
                if (existeMarca(marcas, marca)) {
                    System.out.println("La marca si existe. ");
                } else {
                    System.out.println("La marca no existe. ");
                }
            } else if (opcion == 3) {
                System.out.println("Ingresa el nombre de la marca a registrar: ");
                leer.nextLine();
                String marcaNueva = leer.nextLine();
                if (agregarMarca(marcas, marcaNueva)) {
                    System.out.println("La marca ha sido agregada. ");
                } else {
                    System.out.println("No se pueden registrar mas marcas en el sistema. ");
                }
            } else if (opcion == 4) {
                System.out.println("Gracias por usar nuestro sistema, Hasta la proxima. ");
            } else {
                System.out.println("Ingresa una opcion valida. ");
            }
        } while (opcion != 4);
        leer.close();
    }

    public static boolean existeMarca(String[] marcas, String marcaBuscada) {
        for (int i = 0; i < marcas.length; i++) {
            if (marcaBuscada.equalsIgnoreCase(marcas[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean agregarMarca(String[] marcas, String marcaNueva) {
        for (int i = 0; i < marcas.length; i++) {
            if (marcas[i] == null) {
                marcas[i] = marcaNueva;
                return true;
            }
        }
        return false;
    }
}
