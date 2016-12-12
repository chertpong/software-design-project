public interface IGradeCalculator {
    void setMaxA(int score);//Set Maximum score for Grade A

    void setMaxB(int score);//Set Maximum score for Grade B

    void setMaxC(int score);//Set Maximum score for Grade C

    void setMaxD(int score);//Set Maximum score for Grade D

    void setMaxF(int score);//Set Maximum score for Grade F

    void setScore(Student s);//Set score for grade calculation

    String getGrade();

    void setMinA(int score);//Set Minimum score for Grade A

    void setMinB(int score);//Set Minimum score for Grade B

    void setMinC(int score);//Set Minimum score for Grade C

    void setMinD(int score);//Set Minimum score for Grade D

    void setMinF(int score);//Set Minimum score for Grade F
}
