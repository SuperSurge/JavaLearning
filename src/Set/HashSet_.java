package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args) {
        //Set常用方法和List一样
        HashSet<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        set.add(null);
        System.out.println(set);
        //HashSet集合对于元素的读写顺序不做保证
        //相同的元素，多次存储，只能保留一个，并且不会报错
        //List集合可以存储重复元素，Set集合不行

        //遍历：迭代器、增强for

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        it = set.iterator();

        System.out.println("----------------");

        for(String s : set){
            System.out.println(s);
        }

        System.out.println("1".hashCode());
        System.out.println("li".hashCode());

        //Set集合的去重原理使用的是哈希值。

        //public int hashCode() - 用来获取哈希值，来自于Object顶层类
        //对象的哈希值特点
        //
        //同一个对象多次调用hashCode()方法，得到的结果是相同的。
        //
        //默认情况下，不同的对象的哈希值也是不同的（特殊情况除外）

        //HashSet集合的特点
        //HashSet 底层其实是HashMap，HashMap底层是（数组+链表+红黑树）
        //
        //集合对于读写顺序不做保证
        //
        //没有索引
        //
        //Set集合中的内容不能重复
    }
}
