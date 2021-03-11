package com.ywc.service;

import com.ywc.domain.Student;

import java.util.List;

/**
 * @author BaiGei
 * @date 2021-03-08 18:51
 */
public interface StudentService {
    /**
     * 添加
     *
     * @param student student
     * @return 结果
     */
    int addStudent(Student student);

    /**
     * 查询
     *
     * @return 结果
     */
    List<Student> queryStudent();
}
