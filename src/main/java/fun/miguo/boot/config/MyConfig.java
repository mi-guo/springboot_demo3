package fun.miguo.boot.config;

import fun.miguo.boot.bean.Pet;
import fun.miguo.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * ClassName: MyConfig
 * Description:
 * date: 2021/12/11 15:29
 *
 * @author lf
 * @since JDK 1.8
 */

/**
 *      1.配置类里面使用 @Bean 标注在方法上给容器注册组件,默认也是单实例的
 *      2.配置类本身也是组件
 *      3.proxyBeanMethods: 代理bean的方法
 */
@Import({User.class})  // 给容器注册 bean 默认id为全类名
@Configuration //告诉SpringBoot这是一个配置类
public class MyConfig {


    //@Bean 给容器添加组件.以方法名为id.返回类型就是组件的类型,返回的值就是容器中的实例
    @ConditionalOnBean(name = "tom") //@conditionalOnBean 需要考虑先后顺序问题,tom组件在下面,加载user01的时候尚未加载tom组件,故user01组件不会被注册
    @Bean
    public User user01(){
        User user01 = new User("User01", 18);
        user01.setPet(tom());
        return user01;
    }

    @Bean
    public Pet tom(){
        return new Pet("tom");
    }


}
