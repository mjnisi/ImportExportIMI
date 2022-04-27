package eu.europa.edpb.model;

import java.util.Map;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("csaName")
public class CsaName {


	@XStreamAsAttribute
	private String id;
	
	@XStreamAsAttribute
	private String referenceList;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReferenceList() {
		return referenceList;
	}
	public void setReferenceList(String referenceList) {
		this.referenceList = referenceList;
	}
	public String getDescription() {
		Map<String, String> map1= ReferenceType.referenceList.get(getReferenceList());
		return map1.get(getId());
	}

}
