package HW_1208;

public class Main {
    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack();

        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(1);

        System.out.println("Minimum element: " + stack.getMin()); // Должно быть 1
        stack.pop(); // Удаляем 1
        System.out.println("Minimum element: " + stack.getMin()); // Должно быть 2

        stack.push(0);
        System.out.println("Minimum element: " + stack.getMin()); // Должно быть 0
    }
}
