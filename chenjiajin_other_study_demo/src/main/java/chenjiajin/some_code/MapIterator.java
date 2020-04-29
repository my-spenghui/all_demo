package chenjiajin.some_code;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIterator {

    public static Student student;

    static {
        student = new Student();
        student.put("name","陈嘉劲");
        student.put("age","18");
        student.put("sex","未知");
    }



    public static void main(String[] args) {
        /**
         * 遍历jsonobject获得key
         */
//        Iterator<Map.Entry<String, Object>> iterator = student.entrySet().iterator();
//        while (iterator.hasNext()){
//            String key = iterator.next().getKey();
//            System.out.println(key);
//        }

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name","陈嘉劲");
        hashMap.put("age","18");
        hashMap.put("sex","未知");


        /**
         *  遍历map获得key和value
         */
        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
        System.out.println("----------------------------------------------");
        // forEach用法
        hashMap.forEach((key, value) -> System.out.println("key = " + key + ", value = " + value));
    }

}

class Student extends JSONObject {

}
