class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
}

public class Solution {
    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println("My superclass is: " +
                adder.getClass().getSuperclass().getName());

        System.out.println(adder.add(42, 13) + " " +
                adder.add(13, 0) + " " +
                adder.add(20, 0));
    }
}

Output
My superclass is: Arithmetic
42 13 20
