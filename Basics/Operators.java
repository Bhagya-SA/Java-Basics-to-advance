public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 0;

        System.out.println("== Arithmetic Operators ==");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n== Unary Operators ==");
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));
        System.out.println("-a = " + (-a));
        System.out.println("+b = " + (+b));
        boolean flag = false;
        System.out.println("!flag = " + (!flag));

        System.out.println("\n== Assignment Operators ==");
        c = a;
        System.out.println("c = a -> c = " + c);
        c += b;
        System.out.println("c += b -> c = " + c);
        c -= b;
        System.out.println("c -= b -> c = " + c);
        c *= b;
        System.out.println("c *= b -> c = " + c);
        c /= b;
        System.out.println("c /= b -> c = " + c);
        c %= b;
        System.out.println("c %= b -> c = " + c);

        System.out.println("\n== Relational Operators ==");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("\n== Logical Operators ==");
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        System.out.println("\n== Bitwise Operators ==");
        int p = 5, q = 3;
        System.out.println("p & q = " + (p & q));
        System.out.println("p | q = " + (p | q));
        System.out.println("p ^ q = " + (p ^ q));
        System.out.println("~p = " + (~p));
        System.out.println("p << 1 = " + (p << 1));
        System.out.println("p >> 1 = " + (p >> 1));
        System.out.println("p >>> 1 = " + (p >>> 1));

        System.out.println("\n== Ternary Operator ==");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b = " + max);

        System.out.println("\n== instanceof Operator ==");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));

        System.out.println("\n== Type Cast Operator ==");
        double d = 9.78;
        int i = (int) d;
        System.out.println("double d = " + d);
        System.out.println("int i = (int) d = " + i);
    }
}
