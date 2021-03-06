package com.example.tumb1r;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

public class Post implements Serializable {

	private static final long serialVersionUID = 1L;

	private static int MAX_LENGTH = 35;

	private long id;
	private String type;
	private long timestamp;
	private String state;
	private String tags;

	public Post() {

	}

	public Post(long id, String type, long timestamp, String state, String tags) {
		this.id = id;
		this.type = type;
		this.timestamp = timestamp;
		this.state = state;
		this.tags = tags;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		Date date = new Date(timestamp);
		return date + "(" + type + ")";
	}

	protected String shortenString(String string) {
		if (string.length() > MAX_LENGTH) {
			return string.substring(0, MAX_LENGTH) + "...";
		}

		return string;
	}

	protected String getDate() {
		DateFormat dateFormatter = DateFormat
				.getDateInstance(DateFormat.DEFAULT);
		String dateOut = dateFormatter.format(new Date(timestamp));
		return dateOut;
	}

	public String getHeader() {
		return "?";
	}
}
