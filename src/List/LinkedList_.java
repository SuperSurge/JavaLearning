package List;

import java.util.LinkedList;

public class LinkedList_ {
    public static void main(String[] args) {
        // LinkedList 底层结构 （双向链表和增删改查案例）

        //LinkedList 实现了双向链表和双端队列的特点
        //可以添加任意元素（元素可以重复），包括null；
        //线程不安全，没有实现同步
        //LinkedList底层维护了一个双向链表；
        //LinkedList中维护了两个属性first和last分别指向 首节点 和 尾节点；
        //每个节点（Node对象），里面又维护了prev、next、item三个属性，其中通过prev指向前一个，通过next指向后一个节点，最终完成双向链表；
        //所以 LinkedList的元素的添加和删除不是通过数组完成的，相对来说效率较高；但是查找效率较低

        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list);

        System.out.println(list.contains("aaa"));
    }
}
