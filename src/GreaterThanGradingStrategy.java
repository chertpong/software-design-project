/**
 * Created by Chertpong on 12/13/2016.
 *
 */
public class GreaterThanGradingStrategy implements GradingStrategy {

    @Override
    public Boolean compare(Integer score, Integer grade) {
        return score > grade;
    }
}
