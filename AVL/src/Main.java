import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void menu(AVL avl) throws Exception {
        byte opcion = -1;

        do {
            System.out.println("\n === Menú principal === \n");
            System.out.println("[1] Buscar nodo");
            System.out.println("[2] Insertar nodo");
            System.out.println("[3] Eliminar nodo");
            System.out.println("[4] Imprimir árbol");
            System.out.println("[0] Salir");
            System.out.print("\nSeleccione una opción del menú: ");
            try {
                opcion = Byte.parseByte(leerTexto());
            } catch (Exception e) {
                System.out.println("Lo sentimos, estamos experimentando problemas técnicos.");
            }
            procesarOpcion(opcion, avl);
        } while (opcion != 0);
    }

    public static String leerTexto() throws IOException {
        return in.readLine();
    }

    public static void procesarOpcion(byte opcion, AVL avl) throws Exception {
        int entero;

        switch (opcion) {
            case 1:
                System.out.print("Digite el número entero que desea buscar en el árbol: ");
                entero = Integer.parseInt(leerTexto());
                avl.buscar(entero);
                break;
            case 2:
                System.out.print("Digite el número entero que desea insertar en el árbol: ");
                entero = Integer.parseInt(leerTexto());
                avl.insertar(entero);
                break;
            case 3:
                System.out.print("Digite el número entero que desea eliminar del árbol: ");
                entero = Integer.parseInt(leerTexto());
                avl.eliminar(entero);
                break;
            case 4:
                avl.imprimirArbol();
                break;
            case 0:
                System.out.println("Cerrando el programa...");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
                break;
        }
    }

    public static void main(String[] args) throws Exception {

        //Inicializar árbol AVL
        AVL miAVL = new AVL();

        //Ejecutar el menú
        menu(miAVL);
    }
}