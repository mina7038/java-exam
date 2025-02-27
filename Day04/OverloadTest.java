public class OverloadTest {
    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }
    public static void main(String[] args) {
        System.out.println("정수 덧셈: " + add(3, 5));
        System.out.println("실수 덧셈: " + add(2.5, 3.5));
    }
}