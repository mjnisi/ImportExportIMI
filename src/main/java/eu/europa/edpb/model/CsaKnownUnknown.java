package eu.europa.edpb.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("csaKnownUnknown")
public class CsaKnownUnknown {

	//	<csaKnownUnknown id="101916" referenceList="XKnownValueList"/>

	@XStreamAsAttribute
	private long id;
	@XStreamAsAttribute
	private String referenceList;
	private String description;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getReferenceList() {
		return referenceList;
	}
	public void setReferenceList(String referenceList) {
		this.referenceList = referenceList;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
