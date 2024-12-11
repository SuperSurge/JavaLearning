
package Map;

import java.util.*;

public class Map_ {
    public static void main(String[] args) {
        //1.Map 与 Collection 并列存在，用于保存具有映射关系的数据：Key - Value；
        //2.Map 中的 Key 和 Value 可以是任何引用类型的数据，会封装到 HashMap$Node对象中；
        //3.Map中的 Key 不允许重复，原因和 HashSet 一样;
        //4.Map 中的 Value 可以重复；
        //5.Map 的 Key 可以为 null，value 也可以为 null，但 key 为 null 只能有一个；
        //6.常用 String 类作为 Map 的 key，当然，其他类型也可以，但不常用；
        //7.Key 和 Value 之间存在单向一对一关系，即通过指定的 Key 总能找到对应的 Value；


        //Map 接口和常用方法:
        //
        //put ：添加
        //remove ： 根据键删除映射关系
        //get ： 根据键获取值
        //size ： 获取元素个数
        //isEmpty ： 判断个数是否为0
        //clear ： 清除
        //containsKey ： 查找键是否存在

        Map map = new HashMap<>();
        map.put(123,234);
        map.put("wshin","sdf");
        map.put(null,"poooo");
        map.put(2,null);

        System.out.println(map);

        map.remove(null);
        System.out.println(map);

        System.out.println(map.get(123));//如果get的是一个没有的key，打印null

        System.out.println(map.size());

        System.out.println(map.isEmpty());

        System.out.println(map.containsKey("234"));

        System.out.println(map.containsValue(234));
        System.out.println("-------------");

        //Map 接口遍历方法
        //containsKey ： 查找键是否存在
        //keySet ： 获取所有的键
        //entrySet ：获取所有关系
        //values ： 获取所有的值

        //1.先取出所有的key，通过key取出对应的value
        Set keySet = map.keySet();
        //（1）增强for
        for(Object key : keySet){
            System.out.println(key + " - " + map.get(key));
        }
        System.out.println("-----------");

        //（2）迭代器
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key + " - " + map.get(key));
        }


        //2.取出所有的value，再遍历
        Collection values = map.values();
        //(1)增强for
        for (Object value : values) {
            System.out.println(value);
        }
        System.out.println("---------");

        //（2）迭代器
        Iterator iterator1 = values.iterator();
        while(iterator1.hasNext()){
            Object value = iterator1.next();
            System.out.println(value);
        }
        System.out.println("-----------");


        //3.通过EntrySet来获取
        Set entryset = map.entrySet();
        //（1）增强for
        for (Object o : entryset) {
            Map.Entry m = (Map.Entry) o;
            System.out.println(m);
        }
        System.out.println("---------");

        //或者
        Set<Map.Entry> entrySet1 = map.entrySet();
        for (Map.Entry entry : entrySet1) {
            System.out.println(entry);
        }
        System.out.println("-----------------");

        //(2)迭代器
        Iterator iterator2 = entryset.iterator();
        while(iterator2.hasNext()){
            Map.Entry m = (Map.Entry) iterator2.next();
            System.out.println(m);
        }
        System.out.println("------------");
    }
}
