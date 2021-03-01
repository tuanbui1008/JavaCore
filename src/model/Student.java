package model;

public class Student extends Person{
    private String className;
    private String studentCode;



    public Student() {
    }

    public Student(String fullName, String address, String className, String studentCode) {
        super(fullName, address);
        this.className = className;
        this.studentCode = studentCode;
    }

    public Student(String className, String studentCode) {
        this.className = className;
        this.studentCode = studentCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", studentCode='" + studentCode + '\'' +
                "} " + super.toString();
    }
}
