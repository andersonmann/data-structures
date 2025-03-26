package data.structure.stack;
import java.util.Stack;

public class StackJava {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        pilha.pop();

        System.out.println("Topo: " + pilha.peek()); // 30
        System.out.println("Removendo: " + pilha.pop()); // 30
        System.out.println("Pilha está vazia? " + pilha.isEmpty()); // false
    }
}
