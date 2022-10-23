package edu.cs300;
import java.time.LocalDateTime;
//TODO: Add to make file

public class Meeting() {
    String name;
    String location;
    LocalDateTime time;
    int length;

    // Constructor
    public Meeting(String n, String loc, LocalDateTime t, int len) {
        this.name = n;
        this.location = loc;
        this.time = t;
        this.length = len;
    }

    // Other possible methods:
    // CheckConflict: checks if two meetings are overlapping

}