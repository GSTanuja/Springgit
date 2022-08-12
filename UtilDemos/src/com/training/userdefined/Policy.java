package com.training.userdefined;

public class Policy {
private String policyName;
private String policyType;
private String companyName;
public Policy(String policyName, String policyType, String companyName) {
	super();
	this.policyName = policyName;
	this.policyType = policyType;
	this.companyName = companyName;
	
}
public String getPolicyName() {
	return policyName;
}
public void setPolicyName(String policyName) {
	this.policyName = policyName;
}
public String getPolicyType() {
	return policyType;
}
public void setPolicyType(String policyType) {
	this.policyType = policyType;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
	
}
@Override
public String toString() {
	return "Policy [policyName=" + policyName + ", policyType=" + policyType + ", companyName=" + companyName + "]";
}
}
