package com.example.service;

import com.example.domain.Example;
import com.example.domain.vo.ExampleVo;
import com.example.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {

    @Autowired
    private ExampleRepository repository;

    public List<Example> getExamples() {
        return repository.findAll();
    }

    public Example getExample(Long id) {
        return repository.getOne(id);
    }

    public Example createExample(ExampleVo vo) {
        Example example = new Example(vo);
        return repository.save(example);
    }

    public Example updateExample(Long id, ExampleVo vo) {
        Example example = new Example(id, vo);
        return repository.save(example);
    }

    public void deleteExample(Long id) {
        repository.deleteById(id);
    }
}
