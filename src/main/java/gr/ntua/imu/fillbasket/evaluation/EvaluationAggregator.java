package gr.ntua.imu.fillbasket.evaluation;

/**
 * Created with IntelliJ IDEA.
 * User: Kostas
 * Date: 9/1/2014
 * Time: 11:00 μμ
 * To change this template use File | Settings | File Templates.
 */
public interface EvaluationAggregator {
    void add(String correctItems, String recommendedItems);

    void printResults();
}
