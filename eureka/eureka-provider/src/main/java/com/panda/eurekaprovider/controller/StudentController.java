package com.panda.eurekaprovider.controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {



    @GetMapping(value = "/getStudent")
    @ResponseBody
    public Map<String,Object> getStudent(@RequestParam Integer id){
        Map<String,Object> data = new HashMap<>();
        data.put("id",id);
        data.put("userName","xiaoMing");
        data.put("from","provider-A");
        return data;
    }



}
