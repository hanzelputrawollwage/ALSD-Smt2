public class ExcuseLetterStack15 {
    ExcuseLetter15[] stack;
    int top;
    int size;

    public ExcuseLetterStack15(int size) {
        this.size = size;
        this.top = -1;
        stack = new ExcuseLetter15[size];
    }

    public void push(ExcuseLetter15 letter) {
        if (top < size - 1) {
            stack[++top] = letter;
        } else {
            System.out.println("Stack is already full");
        }
    }

    public ExcuseLetter15 pop() {
        if (top >= 0) return stack[top--];
        else {
            System.out.println("No letters to process");
            return null;
        }
    }

    public ExcuseLetter15 peek() {
        if (top >= 0) return stack[top];
        else return null;
    }

    public ExcuseLetter15 searchByName(String name) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                return stack[i];
            }
        }
        return null;
    }
}
