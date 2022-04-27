package eu.europa.edpb.model;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("caseBackground")
public class CaseBackground {
	
//	<caseFileTitle locale="en">test data</caseFileTitle>
//	<caseNationalReferenceNumber>test data</caseNationalReferenceNumber>
//	<caseProcessingDescription locale="en">test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data</caseProcessingDescription>
//	<caseOrigin id="106868" referenceList="GdprCaseOriginValueList"/>
//	<caseKindOfDecision id="106892" referenceList="GdprKindOfDecisionValueList"/>
//	<caseKindOfDecision id="106877" referenceList="GdprKindOfDecisionValueList"/>
//	<caseKindOfDecisionOther locale="en">test data</caseKindOfDecisionOther>
//	<caseTopic id="106906" referenceList="GdprTopicOfCaseValueList"/>
//	<caseTopicOther locale="en">test data</caseTopicOther>
//	<caseLegalReference id="107005" referenceList="GdprLegalReferenceValueList"/>
//	<caseLegalReference id="107003" referenceList="GdprLegalReferenceValueList"/>
//	<caseLegalReferenceOther locale="en">test data</caseLegalReferenceOther>
//	<caseSecurityRequirements locale="en">test data test data test data</caseSecurityRequirements>
//	<caseDescription locale="en">test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data </caseDescription>
//	<caseDescriptionWithPersonalData locale="en">test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data </caseDescriptionWithPersonalData>

	
	private String caseFileTitle;
	private String caseNationalReferenceNumber;
	private String caseProcessingDescription;
	private CaseOrigin caseOrigin;
	@XStreamImplicit
	private List<CaseKindOfDecision> caseKindOfDecision;
	private String caseKindOfDecisionOther;
	private CaseTopic caseTopic;
	private String caseTopicOther;
	@XStreamImplicit
	private List<CaseLegalReference> caseLegalReference;
	private String caseLegalReferenceOther;
	private String caseSecurityRequirements;
	private String caseDescription;
	private String caseDescriptionWithPersonalData;
	
	public CaseBackground() {
	}

	public String getCaseFileTitle() {
		return caseFileTitle;
	}

	public void setCaseFileTitle(String caseFileTitle) {
		this.caseFileTitle = caseFileTitle;
	}

	public String getCaseNationalReferenceNumber() {
		return caseNationalReferenceNumber;
	}

	public void setCaseNationalReferenceNumber(String caseNationalReferenceNumber) {
		this.caseNationalReferenceNumber = caseNationalReferenceNumber;
	}

	public String getCaseProcessingDescription() {
		return caseProcessingDescription;
	}

	public void setCaseProcessingDescription(String caseProcessingDescription) {
		this.caseProcessingDescription = caseProcessingDescription;
	}

	public CaseOrigin getCaseOrigin() {
		return caseOrigin;
	}

	public void setCaseOrigin(CaseOrigin caseOrigin) {
		this.caseOrigin = caseOrigin;
	}

	public List<CaseKindOfDecision> getCaseKindOfDecision() {
		return caseKindOfDecision;
	}

	public void setCaseKindOfDecision(List<CaseKindOfDecision> caseKindOfDecision) {
		this.caseKindOfDecision = caseKindOfDecision;
	}

	public List<CaseLegalReference> getCaseLegalReference() {
		return caseLegalReference;
	}

	public void setCaseLegalReference(List<CaseLegalReference> caseLegalReference) {
		this.caseLegalReference = caseLegalReference;
	}

	public String getCaseKindOfDecisionOther() {
		return caseKindOfDecisionOther;
	}

	public void setCaseKindOfDecisionOther(String caseKindOfDecisionOther) {
		this.caseKindOfDecisionOther = caseKindOfDecisionOther;
	}

	public CaseTopic getCaseTopic() {
		return caseTopic;
	}

	public void setCaseTopic(CaseTopic caseTopic) {
		this.caseTopic = caseTopic;
	}

	public String getCaseTopicOther() {
		return caseTopicOther;
	}

	public void setCaseTopicOther(String caseTopicOther) {
		this.caseTopicOther = caseTopicOther;
	}

	public String getCaseLegalReferenceOther() {
		return caseLegalReferenceOther;
	}

	public void setCaseLegalReferenceOther(String caseLegalReferenceOther) {
		this.caseLegalReferenceOther = caseLegalReferenceOther;
	}

	public String getCaseSecurityRequirements() {
		return caseSecurityRequirements;
	}

	public void setCaseSecurityRequirements(String caseSecurityRequirements) {
		this.caseSecurityRequirements = caseSecurityRequirements;
	}

	public String getCaseDescription() {
		return caseDescription;
	}

	public void setCaseDescription(String caseDescription) {
		this.caseDescription = caseDescription;
	}

	public String getCaseDescriptionWithPersonalData() {
		return caseDescriptionWithPersonalData;
	}

	public void setCaseDescriptionWithPersonalData(String caseDescriptionWithPersonalData) {
		this.caseDescriptionWithPersonalData = caseDescriptionWithPersonalData;
	}
	
	



}
