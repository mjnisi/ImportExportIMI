package eu.europa.edpb.model;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("valueList")
public class ValueList {



	@XStreamImplicit
    private final List<Value> value = new ArrayList<>();

	
	public List<Value> getValue() {
		return value;
	}
}
