package fun.miguo.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * Description:
 * date: 2021/12/11 0:39
 *
 * @author lf
 * @since JDK 1.8
 */

//@Controller
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String handle01(){

        return "hello  springboot";
    }
}
