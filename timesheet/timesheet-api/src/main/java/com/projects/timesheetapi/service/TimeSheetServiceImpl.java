package com.projects.timesheetapi.service;

import com.projects.timesheetapi.model.TimeSheetRequest;
import com.projects.timesheetapi.model.TimeSheetResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeSheetServiceImpl implements TimeSheetService {

    @Override
    public TimeSheetRequest add(TimeSheetRequest timeSheetRequest){
        return timeSheetRequest;
    }

    @Override
    public List<TimeSheetResponse> retrieveTimeSheets(){
        return List.of(new TimeSheetResponse());
    }
}
