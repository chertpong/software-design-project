/**
 * Created by Chertpong on 12/13/2016.
 */
public interface Course {
    String getCourseName();
    void setMidtermExamScore(int midtermExamScore);
    void setHomeworkScore(int homeworkScore);
    void setProjectScore(int projectScore);
    void setFinalExamScore(int finalExamScore);
    void setCourseName(String courseName);
    void setGrade(String grade);
    int getTotalScore();
    String getGradeDetail();
}
