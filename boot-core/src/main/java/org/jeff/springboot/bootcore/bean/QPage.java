package org.jeff.springboot.bootcore.bean;

import lombok.Data;

import java.util.Collection;

@Data
public class QPage<T> {

    private Collection<T> rows;

    private long total;//总条数
    private long page;//第几页
    private long size;//每页几条
    private long pages;//总页数

}
