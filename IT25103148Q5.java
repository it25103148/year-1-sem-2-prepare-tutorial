class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Multiply two integers
    int multiply(int a, int b) {
        return a * b;
    }

    // Square a number
    int square(int a) {
        return a * a;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        // Expression 1 → (3 * 4 + 5 * 7)^2
        int exp1 = cal.square(
                        cal.add(
                            cal.multiply(3, 4),
                            cal.multiply(5, 7)
                        )
                    );

        // Expression 2 → (4 + 7)^2 + (8 + 3)^2
        int exp2 = cal.square(cal.add(4, 7))
                   + cal.square(cal.add(8, 3));

        System.out.println("Expression 1 Result: " + exp1);
        System.out.println("Expression 2 Result: " + exp2);
    }
}
