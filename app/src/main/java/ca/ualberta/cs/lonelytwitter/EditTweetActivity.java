package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    private TextView tweetText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        tweetText = (TextView) findViewById(R.id.show_tweet);


        Bundle passedData = getIntent().getExtras();
        tweetText.setText(passedData.getString("Tweet Message"));

    }
}
