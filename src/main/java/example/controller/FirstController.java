package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <PRE>
 * {类说明}
 * </PRE>
 *
 * @author zhaodg
 * @date 2021/1/25
 */
@Controller
@RequestMapping("/home")
public class FirstController {
    @RequestMapping("/index")
    public String index(){

        return "index";
    }
}
