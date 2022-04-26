package eu.europa.edpb.model;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("edpbDemoArticle56List")
public class EdpbDemoArticle56List {

    @XStreamImplicit
    private List<EdpbDemoArticle56> edpbDemoArticle56List = new ArrayList<EdpbDemoArticle56>();



	public List<EdpbDemoArticle56> getEdpbDemoArticle56List() {
		return edpbDemoArticle56List;
	}

	public void setBankAccounts(List<EdpbDemoArticle56> edpbDemoArticle56List) {
		this.edpbDemoArticle56List = edpbDemoArticle56List;
	}
	

}
