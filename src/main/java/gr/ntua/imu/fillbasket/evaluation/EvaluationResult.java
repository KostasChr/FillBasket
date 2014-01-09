package gr.ntua.imu.fillbasket.evaluation;

/**
 * Created with IntelliJ IDEA.
 * User: Kostas
 * Date: 9/1/2014
 * Time: 11:00 μμ
 * To change this template use File | Settings | File Templates.
 */
public interface EvaluationResult {
    double getPrecision();

    void setPrecision(double precision);

    double getRecall();

    void setRecall(double recall);
}
