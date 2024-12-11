package Set;

import java.util.TreeSet;

public class TreeSet_ {
    //1、TreeSet集合底层实际上是一个TreeMap
    //
    //2、TreeMap集合底层是一个二叉树。
    //
    //3、放到TreeSet集合中的元素，等同于放到TreeMap集合key部分了。
    //
    //4、TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小顺序自动排序。

    //TreeSet的独特之处在于它的构造器可以传入比较器，所以TreeSet常用来排序

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        System.out.println(set);
    }
}
