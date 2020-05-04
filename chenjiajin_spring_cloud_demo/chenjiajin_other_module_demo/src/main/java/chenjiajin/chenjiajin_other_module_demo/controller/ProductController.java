package chenjiajin.chenjiajin_other_module_demo.controller;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("product")
public class ProductController {


    @GetMapping("get_product_name")
    public Object getProductName(){
        String [] names = new String [10];
        for (int i = 0; i < names.length; i++) {
            names[i] = "名字："+i;
        }
        return names;
    }
}
