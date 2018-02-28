package com.example.demo.mapper;


import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author guzemin@songxiaocai.com
 * @create 2018-02-26 17:27
 **/
public interface MyMapper<T> extends Mapper<T>, IdsMapper<T>, MySqlMapper<T> {
}
