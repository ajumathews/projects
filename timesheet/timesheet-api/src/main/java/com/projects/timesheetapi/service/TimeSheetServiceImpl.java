package com.projects.timesheetapi.service;

import com.projects.timesheetapi.entity.TimeSheet;
import com.projects.timesheetapi.model.TimeSheetRequest;
import com.projects.timesheetapi.model.TimeSheetResponse;
import com.projects.timesheetapi.repository.TimeSheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TimeSheetServiceImpl implements TimeSheetService {

    @Autowired
    private TimeSheetRepository timeSheetRepository;

    @Override
    public TimeSheetRequest add(TimeSheetRequest timeSheetRequest) {
        TimeSheet timeSheet = TimeSheet.toDomain(timeSheetRequest);
        timeSheetRepository.insert(timeSheet);
        return timeSheetRequest;
    }

    @Override
    public List<TimeSheetResponse> retrieveTimeSheets() {
        List<TimeSheet> timeSheets = timeSheetRepository.findAll();
        return timeSheets.stream().map(TimeSheet::fromDomain).collect(Collectors.toList());
    }
}
