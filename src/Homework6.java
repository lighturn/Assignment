class Course {
    String code;
    String name;

    Course(String code, String name) {
        this.code= code;
        this.name = name;
    }

    String getCode() { return code; }

    String getName() { return name; }
}

class OnlineCourse extends Course {
    OnlineCourse(String code, String name) {
        super(code, name);
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Name" + name +", Type: Online";
    }
}

class OffCourse extends Course {
    OffCourse(String code, String name) {
        super(code, name);
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Name" + name +", Type: Offline";
    }
}
