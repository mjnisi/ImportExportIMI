package eu.europa.edpb.model;

import java.util.Map;

public class ReferenceType {


	public static Map<String, Map<String, String>> referenceList;

	public Map<String, Map<String, String>> getReferenceList() {
		return referenceList;
	}

	public void setReferenceList(Map<String, Map<String, String>> referenceList) {
		ReferenceType.referenceList = referenceList;
	}

	
	
}
