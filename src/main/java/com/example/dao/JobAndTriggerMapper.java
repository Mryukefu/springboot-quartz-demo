package com.example.dao;

import com.example.entity.JobAndTrigger;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JobAndTriggerMapper {

	public List<JobAndTrigger> getJobAndTriggerDetails();
}
