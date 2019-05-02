package www;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Project project(@RequestParam(value = "title", defaultValue = "Test") String projectTitle) {
        return new Project(counter.incrementAndGet(), String.format(template, projectTitle));
    }


}
