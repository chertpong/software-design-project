import java.util.ArrayList;
import java.util.List;

public class MeanAndSDRangeCalculator {
    private List<Integer> scoreList = new ArrayList<Integer>();

    public void addScore(int s) {
        scoreList.add(s);
    }

    public double getMean() {
        int j = 0;
        for (int ii : scoreList) {
            j = j + ii;
        }
        return j / scoreList.size();
    }

    public double getVariance() {
        double mean = getMean();
        double temp = 0;
        for (int ii : scoreList)
            temp += (mean - ii) * (mean - ii);
        return temp / scoreList.size();
    }

    public double getStdDev() {
        return Math.sqrt(getVariance());
    }

    public double getMaxForGradeA() {
        return this.getMean() + 1.5 * this.getStdDev();
    }

    public double getMaxForGradeB() {
        return this.getMean() + 1 * this.getStdDev();
    }

    public double getMaxForGradeC() {
        return this.getMean() + 0.5 * this.getStdDev();
    }

    public double getMaxForGradeD() {
        return this.getMean();
    }

    public double getMaxForGradeF() {
        return this.getMean() - 0.5 * this.getStdDev();
    }

    public double getMinForGradeA() {
        return this.getMean() + 1.0 * this.getStdDev();
    }

    public double getMinForGradeB() {
        return this.getMean() + 0.5 * this.getStdDev();
    }

    public double getMinForGradeC() {
        return this.getMean();
    }

    public double getMinForGradeD() {
        return this.getMean() - 0.5 * this.getStdDev();
    }

    public double getMinForGradeF() {
        return this.getMean() - this.getStdDev();
    }
}
