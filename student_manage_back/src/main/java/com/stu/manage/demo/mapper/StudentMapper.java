package com.stu.manage.demo.mapper;

import com.stu.manage.demo.entity.GradeClass;
import com.stu.manage.demo.entity.Student;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 刘龙
 */

@Component
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    /**
     * 通过学生id删除学生
     *
     * @param studentId
     */
    void deleteStudentById(Integer studentId);
}