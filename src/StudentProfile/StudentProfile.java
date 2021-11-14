package StudentProfile;

public class StudentProfile {
    String studentName, studentAddress;
    int studentAge, studentID;

    public StudentProfile(String studentName, String studentAddress, int studentAge, int studentID) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentAge = studentAge;
        this.studentID = studentID;
    }

    public void increment() {
        this.studentAge += 1;
    }
}
