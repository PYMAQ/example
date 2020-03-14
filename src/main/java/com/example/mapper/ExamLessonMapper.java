package com.example.mapper;

import com.example.pojo.ExamLesson;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
@Repository
public interface ExamLessonMapper {
    /**
     *
     * 查询所有答题课程数据
     */

    public List<ExamLesson> findExamLesson();
}
