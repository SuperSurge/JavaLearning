import java.util.StringJoiner;

public class StringBuffer_StringBuilder {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        sb1.append("hello");
        sb1.append(",");
        sb1.append("world");
        sb1.insert(5,"AAA");
        System.out.println(sb1);

        String s1 = sb1.toString();

        StringJoiner sj = new StringJoiner(";","[","]");
        sj.add("sdf");
        sj.add("odsfgk");
        String s2 = sj.toString();
        System.out.println(s2);
    }
}
