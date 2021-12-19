package fun.miguo.boot;

import fun.miguo.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * ClassName: MainApplication
 * Description:
 * date: 2021/12/11 0:36
 *
 * @author lf
 * @since JDK 1.8
 */

@SpringBootApplication(scanBasePackages = "fun.miguo")
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();

//        for(String name: beanDefinitionNames){
//            System.out.println(name);
//        }

//        User user01 = run.getBean("user01", User.class);
//        System.out.println(user01);

        System.out.println("++++++++++++++");

//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }

        System.out.println(run.containsBean("user01"));
        System.out.println("hotfix test");
        System.out.println("push test");

    }


}
