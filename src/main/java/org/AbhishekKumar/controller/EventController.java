package org.AbhishekKumar.controller;

import org.GouthamPeddi.model.Event;
import org.GouthamPeddi.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;
    //    Add event
//    Update event
//    Delete event
//    Get All events by date
    @PostMapping("event")
    public String addEvent(@RequestBody Event event){
        eventService.addEvent(event);
        return "event added"+" : "+event.getEventId()+" "+"successfully";
    }
    @PutMapping("events/event/{eId}/eventDate/{eventDate}")
    public String updateEvent(@PathVariable Integer eId, @PathVariable LocalDate eventDate){
        return  eventService.updateEvent(eId,eventDate);
    }
    @GetMapping("events/eventDate/{eventDate}")
    public List<Event> getAllEventsByDate(@PathVariable LocalDate eventDate){
        return eventService.getAllEventsByDate(eventDate);
    }
    @DeleteMapping("events/event/{eId}")
    public  String deleteEvent(@PathVariable Integer eId){
        return eventService.deleteEvent(eId);
    }
}
