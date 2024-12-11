package List;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator_ {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //遍历方法：1.迭代器，2.增强佛如，3.普通for

        //用迭代器遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //while循环结束后迭代器指向最后一个元素
        //集合结构改变时也要重置迭代器，不然要出问题
        System.out.println("-------------");

        //如果要重新遍历，则要重置迭代器
        it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------------");

        //增强for循环本质也是迭代器

        //删除元素
        //直接用集合删除元素，集合结构发生改变，而迭代器不知道，会出现异常
        //可以用迭代器删除，迭代器删除时会自动更新迭代器
        it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            it.remove();//删除的是迭代器指向的元素
        }
        System.out.println(list);
        System.out.println("--------------");

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        it = list.iterator();
        list.remove("ccc");
        while(it.hasNext()){
            System.out.println(it.next());//会报错
        }
    }
}
