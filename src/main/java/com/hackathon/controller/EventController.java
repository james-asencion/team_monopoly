/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.controller;

import com.google.gson.Gson;
import com.hackathon.model.Event;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author jasencion
 */
@Controller
public class EventController {

    @RequestMapping(value = "get/event/{eventId}", method = RequestMethod.GET)
    @ResponseBody
    public String getEvent(@PathVariable("eventId") int eventId) {
        
        Event event = new Event();
        event.setCreatorId(1);
        event.setEventDate(new Date());
        event.setEventDescription("This is a description");
        event.setNotifyDate(new Date());
        event.setPriority("High Priority");
        
	Gson gson = new Gson();
        return gson.toJson(event);
    }

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    @ResponseBody
    public String getAllEvents() {
        List<Event> events = new ArrayList<>();

        Event event1 = new Event();
        event1.setCreatorId(1);
        event1.setEventDate(new Date());
        event1.setEventDescription("This is a description1");
        event1.setNotifyDate(new Date());
        event1.setPriority("High Priority1");

        Event event2 = new Event();
        event2.setCreatorId(2);
        event2.setEventDate(new Date());
        event2.setEventDescription("This is a description2");
        event2.setNotifyDate(new Date());
        event2.setPriority("High Priority2");

        events.add(event1);
        events.add(event2);
        
        Gson gson = new Gson();
        return gson.toJson(events);

    }
    
}
