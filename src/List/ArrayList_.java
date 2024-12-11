package List;

import java.util.ArrayList;

public class ArrayList_ {
    public static void main(String[] args){
        //List继承于Collection，有ArrayLIst和LinkedList，特点是储存元素可重复，有序，存进去和取出的顺序相同
        //List集合类中元素有序（即添加和取出顺序一致），且可重复
        //List集合中的每个元素都有其对应的顺序索引，即支持索引；
        //List容器中的元素都对应一个整数型的序号记其在容器中的位置，可以根据序号存取容器中的元素
        //List常用接口有 ArrayList、LinkedList、Vector

        //ArrayList适合查询，不适合做频繁的增删元素，查询效率较高

        //ArrayList注意事项：
        //1.允许存放任何元素，包括空元素null

        //2.ArrayList 是由数组来实现数据存储的；
        //ArrayList基本等同于 Vector ，除了 ArrayList是线程不安全的，但执行效率高，在多线程的情况下不建议用ArrayList；

        //3.ArrayList中维护了一个Object类型的数组
        //transient Object[ ] elementData; //transient 短暂的 表示该属性不会被序列化
        //当创建ArrayList对象时，如果使用的是无参构造器，则初始elementData容量为0 ，第一次添加则扩容elementData为10，如需要再次扩容，则扩容elementData为1.5 倍；
        //如果使用的是指定大小的构造器，则初始扩容elementData容量为指定大小，如果需要再次扩容，则直接扩容为1.5倍；


        //Vector
        //Vector 底层也是一个对象数组，protected Object[ ] elementData；
        //Vector 是线程同步的，即线程安全，Vector类的操作方法带有synchronized
        //在开发中，需要线程同步安全时，考虑使用Vector

        ArrayList<String> list = new ArrayList<>();

        //add 添加
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        //remove 删除
        list.remove(1);
        System.out.println(list);

        //contains 查找
        System.out.println(list.contains("aaa"));

        //size 获得元素个数
        System.out.println(list.size());

        //isEmpty 判断是否为空
        System.out.println(list.isEmpty());

        //clear 清空
        list.clear();
        System.out.println(list);

        //addAll 函数原型：boolean addAll(Collection<? extends E> c);添加一个集合
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("aaa");
        list2.add("bbb");
        list2.add("ccc");
        list.addAll(list2);
        System.out.println(list);

        //containsAll 函数原型：boolean containsAll(Collection<?> c);
        //如果当前集合包含集合 c 中的所有元素，返回 true；如果当前集合不包含集合 c 中的任何元素或包含的元素不足，返回 false
        System.out.println(list.containsAll(list2));

        //removeAll 函数原型：boolean removeAll(Collection<?> c);
        //删除集合中所含有的c集合的每个元素（不考虑顺序），如果集合中没有c的元素则返回false
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("aaa");
        list3.add("ddd");
        System.out.println(list.removeAll(list3));
        System.out.println(list);

        //set 修改指定索引位置的元素
        list.set(0,"aaa");
        list.set(1,"bbb");
        System.out.println(list);

        //get 获得指定索引的元素
        System.out.println(list.get(1));

        //indexOf()  lastIndexOf()返回指定元素在集合中首次/末次出现的位置,不存在则返回-1
        System.out.println(list.indexOf("aaa"));
        System.out.println(list.indexOf("ccc"));

        //subList 返回从fromIndex到toIndex位置的子集合,返回的子集合： [fromIndex,toIndex) 左闭右开
        list.add("ccc");
        list.add("ddd");
        System.out.println(list.subList(0,2));

    }
}