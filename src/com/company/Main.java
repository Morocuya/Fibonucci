public class FibonacciNumber {
    private static int fibonacci(int n)
    {
        return (n<=2 ? 1 : fibonacci(n-1) + fibonacci(n-2));
    }
    public static void main(String[] args)
    {
        for (int n=1; n<=22; n++)
            System.out.print(fibonacci(n)+", ");
        System.out.println("...");
    }
}
