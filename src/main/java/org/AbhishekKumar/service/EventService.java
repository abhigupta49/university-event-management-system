package org.GouthamPeddi.service;

import org.GouthamPeddi.model.Event;
import org.GouthamPeddi.repository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    IEventRepo eventRepo;

    public void addEvent(Event event) {
        eventRepo.save(event);
    }

    public String updateEvent(Integer eId, LocalDate eventDate) {
        Optional<Event> myEventOpt = eventRepo.findById(eId);
        Event myEvent = null;
        if(myEventOpt.isPresent()){
            myEvent = myEventOpt.get();
        }else{
            return "evnet Id "+" : "+ eId + " "+ "not found";
        }
        myEvent.setEventDate(eventDate);
        eventRepo.save(myEvent);
        return "event Id"+" : "+ eId + " "+ "date"+" "+eventDate+" "+"successfully updated";
    }

    public List<Event> getAllEventsByDate(LocalDate eventDate) {
        return eventRepo.findAllByEventDate(eventDate);
    }

    public String deleteEvent(Integer eId) {
        if(eventRepo.existsById(eId)){
            eventRepo.deleteById(eId);
            return "Event" + " : " + eId+ " " + "Successfully deleted";
        }
        return "no such event exist!!!!";
    }
}
