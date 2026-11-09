public class App {
    public static void main(String[] args) {
        String[] marcas = {"Naf Naf","Americanino","Esprit",null,null};

        for (int i = 0; i < marcas.length; i++) {
            if (marcas[i] != null) {
                System.out.println(marcas[i]);
            }
        }
    }
}
