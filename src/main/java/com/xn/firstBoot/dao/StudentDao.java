/**
 * StudentDao.java	2017年12月1日
 *
 * 版权所有 © 中电科第28研究所 2011-2017。 保留一切权利。
 */
package com.xn.firstBoot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xn.firstBoot.domain.Student;
import com.xn.firstBoot.mapper.StudentMapper;

/**
 * 〈一句话功能简述〉
 *
 * <p>〈功能详细描述〉
 * @author admin 2017年12月1日
 * @see [相关类/方法]
 * @since 1.0
 */
@Repository
public class StudentDao
{
    @Autowired
    private StudentMapper studentMapper;

    public int inserStudent(String sname, String sex) {
        return studentMapper.inserStudent(sname, sex);
    }
    
    public int insertStudentWithBackId(Student student) {
        return studentMapper.insertStudentWithBackId(student);
    }
}
