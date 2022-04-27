package eu.europa.edpb.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("list")
public class ReferenceValue2List {
	
	@XStreamAsAttribute
	private String id;
	@XStreamAsAttribute
	private String name;
	
    private ValueList valueList;

	public ValueList getValueList() {
		return valueList;
	}

	public void setValueList(ValueList valueList) {
		this.valueList = valueList;
		
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
