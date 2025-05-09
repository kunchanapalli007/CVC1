package com.cvc.cvc_backend.service;

import com.cvc.cvc_backend.model.Event;
import com.cvc.cvc_backend.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepo;

    public EventService(EventRepository eventRepo) {
        this.eventRepo = eventRepo;
    }

    public List<Event> getAllEvents() {
        return eventRepo.findAll();
    }

    public Event createEvent(Event event) {
        return eventRepo.save(event);
    }

    public void deleteEvent(Long id) {
        eventRepo.deleteById(id);
    }
}
