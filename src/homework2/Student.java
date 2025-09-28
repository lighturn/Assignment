package homework;


class Student {
    long studentId;
    String name;
    String major;
    String phoneNumber;

    // 생성자

    public Student(long studentId, String name, String major, String phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    // getter & setter

    public long getStudentId() {
        return studentId;
    }

    public void setStudentID(long studentId) {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // 전화번호 포맷 변경 (010-xxxx-xxxx)
    public String getFormattedPhoneNumber() {
        if (phoneNumber == null || phoneNumber.length() != 11) {
            return "잘못된 전화번호 입니다.";
        }

            return "010-" + phoneNumber.substring(3, 7) + "-" + phoneNumber.substring(7);

    }
}



