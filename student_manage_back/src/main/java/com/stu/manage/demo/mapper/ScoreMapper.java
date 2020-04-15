package com.stu.manage.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stu.manage.demo.entity.Score;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


/**
 * @author 刘龙
 */

@Component
@Mapper
public interface ScoreMapper extends BaseMapper<Score> {

    /**
     * 删除
     *
     * @param examId
     */
    void deleteExam(Integer examId);

    /**
     * 删除
     *
     * @param studentId
     */
    void deleteStudent(Integer studentId);

}