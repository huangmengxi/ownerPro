/**
 * StudentController.java	2017年12月1日
 *
 * 版权所有 © 中电科第28研究所 2011-2017。 保留一切权利。
 */
package com.xn.firstBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xn.firstBoot.domain.Student;
import com.xn.firstBoot.service.StudentService;

/**
 * 〈一句话功能简述〉
 *
 * <p>〈功能详细描述〉
 * @author admin 2017年12月1日
 * @see [相关类/方法]
 * @since 1.0
 */
@RestController
@RequestMapping("/student")
public class StudentController
{
    @Autowired
    private StudentService studentService;
    
    @RequestMapping(value="/inserStudent",method= {RequestMethod.POST,RequestMethod.GET})
    public boolean inserStudent(@RequestParam("sname") String sname, @RequestParam("sex") String sex) {
        System.out.println("222");
        System.out.println("111");
        return studentService.inserStudent(sname, sex);
    }
    
    @RequestMapping(value="/insertStudentWithBackId",method=RequestMethod.POST)
    public Student insertStudentWithBackId(@RequestParam("sname") String sname, @RequestParam("sex") String sex){
        System.out.println("333");
        System.out.println("555");
        System.out.println("444");
        return studentService.insertStudentWithBackId(sname, sex);
    }
}
