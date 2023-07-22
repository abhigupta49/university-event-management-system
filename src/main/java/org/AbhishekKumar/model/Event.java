package org.AbhishekKumar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    //  eventId
//            eventName
//    locationOfEvent
//            date
//    startTime
//            endTime
    @Id
    private Integer eventId;

    @NotBlank(message = "eventname should not be Blank!!")
    private String eventName;

    @NotNull(message = "event location  should not be null!!")
    private String eventLocation;

    @NotNull(message = "event date should not be null!!!")
    @Future(message = "event date should be in future!!")
    private LocalDate eventDate;

    @NotNull
    private LocalTime eventStartTime;

    @NotNull
    private LocalTime eventEndTime;
}
