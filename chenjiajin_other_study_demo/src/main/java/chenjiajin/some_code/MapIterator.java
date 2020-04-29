package chenjiajin.some_code;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
        Iterator<Map.Entry<String, Object>> iterator = student.entrySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next().getKey();
            System.out.println(key);
        }
    }

}

class Student extends JSONObject {

}
