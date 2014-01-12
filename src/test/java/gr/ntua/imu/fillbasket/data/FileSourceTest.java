package gr.ntua.imu.fillbasket.data;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.Logger;

import static java.util.logging.Logger.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
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
    public void testMessage() {
        assertNotNull("Constructor fileSource instance is null.", fileSource);

        String msg = fileSource.getMessage();

        assertNotNull("Message is null.", msg);

        String expectedMessage = "Spring is fun.";

        assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage, msg);
    }

}