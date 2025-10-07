import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int count = sc.nextInt();
        sc.nextLine(); // 줄바꿈 제거

        int[] numbers = new int[count];


        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }

        // 최대값과 최소값을 배열의 첫 번째 값으로 초기화
        int max = numbers[0];
        int min = numbers[0];

        // 배열 전체를 탐색하면서 최대/최소값 갱신
        for (int i = 1; i < count; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // 결과 출력
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        sc.close();
    }
}
