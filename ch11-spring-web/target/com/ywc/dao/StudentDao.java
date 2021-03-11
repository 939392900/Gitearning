package com.ywc.dao;

import com.ywc.domain.Student;

import java.util.List;

/**
 * @author BaiGei
 * @date 2021-03-08 18:31
 */
public interface StudentDao {
    /**
     * 插入数据
     *
     * @param student 插入学生
     * @return 学生
     */
    int insertStudent(Student student);

    /**
     * 查询学生
     *
     * @return 查询结果
     */
    List<Student> selectStudents();

}
