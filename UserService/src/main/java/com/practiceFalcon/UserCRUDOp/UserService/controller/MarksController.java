package com.practiceFalcon.UserCRUDOp.UserService.controller;
import com.practiceFalcon.UserCRUDOp.UserService.dto.UserDto;
import com.practiceFalcon.UserCRUDOp.UserService.model.Marks;
import com.practiceFalcon.UserCRUDOp.UserService.model.User;
import com.practiceFalcon.UserCRUDOp.UserService.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.practiceFalcon.UserCRUDOp.UserService.AppService.AppService;

import java.util.List;

@RestController

public class MarksController {

    private final MarksRepository marksRepository;
    private final AppService appService;

    public MarksController(MarksRepository marksRepository, AppService appService) {
        this.marksRepository = marksRepository;
        this.appService = appService;
    }
    @PostMapping("/marks")
    public Marks addMarks(@RequestBody Marks marks) {
        return marksRepository.save(marks);
    }
    @GetMapping("/marks")
    public List<Marks> getMarks() {
        List<Marks> marks = marksRepository.findAll();
        return marks;
    }
    @PutMapping("/marks/{id}")
    public Marks updateMarks( @PathVariable int id, @RequestBody Marks marks) {
        return appService.updateMarks(marks, id);
    }

    @DeleteMapping("/marks/{id}")
    public String deleteMarks(@PathVariable int id) {
        appService.deleteMarks(id);
        return "Marks deleted";
    }


}
