package eu.europa.edpb.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("edpbDemoArticle56")
public class EdpbDemoArticle56 {

    @XStreamAsAttribute
	private long number;
	private String broadcastDate;
	private ProposedDeadline proposedDeadline;
	private CaseType caseType;
	private CaseBackground caseBackground;
	private AssumedCSAOnetomanyList assumedCSAOnetomanyList;
	
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getBroadcastDate() {
		return broadcastDate;
	}

	public void setBroadcastDate(String broadcastDate) {
		this.broadcastDate = broadcastDate;
	}

	public ProposedDeadline getProposedDeadline() {
		return proposedDeadline;
	}

	public void setProposedDeadline(ProposedDeadline proposedDeadline) {
		this.proposedDeadline = proposedDeadline;
	}

	public CaseType getCaseType() {
		return caseType;
	}

	public void setCaseType(CaseType caseType) {
		this.caseType = caseType;
	}

	public CaseBackground getCaseBackground() {
		return caseBackground;
	}

	public void setCaseBackground(CaseBackground caseBackground) {
		this.caseBackground = caseBackground;
	}

	public AssumedCSAOnetomanyList getAssumedCSAOnetomanyList() {
		return assumedCSAOnetomanyList;
	}

	public void setAssumedCSAOnetomanyList(AssumedCSAOnetomanyList assumedCSAOnetomanyList) {
		this.assumedCSAOnetomanyList = assumedCSAOnetomanyList;
	}

}
