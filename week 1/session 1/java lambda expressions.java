interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public PerformOperation isOdd() {
        return (a) -> a % 2 != 0;
    }

    public PerformOperation isPrime() {
        return (a) -> {
            if (a < 2) {
                return false;
            }

            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }

            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return (a) -> {
            int original = a;
            int reverse = 0;

            while (a != 0) {
                int digit = a % 10;
                reverse = reverse * 10 + digit;
                a = a / 10;
            }

            return original == reverse;
        };
    }

    public boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
}

Input
5
1 4
2 5
3 898
1 3
2 12
Output
ODD
PRIME
PALINDROME
ODD
COMPOSITE

