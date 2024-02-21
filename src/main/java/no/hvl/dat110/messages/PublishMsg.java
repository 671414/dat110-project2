package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 
	private String user;
	private String topic;
	private String message;
	public PublishMsg(String user, String topic, String message) {
	this.user=user;
	this.topic=topic;
	this.message=message;
	}

	@Override //er nok ikke behov for denne
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "PublishMsg{" +
				"user='" + user + '\'' +
				", topic='" + topic + '\'' +
				", message='" + message + '\'' +
				'}';
	}

	public String getMessage() {
		
		throw new UnsupportedOperationException(TODO.method());
	}
}
