package eu.europa.edpb.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("referenceValueList")
public class ReferenceValueList {

	
    @XStreamImplicit
    private final List<ReferenceValue2List> list = new ArrayList<>();

	public List<ReferenceValue2List> getList() {
		return list;
	}
	
	public Map<String, Map<String, String>> createRefList() {
		
		Map<String, Map<String, String>> referenceLists = new HashMap<>();
		
		for (ReferenceValue2List ref : list) {
			
			Map<String, String> rList = new HashMap<>();
			
			for (Value val : ref.getValueList().getValue()) {
				rList.put(val.getId(), val.getText().get(0));				
			}						
			referenceLists.put(ref.getName(), rList);

		}
		return referenceLists;
		
	}

}
