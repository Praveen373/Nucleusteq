package student_class;


public class Student {
    int rollNum;
    String student_Name;
    String course_Name;
    int marks1;
    int marks2;
    int marks3;

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }
    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }
    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }
    public void setCourse_Name(String course_Name) {
        this.course_Name = course_Name;
    }
    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }
    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
    public String getStudent_Name() {
        return student_Name;
    }
    public String getCourse_Name() {
        return course_Name;
    }
    public int getRollNum() {
        return rollNum;
    }
    public int getMarks1() {
        return marks1;
    }
    public int getMarks2() {
        return marks2;
    }
    public int getMarks3() {
        return marks3;
    }
    public int calculateTotal(){
        return marks1 + marks2 + marks3;
    }
    public float calculateAvg(){
        return (marks1 + marks2 + marks3)/3;
    }
    public String calculateGrade(){
        float average = calculateAvg();
        if (average >= 90) {
            return "O";
        } else if (average >= 80) {
            return "A+";
        } else if (average >= 70) {
            return "A";
        } else if (average >= 60) {
            return "B+";
        } else if (average >= 50) {
            return "B";
        } else if (average >= 40) {
            return "C";
        } else if (average >= 45) {
            return "p";
        } else {
            return "F";
        }
    }
    public String toString() {
        return "Students{" + "rollNumber=" + rollNum + ", name=" + student_Name + ", course=" + course_Name + ", marks1=" + marks1 + ", marks2=" + marks2 + ", marks3=" + marks3 + '}';
    }

}
