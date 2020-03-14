package com.example.mapper;

import com.example.pojo.ExamLesson;
import com.example.pojo.StuResult;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
@Repository
public interface TeaResultExamMapper {
    //返回所有自己答题课程下学生的答题成绩
    public List<StuResult> manageStuExam(Integer id);
    public Integer findTeacheridByusername(String username);
    //返回教师自己出的答题课程信息
    public List<ExamLesson> TeaExamlesson(String username);
    //增加答题课程
    public void addExamLesson(ExamLesson examLesson);

}
