package pratikum;

public class Antrian {

    private String[] stack;
    private int max;
    private int top;

    public Antrian(int size) {
        max = size;
        stack = new String[max];
        top = -1;
    }

    public void push(String orang) {
        stack[++top] = orang;
    }

    public String pop() {
        return stack[top--];
    }
    
    public void removeAllElement(){
        top = -1;
    }

    public int getTop() {
        return top;
    }
    
    public String peek() {
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == max - 1;
    }

    public void tampilkanAntrian() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }
}
