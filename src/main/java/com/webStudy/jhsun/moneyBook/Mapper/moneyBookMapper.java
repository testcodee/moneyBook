package com.webStudy.jhsun.moneyBook.Mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface moneyBookMapper {

    String deleteByPrimaryKey(String id);
}
