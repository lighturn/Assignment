package homework2;
import java.util.Scanner;

class Student {
    int studentId;
    String name;
    String major;
    long phoneNumber;

    // 생성자
    Student(int studentId, String name, String major, long phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    // getter & setter
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // 전화번호를 010-xxxx-xxxx 형태로 변환
    public String getFormattedPhoneNumber() {
        String numStr = Long.toString(phoneNumber);

        // 자릿수 부족 시 0을 앞에 붙임 (예: 1053559999 → 01053559999)
        while (numStr.length() < 11) {
            numStr = "0" + numStr;
        }

        String first = numStr.substring(0, 3);
        String middle = numStr.substring(3, 7);
        String last = numStr.substring(7);

        return first + "-" + middle + "-" + last;
    }
}

class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String input = sc.nextLine();
            String[] info = input.split(" "); // 공백으로 구분

            int studentId = Integer.parseInt(info[0]);
            String name = info[1];
            String major = info[2];
            long phoneNumber = Long.parseLong(info[3]);

            students[i] = new Student(studentId, name, major, phoneNumber);
        }

        String[] order = {"첫번째", "두번째", "세번째"};
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.printf("%s 학생: %d %s %s %s\n",
                    order[i],
                    s.getStudentId(),
                    s.getName(),
                    s.getMajor(),
                    s.getFormattedPhoneNumber()
            );
        }
        sc.close();
    }
}
