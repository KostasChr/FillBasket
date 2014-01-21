package gr.ntua.imu.fillbasket.data;

import weka.associations.ItemSet;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Kostas
 * Date: 9/1/2014
 * Time: 10:55 μμ
 * To change this template use File | Settings | File Templates.
 */
public interface Source {
    HashMap<Integer, ItemSet> getItemSets();
    void readItemSets() throws IOException;
}
