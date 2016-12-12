public class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setFirstName("Alex");
        s1.setLastName("Kristopher");
        s1.setStudentId("0001");
        s1.setCourseName("OOP");
        s1.setHomeWorkScore("OOP", 20);
        s1.setProjectScore("OOP", 20);
        s1.setStudentMidtermScore("OOP", 22);
        s1.setFinalExamScore("OOP", 24);

        Student s2 = new Student();
        s2.setFirstName("Chris");
        s2.setLastName("Tesla");
        s2.setStudentId("0002");
        s2.setCourseName("OOP");
        s2.setHomeWorkScore("OOP", 10);
        s2.setProjectScore("OOP", 15);
        s2.setStudentMidtermScore("OOP", 20);
        s2.setFinalExamScore("OOP", 17);

        Student s3 = new Student();
        s3.setFirstName("David");
        s3.setLastName("Bahmm");
        s3.setStudentId("0003");
        s3.setCourseName("OOP");
        s3.setHomeWorkScore("OOP", 4);
        s3.setProjectScore("OOP", 4);
        s3.setStudentMidtermScore("OOP", 12);
        s3.setFinalExamScore("OOP", 10);

        Student s4 = new Student();
        s4.setFirstName("Alex");
        s4.setLastName("Kristopher");
        s4.setStudentId("0004");
        s4.setCourseName("OOP");
        s4.setHomeWorkScore("OOP", 15);
        s4.setProjectScore("OOP", 15);
        s4.setStudentMidtermScore("OOP", 14);
        s4.setFinalExamScore("OOP", 15);


        IGradeCalculator gradeCalculator = new GradeCalculatorByCriteria();
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
