package chenjiajin.Annotationdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class AnnotationController {


    @PostMapping("/person")
    public String getPerson(@RequestBody @Valid Person person) {
//        Map<String,String> map = getData(person);
//        System.out.println("asdasdasdas:"+map.get("2"));
        System.out.println("12232:::"+ResponseEntity.ok().body(person).toString());
        return null;
    }


//    public  <T> Map<String,String> getData(T t){
//        Map<String,String> map = new HashMap<>();
//        String json =
//        String errors = JSONObject.parseObject(json).getString("errors");
//        if(StringUtil.isNullOrEmpty(errors)){
//            map.put("1","ok");
//        }else{
//            String data = JSONObject.parseObject(errors).getString("defaultMessage");
//            map.put("2",data);
//        }
//        return map;
//    }

}
