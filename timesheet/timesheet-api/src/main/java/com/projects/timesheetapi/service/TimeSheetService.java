package com.projects.timesheetapi.service;

import com.projects.timesheetapi.model.TimeSheetRequest;
import com.projects.timesheetapi.model.TimeSheetResponse;

import java.util.List;

public interface TimeSheetService {
    TimeSheetRequest add(TimeSheetRequest timeSheetRequest);

    List<TimeSheetResponse> retrieveTimeSheets();
}
