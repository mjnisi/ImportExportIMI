package eu.europa.edpb.model;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("caseType")
public class CaseType {
	
//	<isLocalCase id="101912" referenceList="XYesNoValueList"/>
//	<localCaseAdditionalInfo id="106865" referenceList="GdprLocalCaseValueList"/>

	
	private IsLocalCase isLocalCase;
	@XStreamImplicit
	private List<LocalCaseAdditionalInfo> localCaseAdditionalInfo;

	
	public CaseType() {
	}


	public IsLocalCase getIsLocalCase() {
		return isLocalCase;
	}


	public void setIsLocalCase(IsLocalCase isLocalCase) {
		this.isLocalCase = isLocalCase;
	}


	public List<LocalCaseAdditionalInfo> getLocalCaseAdditionalInfo() {
		return localCaseAdditionalInfo;
	}


	public void setLocalCaseAdditionalInfo(List<LocalCaseAdditionalInfo> localCaseAdditionalInfo) {
		this.localCaseAdditionalInfo = localCaseAdditionalInfo;
	}


}
