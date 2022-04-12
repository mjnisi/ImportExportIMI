package eu.europa.edpb.model;

import java.util.Date;

public class Article56 {

	private long id;
	private Date broadcastDate;

	public Article56() {
	}

	public Article56(long id, Date broadcastDate) {
		this.id = id;
		this.broadcastDate = broadcastDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getBroadcastDate() {
		return broadcastDate;
	}

	public void setBroadcastDate(Date broadcastDate) {
		this.broadcastDate = broadcastDate;
	}

}
