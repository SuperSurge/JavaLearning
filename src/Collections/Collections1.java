package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections1 {
    public static void main(String[] args) {
        //Collections工具类介绍
        //1.Collections 是一个操作 Set、List 和 Map 等集合的工具类；
        //2.Collections 中提供了一系列静态方法对集合元素进行排序、查询和修改操作；

        // 排序操作
        //均为static方法：
        //
        //reverse （List）：反转 List 中元素的排序；
        //shuffle （List） ： 对 List 集合元素进行随机排序；
        //sort （List） ： 根据元素的自然顺序对指定的 List 集合元素按升序排序；
        //sort （List，Comparator） ：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序；
        //swap （List ，int，int） ：将指定 List 集合中的 i 处元素 和 j 处元素进行交换；

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        System.out.println("-----------");

        Collections.reverse(list);
        System.out.println(list);
        System.out.println("----------");

        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("------------");

        Collections.sort(list);
        System.out.println(list);
        System.out.println("-----------");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(list);
        System.out.println("----------");

        Collections.swap(list,0,1);
        System.out.println(list);
    }
}
