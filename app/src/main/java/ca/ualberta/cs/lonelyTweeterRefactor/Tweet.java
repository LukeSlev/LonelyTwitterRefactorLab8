package ca.ualberta.cs.lonelyTweeterRefactor;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Luke Slevinsky on 2019-03-21.
 */
public abstract class Tweet extends Text implements Serializable {
    private static final long serialVersionUID = 1L;

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    public void setTweetBody(String tweetBody) {
        this.tweetBody = tweetBody;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(getTweetDate());
        out.writeObject(getTweetBody());
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        tweetBody = (String) in.readObject();
    }

    public abstract boolean isvalid();

}
