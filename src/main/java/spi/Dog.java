package spi;

/**
 * @author Zhijian.H
 * @since 2022/10/26 上午12:42
 */
public class Dog implements IShout {
    public void shout() {
        System.out.println("wangwang");
    }
}
