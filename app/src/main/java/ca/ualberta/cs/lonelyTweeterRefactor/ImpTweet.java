package ca.ualberta.cs.lonelyTweeterRefactor;

/**
 * Created by Luke Slevinsky on 2019-03-21.
 */
public class ImpTweet extends Tweet {
    int name;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public boolean isvalid() {
        int length = getTweetBody().trim().length();
        if (length == 0 || length < 100) {
            return false;
        }
        return true;
    }
}
