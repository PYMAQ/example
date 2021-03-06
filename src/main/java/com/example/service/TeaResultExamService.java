package com.example.service;

import com.example.pojo.ExamLesson;
import com.example.pojo.StuResult;

import java.util.List;

public interface TeaResultExamService {
    //返回所有自己答题课程下学生的答题成绩
    public List<StuResult> manageStuExam(Integer id);
    public Integer findTeacheridByusername(String username);
    public List<ExamLesson> TeaExamlesson(String username);
    //增加答题课程
    public void addExamLesson(ExamLesson examLesson);
}
