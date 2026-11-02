package com.smsk.Healthcare.controller;
import com.smsk.Healthcare.service.student_service;
import com.smsk.Healthcare.entity.student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor

public class student_controller {
    private final student_service con;

    @GetMapping("/all")
    public List<student> getall() {
        return con.get();
    }

    @PostMapping("/add")
    public student add(@RequestBody student student_new) {
        return con.insert(student_new);
    }

    @PutMapping("/update/{id}")
    public student update(@PathVariable Long id, @RequestBody student new_student){
        return con.update(id,new_student);
    }


@DeleteMapping("/delete/{id}")

public void delete(Long id) {
    con.delete(id);
}
}
