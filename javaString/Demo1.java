public class Demo1 {
    public static void main(String[] args){
        //一些函数

        String s1 = "a";
        String s2 = "a";

        String s3 = new String("sd");
        String s4 = new String("sd");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s3 == s4);//false
        System.out.println();

        //==比的是地址
        //s1，s2是用的常量池中的同一个对象
        //而s3，s4是new出来的，地址值不一样


        String s5 = "Ab";
        String s6 = "AB";
        System.out.println(s5.equals(s6));//false
        System.out.println(s5.equalsIgnoreCase(s6));//true,不区分大小写（验证码）
        System.out.println();

        //compareTo 比较两个字符串是否相等
        System.out.println("A".compareTo("B"));
        System.out.println("A".compareTo("b"));
        System.out.println("B".compareTo("Asda"));
        System.out.println();

        //contains 字符串查找
        System.out.println("helloword".contains("hello"));//true
        System.out.println("helloword".contains("helo"));//false
        System.out.println();

        //indexOf 查找，并返回第一次的索引，如无则返回-1
        System.out.println("helloworld".indexOf("world"));
        System.out.println("helloworld".indexOf("o",4));//从索引4开始查找
        System.out.println();

        //startsWith,endsWith 检查是否以指定前后缀开始或结束
        System.out.println("HelloWorld".startsWith("Hello"));//ture
        System.out.println("HelloWorld".startsWith("World",5));//ture starts可以带偏移量
        System.out.println("HelloWorld".endsWith("World"));//true 都要区分大小写
        System.out.println();

        //split join 拆分和链接
        String str = "my name is lee";
        String[] s = str.split(" ");
        for(String string : s){
            System.out.println(string);
        }

        String[] ss = {"my", "name","is","lee"};
        String str2 = String.join(" ",ss);
        System.out.println(str2);
    }
}