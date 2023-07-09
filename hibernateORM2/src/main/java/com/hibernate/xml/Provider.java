package com.hibernate.xml;

public class Provider {

	private int providerId;
	private String providerName;
	private String providerType;
	public int getProviderId() {
		return providerId;
	}
	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public String getProviderType() {
		return providerType;
	}
	public void setProviderType(String providerType) {
		this.providerType = providerType;
	}
	public Provider(int providerId, String providerName, String providerType) {
		super();
		this.providerId = providerId;
		this.providerName = providerName;
		this.providerType = providerType;
	}
	public Provider() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Provider [providerId=" + providerId + ", providerName=" + providerName + ", providerType="
				+ providerType + "]";
	}
	
	
}
