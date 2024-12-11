package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection2 {
    public static void main(String[] args) {
        //查找、替换
        //Object max ( Collection ) ：根据元素的自然顺序，返回给定集合中的最大元素；
        //Object max ( Collection , Comparator ) ：根据 Comparator 指定的顺序，返回给定集合中的最大元素；
        //Object min ( Collection )
        //Object min ( Collection , Comparator)
        //int frequency ( Collection , Object ) ： 返回指定集合中指定元素的出现次数；
        //void copy ( List dest , List src ) ： 将 src 中的内容复制到 dest 中；
        //boolean replaceAll ( List list , Object oldVal , Object newVal ) ： 使用新值替换List对象的所有旧值；

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        System.out.println(Collections.max(list));

        System.out.println(Collections.max(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }));

        System.out.println(Collections.frequency(list,"aaa"));

        ArrayList dest = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            dest.add(null);
        }
        Collections.copy(dest,list);
        System.out.println(dest);
        //长度不够报错，长度大于list则把前面的复制成list，后面的还是原来的值

        Collections.replaceAll(list,"aaa","AAA");
        System.out.println(list);
        //如果没有这个元素则不替换

    }
}
