package com.example.new_noteapp;

public class Note {
    private String title;
    private String description ;
    private int priority;

    public int getCardviewcolor() {
        return cardviewcolor;
    }

    public void setCardviewcolor(int cardviewcolor) {
        this.cardviewcolor = cardviewcolor;
    }

    private int cardviewcolor;

    public Note()
    {
        // empty constructor needed
    }
    public Note(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
