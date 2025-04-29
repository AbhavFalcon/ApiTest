package com.practiceFalcon.UserCRUDOp.UserService.controller;
import com.practiceFalcon.UserCRUDOp.UserService.model.Marks;
import com.practiceFalcon.UserCRUDOp.UserService.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class MarksController {

    private final MarksRepository marksRepository;

    public MarksController(MarksRepository marksRepository) {
        this.marksRepository = marksRepository;
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


}
