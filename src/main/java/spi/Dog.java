package spi;

import com.google.auto.service.AutoService;

/**
 * @author Zhijian.H
 * @since 2022/10/26 上午12:42
 */
@AutoService(IShout.class)
public class Dog implements IShout {
    public void shout() {
        System.out.println("wangwang");
    }
}
