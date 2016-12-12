public class Student extends Person {
    private String studentId;
    private Course course;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentMidtermScore(String courseName, int score) {
        if (this.course.getCourseName() == (courseName)) {
            this.course.setMidtermExamScore(score);
        }
    }

    public void setHomeWorkScore(String courseName, int score) {
        if (this.course.getCourseName() == courseName) {
            this.course.setHomeworkScore(score);
        }
    }

    public void setProjectScore(String courseName, int score) {
        if (this.course.getCourseName() == courseName) {
            this.course.setProjectScore(score);
        }
    }

    public void setFinalExamScore(String courseName, int score) {
        if (this.course.getCourseName() == courseName) {
            this.course.setFinalExamScore(score);
        }
    }

    public void setCourseName(String courseName) {
        this.course.setCourseName(courseName);
    }

    public void setGrade(String grade) {
        this.course.setGrade(grade);
    }

    public int getTotalScore(String courseName) {
        if (this.course.getCourseName() == courseName) {
            return this.course.getTotalScore();
        } else return 0;
    }

    public String getStudyResult() {
        return this.studentId + " " + this.getFirstName() + " " + this.getLastName() + " study " + this.course.getGradeDetail();
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
