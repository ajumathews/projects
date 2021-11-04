package com.projects.timesheetapi.controller;

import com.projects.timesheetapi.model.TimeSheetRequest;
import com.projects.timesheetapi.model.TimeSheetResponse;
import com.projects.timesheetapi.service.TimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@RestController
@RequestMapping("/timesheet/v1")
public class TimeSheetController {

    @Autowired
    private TimeSheetService timeSheetService;

    @PostMapping("/add")
    public ResponseEntity<TimeSheetRequest> addTimeSheet(
            @RequestBody @Valid TimeSheetRequest timeSheetRequest) {
        return ResponseEntity.ok().body(timeSheetService.add(timeSheetRequest));
    }


    @GetMapping("/retrieve/{option}")
    public ResponseEntity<List<TimeSheetResponse>> retrieve(
            @PathVariable("option") String option) {
        //month,day
        return ResponseEntity.ok().body(timeSheetService.retrieveTimeSheets());
    }

    @GetMapping("/retrieve/")
    public ResponseEntity<List<TimeSheetResponse>> retrievePerDate(
            @RequestParam("fromDate") @NotEmpty String fromDate,
            @RequestParam("toDate") @NotEmpty String toDate) {
        //fromDate , toDate
        return ResponseEntity.ok().body(timeSheetService.retrieveTimeSheets());
    }

}

