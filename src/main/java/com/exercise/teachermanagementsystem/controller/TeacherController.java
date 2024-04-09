package com.exercise.teachermanagementsystem.controller;

import com.exercise.teachermanagementsystem.dao.TeacherRepository;
import com.exercise.teachermanagementsystem.entity.Teacher;
import com.exercise.teachermanagementsystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/teachers")
public class TeacherRESTController {

    @Autowired
    private TeacherService teacherService;
    @Autowired
    private TeacherRepository teacherRepository;


    @GetMapping("/get")
    public String getTeachers(Model model){
        List<Teacher> teacherList = teacherService.findAll();
        model.addAttribute("teachers", teacherList);
        return "teachers";
    }

    @GetMapping("/addTeacher")
    public String addTeacher(Model model){
        model.addAttribute("teacher", new Teacher());
        return "add-teacher";
    }

    @PostMapping("/add")
    public String addTeacher(@ModelAttribute("teacher") Teacher teacher){
        teacher.setId(0);
        Teacher teacherDB = teacherService.save(teacher);
        return "teachers";
    }

    @GetMapping("/updateTeacher/{teacherId}")
    public String updateTeacher(@PathVariable int teacherId, Model model){
        Teacher teacher = teacherService.findById(teacherId);
        model.addAttribute("teacher", teacher);
        return "update-teacher";
    }

    @PutMapping("/update")
    public Teacher updateTeacher(@ModelAttribute("teacher") Teacher teacher){
        Teacher teacherDB = teacherService.save(teacher);
        return teacherDB;
    }

    @DeleteMapping("/deleteTeacher/{teacherId}")
    public String deleteTeacher(@PathVariable int teacherId){
        Teacher teacher = teacherService.findById(teacherId);
        if(teacher == null){
            throw new RuntimeException("Teacher id not found - " + teacherId);
        }
        teacherService.deleteByID(teacherId);
        return "Deleted teacher id - " + teacherId;
    }

}
