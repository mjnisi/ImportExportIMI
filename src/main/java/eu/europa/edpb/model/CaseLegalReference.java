package eu.europa.edpb.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("caseLegalReference")
public class CaseLegalReference {

//	<caseLegalReference id="107005" referenceList="GdprLegalReferenceValueList"/>
//	<caseLegalReference id="107003" referenceList="GdprLegalReferenceValueList"/>

	
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
