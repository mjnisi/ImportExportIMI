package eu.europa.edpb.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("assumedCSAOnetomany")
public class AssumedCSAOnetomany {

//	<csaKnownUnknown id="101916" referenceList="XKnownValueList"/>
//	<csaName id="107028" referenceList="GdprDpaListValueList"/>
//	<csaMotivation id="106860" referenceList="GdprCsaArtMotivationValueList"/>
//	<csaAdditionalCom locale="en">test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data test data </csaAdditionalCom>

	private CsaKnownUnknown csaKnownUnknown;
	private CsaName csaName;
	private CsaMotivation csaMotivation;
	private String csaAdditionalCom;
	

	public CsaKnownUnknown getCsaKnownUnknown() {
		return csaKnownUnknown;
	}
	public void setCsaKnownUnknown(CsaKnownUnknown csaKnownUnknown) {
		this.csaKnownUnknown = csaKnownUnknown;
	}
	public CsaName getCsaName() {
		return csaName;
	}
	public void setCsaName(CsaName csaName) {
		this.csaName = csaName;
	}
	public CsaMotivation getCsaMotivation() {
		return csaMotivation;
	}
	public void setCsaMotivation(CsaMotivation csaMotivation) {
		this.csaMotivation = csaMotivation;
	}
	public String getCsaAdditionalCom() {
		return csaAdditionalCom;
	}
	public void setCsaAdditionalCom(String csaAdditionalCom) {
		this.csaAdditionalCom = csaAdditionalCom;
	}

}
