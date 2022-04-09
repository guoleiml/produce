package com.bgl.produce.bean;

import lombok.Data;

import java.util.List;

@Data
public class ResponeData<T> {

    private int code;

    private String msg;

    private int count;

    private List<T> data;
}
