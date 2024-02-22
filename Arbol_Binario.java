
package arbol_binario;

public class Arbol_Binario {


    public static void main(String[] args) {
    class NodoABB {
    int valor;
    NodoABB izquierda, derecha;

    public NodoABB(int valor) {
        this.valor = valor;
        this.izquierda = this.derecha = null;
    }
}

class ArbolBinarioBusqueda {
    NodoABB raiz;

    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private NodoABB insertarRecursivo(NodoABB nodo, int valor) {
        if (nodo == null) {
            return new NodoABB(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = insertarRecursivo(nodo.derecha, valor);
        }

        return nodo;
    }
}
    }   
}