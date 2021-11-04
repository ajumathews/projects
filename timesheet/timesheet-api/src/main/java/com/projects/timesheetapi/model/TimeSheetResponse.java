package com.projects.timesheetapi.model;


import lombok.*;

@Data
@Builder
public class TimeSheetResponse {

    private String date;
    private String desc;
}
