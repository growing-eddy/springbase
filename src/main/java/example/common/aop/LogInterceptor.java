package example.common.aop;

import org.springframework.stereotype.Component;

/**
 * <PRE>
 * {打印日志的aop}
 * </PRE>
 *
 * @author zhaodg
 * @date 2021/1/28
 */
@Component
public class LogInterceptor {

    public void myMethod(){};

    /*@Before("execution(public void com.oumyye.dao.impl.UserDAOImpl.save(com.oumyye.model.User))")*/
    public void before() {
        System.out.println("method start");
    }

    public void after() {
        System.out.println("method after");
    }

    public void AfterReturning() {
        System.out.println("method AfterReturning");
    }
    public void AfterThrowing() {
        System.out.println("method AfterThrowing");
    }

}
