package com.wcy.gitgithub.controller;

import com.wcy.gitgithub.entity.Test1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="news")
public class ControllerTest1
{
    @RequestMapping(value = "getAll")
    public List<Test1> method1()
    {
        List<Test1> list=new ArrayList<>();
        Test1 new1=new Test1(1,"aaa1","bbbbbbb1");
        Test1 new2=new Test1(2,"aaa2","bbbbbbb2");
        Test1 new3=new Test1(3,"aaa3","bbbbbbb3");
        list.add(new1);
        list.add(new2);
        list.add(new3);
        return list;
    }
}
