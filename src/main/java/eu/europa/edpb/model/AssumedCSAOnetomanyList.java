package eu.europa.edpb.model;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("assumedCSAOnetomanyList")
public class AssumedCSAOnetomanyList {

    @XStreamImplicit
    private List<AssumedCSAOnetomany> assumedCSAOnetomanyList = new ArrayList<AssumedCSAOnetomany>();

	public List<AssumedCSAOnetomany> getAssumedCSAOnetomanyList() {
		return assumedCSAOnetomanyList;
	}

	public void setAssumedCSAOnetomanyList(List<AssumedCSAOnetomany> assumedCSAOnetomanyList) {
		this.assumedCSAOnetomanyList = assumedCSAOnetomanyList;
	}


	

}
