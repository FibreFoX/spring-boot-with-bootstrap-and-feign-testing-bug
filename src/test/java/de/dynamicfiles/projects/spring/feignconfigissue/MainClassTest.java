package de.dynamicfiles.projects.spring.feignconfigissue;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author dalthoff
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainClass.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = {
    // this was some idea to set random port
    "server.port=${random.int[1024,65536]}"
    // this was some idea, but does not propagate
//    "server.port=${local.server.port}"
})
public class MainClassTest {

    @LocalServerPort
    private int localPort;

    @Value("${server.port}")
    private int serverPort;

    @Value("${someServiceName.rest.url}")
    private String clientUrl;

    @Test
    public void dummyTest() {
        System.out.println("LocalPort: " + localPort);
        System.out.println("ServerPort: " + serverPort);
        System.out.println("ClientUrl: " + clientUrl);
        assertTrue(localPort == serverPort);
    }
}
