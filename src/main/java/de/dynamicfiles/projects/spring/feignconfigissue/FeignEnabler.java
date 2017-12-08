package de.dynamicfiles.projects.spring.feignconfigissue;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * https://stackoverflow.com/a/46449859
 *
 * @author dalthoff
 */
@Configuration
@EnableFeignClients(clients = SomeServiceRESTDAO.class)
public class FeignEnabler {

}
