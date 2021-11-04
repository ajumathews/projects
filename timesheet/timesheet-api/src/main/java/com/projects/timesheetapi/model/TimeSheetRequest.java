package com.projects.timesheetapi.model;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Data
public class TimeSheetRequest {

    @NotEmpty
    private String date;

    private String desc;

}
