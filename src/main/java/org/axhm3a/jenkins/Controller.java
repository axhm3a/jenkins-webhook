package org.axhm3a.jenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by axhm3a on 20.02.17.
 */
@RestController
public class Controller {
    @RequestMapping("/")
    public String index() {
        return "hello";
    }
}
