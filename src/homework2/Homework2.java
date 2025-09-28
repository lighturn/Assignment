package homework;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];


        for (int i = 0; i < students.length; i++) {
            System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String input = sc.nextLine();

            // 입력받은 문자열 띄어쓰기 기준으로 자르기
            String[] info = input.split(" ");

            long studentID;
            studentID = Long.parseLong(info[0]);
            String name = info[1];
            String major = info[2];
            String phoneNumber = info[3];

            students[i] = new Student(studentID, name, major, phoneNumber);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");

        String[] order = {"첫번째", "두번째", "세번째"};
        for (int i = 0; i < students.length; i++) {
            Student s = students[i]; // 배열에서 학생 한 명을 꺼냄
            System.out.printf("%s 학생: %d %s %s %s\n",
                    order[i],
                    s.getStudentId(),
                    s.getName(),
                    s.getMajor(),
                    s.getFormattedPhoneNumber() // 전화번호는 포맷팅 메소드 호출
            );
        }
    }
}
