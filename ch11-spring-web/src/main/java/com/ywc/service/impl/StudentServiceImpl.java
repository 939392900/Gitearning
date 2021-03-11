package com.ywc.service.impl;

import com.ywc.dao.StudentDao;
import com.ywc.domain.Student;
import com.ywc.service.StudentService;

import java.util.List;

/**
 * @author BaiGei
 * @date 2021-03-08 18:52
 */
public class StudentServiceImpl implements StudentService {
    /**
     * 引用类型
     */
    private StudentDao studentDao;

    public void setDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Override
    public List<Student> queryStudent() {
        return studentDao.selectStudents();
    }
}
