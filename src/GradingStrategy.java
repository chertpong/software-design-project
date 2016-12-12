import java.util.function.BiFunction;

/**
 * Created by Chertpong on 12/13/2016.
 */
public interface GradingStrategy {
    Boolean compare(Integer score, Integer grade);
}
