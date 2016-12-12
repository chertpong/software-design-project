public class Main2 {
    public static void main(String[] args) {
        Student s1 = StudentFactory.createStudent("Alex","Kristopher", "0001", "OOP", 20, 20, 22, 24);
        Student s2 = StudentFactory.createStudent("Chris", "Tesla", "0002", "OOP", 10, 15, 20, 17);
        Student s3 = StudentFactory.createStudent("David", "Bahmm", "0003", "OOP", 4, 4, 12, 10);
        Student s4 = StudentFactory.createStudent("Alex", "Kristopher", "0004", "OOP", 15, 15, 14, 15);

        IGradeCalculator gradeCalculator = new GradeCalculatorByCriteria();
        GradingStrategy greaterThanGradingStrategy = new GreaterThanGradingStrategy();
        gradeCalculator.setGradingStrategy(greaterThanGradingStrategy);
        gradeCalculator.setMaxA(100);
        gradeCalculator.setMaxB(80);
        gradeCalculator.setMaxC(60);
        gradeCalculator.setMaxD(50);
        gradeCalculator.setMaxF(50);

        gradeCalculator.setScore(s1);
        s1.setGrade(gradeCalculator.getGrade());
        System.out.println(s1.getStudyResult());
        gradeCalculator.setScore(s2);
        s2.setGrade(gradeCalculator.getGrade());
        System.out.println(s2.getStudyResult());
        gradeCalculator.setScore(s3);
        s3.setGrade(gradeCalculator.getGrade());
        System.out.println(s3.getStudyResult());
        gradeCalculator.setScore(s4);
        s4.setGrade(gradeCalculator.getGrade());
        System.out.println(s4.getStudyResult());

        System.out.println("");
        System.out.println("Rescale the score criteria");

        gradeCalculator.setMaxA(100);
        gradeCalculator.setMaxB(80);
        gradeCalculator.setMaxC(70);
        gradeCalculator.setMaxD(50);
        gradeCalculator.setMaxF(20);

        gradeCalculator.setScore(s1);
        s1.setGrade(gradeCalculator.getGrade());
        System.out.println(s1.getStudyResult());
        gradeCalculator.setScore(s2);
        s2.setGrade(gradeCalculator.getGrade());
        System.out.println(s2.getStudyResult());
        gradeCalculator.setScore(s3);
        s3.setGrade(gradeCalculator.getGrade());
        System.out.println(s3.getStudyResult());
        gradeCalculator.setScore(s4);
        s4.setGrade(gradeCalculator.getGrade());
        System.out.println(s4.getStudyResult());

        System.out.println("");
        System.out.println("Rescale the score criteria for Grading by Mean");
        MeanAndSDRangeCalculator cals = new MeanAndSDRangeCalculator();
        cals.addScore(s1.getTotalScore("OOP"));
        cals.addScore(s2.getTotalScore("OOP"));
        cals.addScore(s3.getTotalScore("OOP"));
        cals.addScore(s4.getTotalScore("OOP"));
        gradeCalculator.setMaxA((int) cals.getMaxForGradeA());
        gradeCalculator.setMaxB((int) cals.getMaxForGradeB());
        gradeCalculator.setMaxC((int) cals.getMaxForGradeC());
        gradeCalculator.setMaxD((int) cals.getMaxForGradeD());
        gradeCalculator.setMaxF((int) cals.getMaxForGradeF());

        gradeCalculator.setScore(s1);
        s1.setGrade(gradeCalculator.getGrade());
        System.out.println(s1.getStudyResult());
        gradeCalculator.setScore(s2);
        s2.setGrade(gradeCalculator.getGrade());
        System.out.println(s2.getStudyResult());
        gradeCalculator.setScore(s3);
        s3.setGrade(gradeCalculator.getGrade());
        System.out.println(s3.getStudyResult());
        gradeCalculator.setScore(s4);
        s4.setGrade(gradeCalculator.getGrade());
        System.out.println(s4.getStudyResult());
    }
}
