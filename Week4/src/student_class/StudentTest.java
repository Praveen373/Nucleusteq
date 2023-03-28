package student_class;


public class StudentTest {
    public static void main(String[] args) {
		Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        
        student1.setRollNum(1);
        student1.setStudent_Name("Praveen");
        student1.setCourse_Name("C.S.E");
        student1.setMarks1(91);
        student1.setMarks2(87);
        student1.setMarks3(90);
        
        
        System.out.println(student1);
        System.out.println(student1.calculateGrade());

    }
}