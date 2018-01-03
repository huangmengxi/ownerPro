/**
 * StudentService.java	2017年12月1日
 *
 * 版权所有 © 中电科第28研究所 2011-2017。 保留一切权利。
 */
package com.xn.firstBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xn.firstBoot.dao.StudentDao;
import com.xn.firstBoot.domain.Student;

/**
 * 〈一句话功能简述〉
 *
 * <p>〈功能详细描述〉
 * @author admin 2017年12月1日
 * @see [相关类/方法]
 * @since 1.0
 */
@Service("studentService")
public class StudentService
{
    @Autowired
    private StudentDao studentDao;
    
    public boolean inserStudent(String sname, String sex)
    {
        return studentDao.inserStudent(sname, sex)==1?true:false;
    }
    
    public Student insertStudentWithBackId(String sname, String sex) {
        Student student = new Student();
        student.setSname("王二麻");
        student.setSex("不男不女");
        studentDao.insertStudentWithBackId(student);
        return student;
    }
}
