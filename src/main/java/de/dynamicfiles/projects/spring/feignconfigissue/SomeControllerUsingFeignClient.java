package de.dynamicfiles.projects.spring.feignconfigissue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dalthoff
 */
@RestController("somePath")
public class SomeControllerUsingFeignClient {

    @Autowired
    private SomeServiceRESTDAO someServiceRESTDAO;

    @RequestMapping(path = "/dummy2", method = RequestMethod.GET)
    public boolean dummy2() {
        return someServiceRESTDAO.dummy();
    }
}
