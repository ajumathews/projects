package com.projects.timesheetapi.entity;

import com.projects.timesheetapi.model.TimeSheetRequest;
import com.projects.timesheetapi.model.TimeSheetResponse;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "timesheet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TimeSheet {

    @Id
    private String id;
    private String date;
    private String desc;

    public static TimeSheet of(TimeSheetRequest timeSheetRequest) {
        return TimeSheet.builder()
                .date(timeSheetRequest.getDate())
                .desc(timeSheetRequest.getDesc())
                .build();
    }

    public TimeSheetResponse fromDomain() {
        return TimeSheetResponse.builder()
                .date(date)
                .desc(desc)
                .build();
    }
}
