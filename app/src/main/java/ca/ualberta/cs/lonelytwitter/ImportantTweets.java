package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ballou on 9/14/17.
 */

public class ImportantTweets extends Tweet {

    public ImportantTweets(String message){
        super(message);

    }

    public ImportantTweets(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
