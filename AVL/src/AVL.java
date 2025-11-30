import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AVL {

    //Atributos
    private NodoAVL raiz;

    //Métodos
    //Constructor
    public AVL() {
        raiz = null;
    }

    //Funcionales
    public boolean estaVacio() {
        return raiz == null;
    }

    //Buscar nodo
    public boolean buscar(int llaveBuscar) {
        return buscarNodo(raiz, llaveBuscar);
    }

    public boolean buscarNodo(NodoAVL raiz, int llaveBuscar) {
        if (raiz == null) {
            System.out.println("El árbol está vacío.\n");
            return false;
        }
        if (raiz.getLlave() == llaveBuscar)
            return true;
        if (raiz.getLlave() < llaveBuscar)
            return buscarNodo(raiz.getHijoDerecho(), llaveBuscar);
        return buscarNodo(raiz.getHijoIzquierdo(), llaveBuscar);
    }

    //Insertar nodo
    public void insertar(int llaveInsertar) {
        raiz = insertarNodo(raiz, llaveInsertar);
    }

    //Insertar nodo - auxiliar
    private NodoAVL insertarNodo(NodoAVL nodo, int llaveInsertar) {
        if (nodo == null) {
            return new NodoAVL(llaveInsertar);
        }

        if (llaveInsertar < nodo.getLlave()) {
            nodo.setHijoIzquierdo(insertarNodo(nodo.getHijoIzquierdo(), llaveInsertar));
        } else if (llaveInsertar > nodo.getLlave()) {
            nodo.setHijoDerecho(insertarNodo(nodo.getHijoDerecho(), llaveInsertar));
        } else {
            System.out.println("La llave ya existe en el árbol.\n");
            return nodo;
        }

        nodo.actualizarAltura();

        return balancearNodo(nodo);
    }

    //Eliminar nodo
    public void eliminar(int llaveEliminar) {
        raiz = eliminarNodo(raiz, llaveEliminar);
    }

    //Eliminar nodo - auxiliar
    private NodoAVL eliminarNodo(NodoAVL nodo, int llaveEliminar) {
        if (nodo == null) {
            System.out.println("La llave no está en el árbol.\n");
            return null;
        }

        if (llaveEliminar < nodo.getLlave()) {
            nodo.setHijoIzquierdo(eliminarNodo(nodo.getHijoIzquierdo(), llaveEliminar));
        } else if (llaveEliminar > nodo.getLlave()) {
            nodo.setHijoDerecho(eliminarNodo(nodo.getHijoDerecho(), llaveEliminar));
        } else {
            if (nodo.getHijoIzquierdo() == null && nodo.getHijoDerecho() == null) {
                return null;
            } else if (nodo.getHijoIzquierdo() == null) {
                return nodo.getHijoDerecho();
            } else if (nodo.getHijoDerecho() == null) {
                return nodo.getHijoIzquierdo();
            } else {
                NodoAVL sucesor = getSucesor(nodo);
                nodo = reemplazarSucesor(nodo, sucesor);
            }
        }

        nodo.actualizarAltura();

        return balancearNodo(nodo);
    }

    //Imprimir árbol
    public void imprimirArbol() {
        if (raiz == null) {
            System.out.println("El árbol está vacío.\n");
            return;
        }

        int altura = raiz.getAltura();

        Queue<NodoAVL> colaNodos = new LinkedList<>();
        colaNodos.add(raiz);

        for (int nivel = 1; nivel <= altura; nivel++) {
            int nodosNivel = (int) Math.pow(2, nivel - 1);
            int espacioInicial = (int) Math.pow(2, altura - nivel) - 1;
            int espacio = (int) Math.pow(2, altura - nivel + 1) - 1;

            for (int i = 0; i < espacioInicial; i++) {
                System.out.print("   ");
            }

            List<NodoAVL> siguientes = new ArrayList<>();
            for (int i = 0; i < nodosNivel; i++) {
                NodoAVL nodo = colaNodos.poll();
                if (nodo != null) {
                    System.out.printf("%3d", nodo.getLlave());
                    siguientes.add(nodo.getHijoIzquierdo());
                    siguientes.add(nodo.getHijoDerecho());
                } else {
                    System.out.print("   ");
                    siguientes.add(null);
                    siguientes.add(null);
                }

                for (int j = 0; j < espacio; j++) {
                    System.out.print("   ");
                }
            }
            System.out.println();

            colaNodos.addAll(siguientes);
        }
    }

    private NodoAVL balancearNodo(NodoAVL nodo) {
        int balance = nodo.balancear();

        // Desbalance izquierdo-izquierdo
        if (balance > 1 && nodo.getHijoIzquierdo().balancear() >= 0) {
            return nodo.rotarDerecha(nodo);
        }

        // Desbalance izquierdo-derecho
        if (balance > 1 && nodo.getHijoIzquierdo().balancear() < 0) {
            return nodo.rotarIzquierdaDerecha(nodo);
        }

        // Desbalance derecho-derecho
        if (balance < -1 && nodo.getHijoDerecho().balancear() <= 0) {
            return nodo.rotarIzquierda(nodo);
        }

        // Desbalance derecho-izquierdo
        if (balance < -1 && nodo.getHijoDerecho().balancear() > 0) {
            return nodo.rotarDerechaIzquierda(nodo);
        }

        return nodo;
    }

    private NodoAVL reemplazarSucesor(NodoAVL nodo, NodoAVL sucesor) {
        sucesor.setHijoIzquierdo(nodo.getHijoIzquierdo());
        sucesor.setHijoDerecho(nodo.getHijoDerecho());
        return sucesor;
    }

    private NodoAVL getSucesor(NodoAVL nodoBorrar) {
        NodoAVL padreSucesor = nodoBorrar;
        NodoAVL sucesor = nodoBorrar;
        NodoAVL nodoActual = nodoBorrar.getHijoDerecho();
        while (nodoActual != null) {
            padreSucesor = sucesor;
            sucesor = nodoActual;
            nodoActual = nodoActual.getHijoIzquierdo();
        }
        if (sucesor != nodoBorrar.getHijoDerecho()) {
            padreSucesor.setHijoIzquierdo(sucesor.getHijoDerecho());
            sucesor.setHijoDerecho(nodoBorrar.getHijoDerecho());
        }
        return sucesor;
    }
}