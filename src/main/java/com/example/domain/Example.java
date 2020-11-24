package com.example.domain;

import com.example.domain.vo.ExampleVo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Example {

    @Id
    private Long id;

    private String data;

    public Example() {
    }

    public Example(ExampleVo vo) {
        this.data = vo.getData();
    }

    public Example(Long id, ExampleVo vo) {
        this.id = id;
        this.data = vo.getData();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
