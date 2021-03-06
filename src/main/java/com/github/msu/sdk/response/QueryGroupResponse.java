package com.github.msu.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.msu.sdk.response.model.MerchantGroup;


public class QueryGroupResponse extends ApiResponse {
	@JsonProperty(value = "groupList")
	@XmlElementWrapper(name = "groupList")
	@XmlElement(name = "groupList")
	private List<MerchantGroup> merchantGroups;

	public List<MerchantGroup> getMerchantGroups() {
		return merchantGroups;
	}

	public void setMerchantGroups(List<MerchantGroup> merchantGroups) {
		this.merchantGroups = merchantGroups;
	}
}
