package example.controller;

import example.vo.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <PRE>
 * {类说明}
 * </PRE>
 * @author zhaodg
 * @date 2021/3/1
 */
@RestController
@RequestMapping("/order")
public class RestFirstController {

    @RequestMapping("/find")
    @ResponseBody
    public Order find(){

        //模拟查询数据
        Order order = new Order();
        order.setOrderNo("1");
        order.setOrderSum(100L);

        return order;
    }

}
