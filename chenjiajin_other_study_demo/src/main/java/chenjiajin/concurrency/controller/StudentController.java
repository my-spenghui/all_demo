package chenjiajin.concurrency.controller;


import chenjiajin.concurrency.service.IGetAllStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    private IGetAllStudent iGetAllStudent;

    @GetMapping("get_all_student")
    public Map<String,Object> getAllStudent()throws Exception {

        return iGetAllStudent.getAllStudent();
    }
}
