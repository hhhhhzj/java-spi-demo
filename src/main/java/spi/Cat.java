package spi;

/**
 * @author Zhijian.H
 * @since 2022/10/26 上午12:41
 */
public class Cat implements IShout {
    public void shout() {
        System.out.println("miaomiao");
    }
}
