import java.util.Scanner;

class Assignment_seven {
    public static int factorial(int N) {
        if (N == 0 || N == 1) {
            return 1;
        }
        return N * factorial(N - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no ");
        int N = sc.nextInt();
            int result = factorial(N);
            System.out.println("Factorial is " + result);
    }
}
