package HW_1208;

import java.util.Stack;

class SpecialStack {
    private Stack<Integer> stack; // Основной стек для хранения элементов
    private Stack<Integer> minStack; // Стек для хранения минимальных элементов

    public SpecialStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Метод для добавления элемента в стек
    public void push(int data) {
        stack.push(data);
        if (minStack.isEmpty() || data <= minStack.peek()) {
            minStack.push(data);
        }
    }

    // Метод для удаления верхнего элемента из стека
    public int pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int popped = stack.pop();
        if (popped == minStack.peek()) {
            minStack.pop();
        }
        return popped;
    }

    // Метод для получения верхнего элемента стека
    public int top() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.peek();
    }

    // Метод для проверки, пуст ли стек
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Метод для получения минимального элемента в стеке
    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }
}
