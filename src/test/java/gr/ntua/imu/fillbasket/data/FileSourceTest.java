package gr.ntua.imu.fillbasket.data;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import static java.util.logging.Logger.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = {"classpath:FileSourceTest-context.xml"})
public class FileSourceTest {

    final Logger logger;

    @Autowired
    private FileSource fileSource = null;

    public FileSourceTest() {
        logger = getLogger(FileSourceTest.class.toString());
    }

    /**
     * Tests fileSource.
     */
    @Test
    public void testReadingFile() {
        try {
            fileSource.readItemSets();
            assertNotNull(fileSource.getItemSets());
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

}