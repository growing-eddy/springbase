package example.controller.xml;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <PRE>
 * {存xml进行配置}
 * </PRE>
 *
 * @author zhaodg
 * @date 2021/3/2
 */
public class XmlController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("接受到请求");
        return new ModelAndView("hello");
    }
}
