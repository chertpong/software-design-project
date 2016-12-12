public class Course {
    protected String courseName;
    private int midtermExamScore;
    private int homeworkScore;
    private int projectScore;
    private int finalExamScore;
    private String grade;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setMidtermExamScore(int midtermExamScore) {
        this.midtermExamScore = midtermExamScore;
    }

    public void setHomeworkScore(int homeworkScore) {
        this.homeworkScore = homeworkScore;
    }

    public void setProjectScore(int projectScore) {
        this.projectScore = projectScore;
    }

    public int getTotalScore() {
        return this.midtermExamScore + this.homeworkScore + this.projectScore + this.finalExamScore;
    }

    public void setFinalExamScore(int finalExamScore) {
        this.finalExamScore = finalExamScore;
    }

    public void setGrade(String g) {
        this.grade = g;
    }

    public String getGradeDetail() {
        String studyResult = "Subject " + courseName + " with Total Score " + this.getTotalScore() + " Get grade " + this.grade;
        return studyResult;
    }
}
