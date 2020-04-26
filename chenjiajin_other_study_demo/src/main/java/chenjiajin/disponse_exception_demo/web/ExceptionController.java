package chenjiajin.disponse_exception_demo.web;

import chenjiajin.disponse_exception_demo.ResourceNotFoundException;
import chenjiajin.disponse_exception_demo.domain.Person;
import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExceptionController {

    @GetMapping("/resourceNotFound")
    public void throwException() {
        Person p = new Person(1L, "SnailClimb");
        /**
         * 抛出一个自定义异常，根据类名
         */
        throw new ResourceNotFoundException(ImmutableMap.of("person id:", p.getId()));
    }

}
