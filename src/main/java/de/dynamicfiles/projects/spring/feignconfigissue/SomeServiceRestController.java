package de.dynamicfiles.projects.spring.feignconfigissue;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dalthoff
 */
@RestController
public class SomeServiceRestController {

    @RequestMapping(path = "/dummy", method = RequestMethod.GET)
    public boolean dummy() {
        return false;
    }
}
