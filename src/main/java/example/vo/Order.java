package example.vo;

import lombok.Data;

/**
 * <PRE>
 * {订单表}
 * </PRE>
 *
 * @author zhaodg
 * @date 2021/3/1
 */
@Data
public class Order {

    private String orderNo;
    private Long orderSum;
}
