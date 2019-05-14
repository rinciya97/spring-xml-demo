package com.stackroute.spring.domain;
import org.springframework.beans.factory.annotation.Autowired;
public class Movie {
    Actor actor;
    public Movie() { }
    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }
    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
