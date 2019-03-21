package ca.ualberta.cs.lonelyTweeterRefactor;

import java.util.Date;

public class NormalLonelyTweet extends Tweet {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isvalid() {
		if (getTweetBody().trim().length() == 0
				|| getTweetBody().trim().length() > 10) {
			return false;
		}

		return true;
	}
}