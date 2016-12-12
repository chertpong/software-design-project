public class GradeCalculatorByCriteria implements IGradeCalculator {
    int a, b, c, d, f, temp;

    public String getGrade() {
        if (temp > b) {
            return "A";
        } else if (temp > c) {
            return "B";
        } else if (temp > d) {
            return "C";
        } else if (temp > f) {
            return "D";
        } else return "F";
    }

    @Override
    public void setScore(Student s) {
        this.temp = s.getTotalScore(s.getCourseName());
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
}
