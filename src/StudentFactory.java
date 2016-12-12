/**
 * Created by Chertpong on 12/12/2016.
 */
public class StudentFactory {
    public static Student createStudent(String firstName, String lastName, String studentId, String courseName, int homeworkScore, int projectScore, int midTermScore, int finalScore){
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setStudentId(studentId);

        Course course = new CourseImpl();
        student.setCourseName(courseName);
        student.setHomeWorkScore(courseName, homeworkScore);
        student.setProjectScore(courseName, projectScore);
        student.setStudentMidtermScore(courseName, midTermScore);
        student.setFinalExamScore(courseName, finalScore);

        student.setCourse(course);
        return student;
    }
}
