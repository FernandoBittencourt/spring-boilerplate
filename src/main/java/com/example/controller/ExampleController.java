package com.example.controller;

import com.example.domain.Example;
import com.example.domain.vo.ExampleVo;
import com.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController(value = "/example")
public class ExampleController {

    @Autowired
    private ExampleService service;

    @GetMapping
    public List<Example> getExamples() {
        return service.getExamples();
    }

    @GetMapping("/{id}")
    public Example getExample(@PathVariable Long id) {
        return service.getExample(id);
    }

    @PostMapping
    public Example createExample(ExampleVo vo) {
        return service.createExample(vo);
    }

    @PutMapping("/{id}")
    public Example updateExample(@PathVariable Long id, ExampleVo vo) {
        return service.updateExample(id, vo);
    }

    @DeleteMapping("/{id}")
    public void deleteExample(@PathVariable Long id) {
        service.deleteExample(id);
    }
}
