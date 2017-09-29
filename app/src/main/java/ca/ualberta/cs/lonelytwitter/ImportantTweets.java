/*
 * Class Name: ImportantTweets
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
 * Represents an ImportantTweet
 *
 * @author Mitchell Ballou
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */

public class ImportantTweets extends Tweet {

    /**
     * Constructs an ImportantTweet
     *
     * @param message tweet message
     */
    public ImportantTweets(String message){
        super(message);

    }

    /**
     * Constructs an ImportantTweet
     *
     * @param message tweet message
     * @param date tweet date
     */
    public ImportantTweets(String message, Date date) {
        super(message, date);
    }

    /**
     * Overrides object isImportant
     *
     * @return TRUE
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
