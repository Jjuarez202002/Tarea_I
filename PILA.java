package pila;
import java.util.LinkedList;
public class PILA {

    public static void main(String[] args) {      

class Pila {
    LinkedList<Integer> elementos;

    public Pila() {
        this.elementos = new LinkedList<>();
    }

    public void push(int elemento) {
        elementos.push(elemento);
    }

    public int pop() {
        return elementos.pop();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }
}
    }
    
}
