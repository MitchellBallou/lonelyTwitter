
/*
 * Class Name: Tweet
 *
 * Version: Version 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */


package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Represents a Tweet
 *
 * @author Mitchell Ballou
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweets
 * @since 1.0
 */

public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;


    /**
     * Constructs a tweet object
     *
     * @param message tweet message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs a Tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Abstract class to be implemented by subclasses
     *
     * @return Boolean true if important, flase if not
     */
    public abstract Boolean isImportant();


    /**
     * Sets tweet messages
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Gets Date
     *
     * @return tweet date
     */
    public Date getDate(){
        return date;
    }

    /**
     * Gets Message
     *
     * @return tweet message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets date
     *
     * @param date tweet date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Overrides object toString
     *
     * @return tweetDate | tweetMessage
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}