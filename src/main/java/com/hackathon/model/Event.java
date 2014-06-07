/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hackathon.model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Green Army
 */
@Entity
public class Event {
    private long eventId;
    private String description;
    private Date date;
    private String priority;
    private Date notify;
    private User creator;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Date getNotify() {
        return notify;
    }

    public void setNotify(Date notify) {
        this.notify = notify;
    }

    @OneToOne(targetEntity=User.class, cascade = {CascadeType.MERGE,CascadeType.PERSIST}, optional=false)
    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }
}
