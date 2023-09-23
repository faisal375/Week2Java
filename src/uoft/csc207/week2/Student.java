package uoft.csc207.week2;

public class Student extends Person {

    String studentID;

    Student(String[] name, String utorid, String studentID) {
        super(name, utorid);
        this.studentID = studentID;
    }

    public String toString () {
        return super.toString() + ", " + this.studentID;
    }
}
