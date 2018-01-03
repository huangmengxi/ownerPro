/**
 * StudentMapper.java	2017年12月1日
 *
 * 版权所有 © 中电科第28研究所 2011-2017。 保留一切权利。
 */
package com.xn.firstBoot.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.xn.firstBoot.domain.Student;

/**
 * 〈一句话功能简述〉
 *
 * <p>〈功能详细描述〉
 * @author admin 2017年12月1日
 * @see [相关类/方法]
 * @since 1.0
 * 一个普通插入：直接用注解搞定
 *一个插入返回主键：需要使用xml来搞定
 */
public interface StudentMapper
{
    @Insert("insert into userinfo(username, sex) values (#{sname},#{sex})")
    public int inserStudent(@Param("sname") String sname, @Param("sex") String sex);
    
    /**
     * 插入用户，并将主键设置到user中
     * 注意：返回的是数据库影响条数，即1
     */
    public int insertStudentWithBackId(Student student);
   
}
