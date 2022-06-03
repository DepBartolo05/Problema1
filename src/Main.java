import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;
        Impresora impresora = new Impresora();
        DocumentoOfimatico documentoOfimatico = null;
        String nombre = "";
        String tamano = "";

        while (!salir) {

            System.out.println("Seleccione una opción: \n");
            System.out.println("\t1. \t Encender impresora.");
            System.out.println("\t2. \t Apagar impresora.");
            System.out.println("\t3. \t Añadir trabajo.");
            System.out.println("\t4. \t Ver lista de trabajos.");
            System.out.println("\t5. \t Imprimir.");
            System.out.println("\t6. \t Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    impresora.encenderImpresora();
                    System.out.println("Encendiendo impresora");
                    break;
                case 2:
                    impresora.apagarImpresora();
                    System.out.println("Apagando impresora");
                    break;
                case 3:
                    if (impresora.isEstado()) {
                        System.out.print("Nombre del documento: ");
                        nombre = scanner.nextLine();
                        System.out.print("Tamano del documento: ");
                        tamano = scanner.nextLine();
                        documentoOfimatico = new DocumentoOfimatico(nombre, tamano);
                        impresora.anadirTrabajo(documentoOfimatico);
                        System.out.println("Añadiendo trabajo " + nombre + " " + tamano);
                    } else {
                        System.out.println("La impresora está apagada, no se puede añadir trabajo");
                    }

                    break;
                case 4:
                    System.out.println(impresora);
                    break;
                case 5:
                    if (impresora.colaImpresionSize() > 0) {
                        System.out.println("Imprimiendo -> " + impresora.imprimir());
                    } else {
                        System.out.println("Cola de impresión vacía");
                    }

                    break;
                case 6:
                    salir = true;
                    break;

            }
        }
    }
}
