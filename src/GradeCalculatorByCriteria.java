public class GradeCalculatorByCriteria implements IGradeCalculator {
    int a, b, c, d, f, temp;
    private GradingStrategy gradingStrategy;

    public GradeCalculatorByCriteria() {
        this.gradingStrategy = new GreaterThanGradingStrategy();
    }

    public String getGrade() {
        if (this.gradingStrategy.compare(temp, b)) {
            return "A";
        } else if (this.gradingStrategy.compare(temp, c)) {
            return "B";
        } else if (this.gradingStrategy.compare(temp,d)) {
            return "C";
        } else if (this.gradingStrategy.compare(temp,f)) {
            return "D";
        } else return "F";
    }

    @Override
    public void setScore(Student s) {
        this.temp = s.getTotalScore(s.getCourse().getCourseName());
    }

    @Override
    public void setMaxA(int score) {
        this.a = score;
    }

    @Override
    public void setMaxB(int score) {
        this.b = score;
    }

    @Override
    public void setMaxC(int score) {
        this.c = score;
    }

    @Override
    public void setMaxD(int score) {
        this.d = score;
    }

    @Override
    public void setMaxF(int score) {
        this.f = score;
    }

    public void setMinA(int score) {
    }

    public void setMinB(int score) {
    }

    public void setMinC(int score) {
    }

    public void setMinD(int score) {
    }

    public void setMinF(int score) {
    }

    public GradingStrategy getGradingStrategy() {
        return gradingStrategy;
    }

    public void setGradingStrategy(GradingStrategy gradingStrategy) {
        this.gradingStrategy = gradingStrategy;
    }
}
