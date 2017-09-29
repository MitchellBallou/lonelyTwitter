/*
 * Class Name: NormalTweet
 *
 * Version: Version 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use,
 * distribute, or modify this code under terms and conditions of the Code of Students Behavior at
 * University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Reresents a NormalTweet
 *
 * @author Mitchell Ballou
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */

public class NormalTweet extends Tweet{

    /**
     * Constructs a NormalTweet
     *
     * @param message tweet message
     */
    public NormalTweet(String message) {
        super(message);
    }


    /**
     * Constructs a NormalTweet
     *
     * @param message tweet message
     * @param date tweet date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }


    /**
     * Overrides object isImportant
     *
     * @return FALSE
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
