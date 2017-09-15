package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ballou on 9/14/17.
 */

public abstract class Mood implements MoodDependentFormatMethod {
    private String message;
    private Date date;
    private ArrayList Mood;


    public Mood(String message){
        this.message = message;
        this.date = new Date();
    }

    public Mood(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

    public String getMessage(){
        return message;
    }
}
