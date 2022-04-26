package eu.europa.edpb.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("csaName")
public class CsaName {

//	<csaName id="107028" referenceList="GdprDpaListValueList"/>

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
