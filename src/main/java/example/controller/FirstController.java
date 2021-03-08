package example.controller;

import example.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @Autowired
    private FirstService firstService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        System.out.println("FirstController.index();");
        firstService.index();
        return "index";
    }
}
