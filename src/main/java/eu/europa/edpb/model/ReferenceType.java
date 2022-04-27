package eu.europa.edpb.model;

import java.util.Map;

public class ReferenceType {

	
//	Map<String, String> map1= referenceList.get(art56.getCaseType().getIsLocalCase().getReferenceList());
//	String value = map1.get(art56.getCaseType().getIsLocalCase().getId());

	public static Map<String, Map<String, String>> referenceList;

	public Map<String, Map<String, String>> getReferenceList() {
		return referenceList;
	}

	public void setReferenceList(Map<String, Map<String, String>> referenceList) {
		ReferenceType.referenceList = referenceList;
	}

	
	
}
