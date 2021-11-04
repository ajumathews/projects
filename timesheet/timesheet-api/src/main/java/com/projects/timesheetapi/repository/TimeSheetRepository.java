package com.projects.timesheetapi.repository;

import com.projects.timesheetapi.entity.TimeSheet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeSheetRepository extends MongoRepository<TimeSheet, String> {
}
