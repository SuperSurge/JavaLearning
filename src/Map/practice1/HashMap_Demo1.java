package Map.practice1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Demo1 {
    public static void main(String[] args) {
        HashMap<Integer,Employer> map = new HashMap();
        Employer e1 = new Employer(1,10000,"a");
        Employer e2 = new Employer(2,20000,"b");
        Employer e3 = new Employer(3,30000,"c");

        map.put(e1.getId(),e1);
        map.put(e2.getId(),e2);
        map.put(e3.getId(),e3);

        Set<Map.Entry<Integer,Employer>> entrySet = map.entrySet();
        for (Object o : entrySet) {
            System.out.println(o);
        }
    }
}
