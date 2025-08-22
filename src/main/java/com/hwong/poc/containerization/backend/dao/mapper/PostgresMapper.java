package com.hwong.poc.containerization.backend.dao.mapper;

import com.hwong.poc.containerization.backend.dao.vo.TestDatabaseObject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostgresMapper {

    List<TestDatabaseObject> getTestDatabaseObjects();
}
