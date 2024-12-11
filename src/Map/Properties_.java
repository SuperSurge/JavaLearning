package Map;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        //Properties是一个Map集合，继承Hashtable，
        //Properties的key和value都是String类型。 Properties被称为属性类对象。
        //Properties是线程安全的。

        Properties p = new Properties();
        p.put("1","aaa");

        //常用来处理文件，现在我也不太清楚怎么搞

    }
}
