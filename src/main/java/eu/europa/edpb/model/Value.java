package eu.europa.edpb.model;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("value")
public class Value {

	@XStreamAsAttribute
	private String id;
	
	@XStreamImplicit(itemFieldName = "text")
	private List<String> text;
	

	public String getId() {
		return id;
	}

	public List<String> getText() {
		return text;
	}

	public void setText(List<String> text) {
		this.text = text;
	}

	public void setId(String id) {
		this.id = id;
	}}
