package de.dynamicfiles.projects.spring.feignconfigissue;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * REST client for accessing some data
 *
 * @author dalthoff
 */
@FeignClient(name = "some-service-name", url = "${someServiceName.rest.url}")
public interface SomeServiceRESTDAO {

    @RequestMapping(value = "/dummy", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public boolean dummy();

}
