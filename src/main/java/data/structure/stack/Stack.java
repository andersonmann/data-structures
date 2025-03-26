package data.structure.stack;

public class Stack {
    private int[] elements;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
        this.top = -1; // Pilha começa vazia
    }

    /**
     * Método para adicionar um elemento (push)
     *
     * @param element
     */
    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Erro: pilha cheia");
            return;
        }
        elements[++top] = element;
    }

    /**
     * Método para remover um elemento (pop)
     *
     * @return
     */

    public int pop() {
        if (top == -1) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }
        return elements[top--];
    }

    /**
     * Método para visualizar o topo da pilha (peek)
     */
    public int peek() {
        if (top == -1) {
            System.out.println("Pilha vazia");
            return -1;
        }
        return elements[top];
    }

    /**
     * Método para verificar se a pilha está vazia
     */

    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Metodo par exibir a pilha
     */

    public void exibir() {
        if (top == -1) {
            System.out.println("Pilha vazia");
            return;
        }
        System.out.println("Pilha");
        for (int i = 0; i <= top; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    /**
     * Testando implementação
     */

    public static void main(String[] args) {
        Stack stack = new Stack(5); // Criando uma pilha com capacidade 5

        System.out.println(stack.isEmpty());
        stack.push(10);
        System.out.println(stack.isEmpty());
        stack.push(20);
        stack.push(30);
        stack.exibir(); // Saída: Pilha: 10 20 30

        System.out.println("Topo da pilha: " + stack.peek()); // Saída: 30
        System.out.println("Removendo: " + stack.pop()); // Saída: 30
        stack.exibir(); // Saída: Pilha: 10 20

    }

}