package eu.europa.edpb.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("caseType")
public class CaseType {
	
//	<isLocalCase id="101912" referenceList="XYesNoValueList"/>
//	<localCaseAdditionalInfo id="106865" referenceList="GdprLocalCaseValueList"/>

	
	private IsLocalCase isLocalCase;
	private LocalCaseAdditionalInfo localCaseAdditionalInfo;

	
	public CaseType() {
	}


	public IsLocalCase getIsLocalCase() {
		return isLocalCase;
	}


	public void setIsLocalCase(IsLocalCase isLocalCase) {
		this.isLocalCase = isLocalCase;
	}


	public LocalCaseAdditionalInfo getLocalCaseAdditionalInfo() {
		return localCaseAdditionalInfo;
	}


	public void setLocalCaseAdditionalInfo(LocalCaseAdditionalInfo localCaseAdditionalInfo) {
		this.localCaseAdditionalInfo = localCaseAdditionalInfo;
	}

}
