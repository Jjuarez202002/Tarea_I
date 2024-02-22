package cola;
import java.util.LinkedList;
import java.util.Queue;

public class COLA {


    public static void main(String[] args) {
       

class Cola {
    Queue<Integer> elementos;

    public Cola() {
        this.elementos = new LinkedList<>();
    }

    public void enqueue(int elemento) {
        elementos.add(elemento);
    }

    public int dequeue() {
        return elementos.poll();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }
}
    }
    
}
