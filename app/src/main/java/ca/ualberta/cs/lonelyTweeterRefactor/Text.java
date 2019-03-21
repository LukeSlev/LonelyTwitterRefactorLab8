package ca.ualberta.cs.lonelyTweeterRefactor;

import java.util.Date;

/**
 * Created by Luke Slevinsky on 2019-03-21.
 */
public abstract class Text {
    protected Date tweetDate;
    protected String tweetBody;

    public Date getTweetDate() {
        return tweetDate;
    }

    public String getTweetBody() {
        return tweetBody;
    }

    @Override
    public String toString() {
        return getTweetDate() + " | " + getTweetBody() ;
    }
}
