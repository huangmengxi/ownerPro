/**
 * Student.java	2017年12月1日
 *
 * 版权所有 © 中电科第28研究所 2011-2017。 保留一切权利。
 */
package com.xn.firstBoot.domain;

/**
 * 〈一句话功能简述〉
 *
 * <p>〈功能详细描述〉
 * @author admin 2017年12月1日
 * @see [相关类/方法]
 * @since 1.0
 */
public class Student
{
    private Integer sno;
    private String sname;
    private String sex;
    /**
     * @return the sno
     */
    public Integer getSno()
    {
        return sno;
    }
    /**
     * @param sno the sno to set
     */
    public void setSno(Integer sno)
    {
        this.sno = sno;
    }
    private Integer age;
    /**
     * @return the sname
     */
    public String getSname()
    {
        return sname;
    }
    /**
     * @param sname the sname to set
     */
    public void setSname(String sname)
    {
        this.sname = sname;
    }
    /**
     * @return the sex
     */
    public String getSex()
    {
        return sex;
    }
    /**
     * @param sex the sex to set
     */
    public void setSex(String sex)
    {
        this.sex = sex;
    }
    /**
     * @return the age
     */
    public Integer getAge()
    {
        return age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(Integer age)
    {
        this.age = age;
    }
    
}
