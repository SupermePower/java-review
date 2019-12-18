package cn.com.nb.hello;

import java.math.BigDecimal;

/**
 * @description 支付接口业务
 * @author: liying.fu
 * @Date: 2018/12/9 下午8:26
 */
public class Pay {

    /**
     * 1、支付中
     * 2、支付完成
     * 3、支付失败
     * 4、支付超时
     * @param totalFee
     * @return
     */
    public String pay(BigDecimal totalFee) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "支付成功:" + totalFee;
    }
}
