package de.dynamicfiles.projects.spring.feignconfigissue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;

/**
 *
 * @author dalthoff
 */
@SpringBootApplication
public class MainClass {

    public static void main(String[] args) throws Throwable {
        SpringApplication application = new SpringApplication(MainClass.class);
        application.addListeners(new ApplicationPidFileWriter("app.pid"));
        application.run(args);
    }

}
