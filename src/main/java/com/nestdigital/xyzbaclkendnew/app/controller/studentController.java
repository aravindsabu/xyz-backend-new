package com.nestdigital.xyzbaclkendnew.app.controller;

import com.nestdigital.xyzbaclkendnew.app.dao.StudentDao;
import com.nestdigital.xyzbaclkendnew.app.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {

    @Autowired
    private StudentDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path="/studentEntry",consumes = "application/json",produces = "application/json")
    public String studentEntry(@RequestBody StudentModel student) {
        System.out.println(student.toString());
        dao.save(student);

        return "{status:'success'}";
    }
}
