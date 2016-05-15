package com.example.championship.model;
public class Team {
    private long id;
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public Team() {}

    @Override
    public String toString() {
        return "Team " + name;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}