import java.util.Scanner;

public class Homework4 {

    // 재귀 호출을 이용한 최대공약수 계산
    public int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }

    // 반복문을 이용한 최대공약수 계산
    public int gcdByLoop(int m, int n) {
        while (n != 0) {
            int temp = m;
            m = n;
            n = temp % n;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        Homework4 answer = new Homework4();
        int result = answer.gcd(num1, num2);

        System.out.println("두 수의 최대공약수는 " + result + "입니다.");
        scanner.close();
    }
}
