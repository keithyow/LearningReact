package Chapter4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        new MapDemo().demo1();
    }

    public void demo1() {
        Map map = new HashMap();
        map.put("name", "John Doe");
        map.put("salary", 50_000.00f);
        map.put("age", "40");
        System.out.println("Name = " + map.get("name"));
        Set keys = map.keySet();
        System.out.println(keys);
        int num = keys.size();
        Iterator iterator = keys.iterator();
        while(iterator.hasNext()){
            String key = (String)iterator.next();
//            System.out.println(key);
            System.out.printf("%s = %s ", key, map.get(key));
        }

    }
}
