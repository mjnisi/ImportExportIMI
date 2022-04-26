package eu.europa.edpb.model;


import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("proposedDeadline")
public class ProposedDeadline {

	private String replyDate;

	public ProposedDeadline() {
	}

	public ProposedDeadline(String replyDate) {
		this.replyDate = replyDate;
	}

	public String getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(String replyDate) {
		this.replyDate = replyDate;
	}


}
