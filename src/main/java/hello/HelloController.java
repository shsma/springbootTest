package hello;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

  /*  @RequestMapping("/")
    public String index() {
        return "Shady starts working with spring-boot!";
    }*/

    @RequestMapping("/shadywashere")
    String sayHello() {
        return "Shady was here!";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    String sayPost() {
        return "POST received!";
    }
}