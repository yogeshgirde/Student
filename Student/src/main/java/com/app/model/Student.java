package com.app.model;

import java.util.List;

public class Student {
 private int stdId;
 private String stdName;
 private double sfee;
 private String scourse;
 private String saddr;
 private String sgen;
 private List<String> slang;
public Student() {
	super();
}
public int getStdId() {
	return stdId;
}
public void setStdId(int stdId) {
	this.stdId = stdId;
}
public String getStdName() {
	return stdName;
}
public void setStdName(String stdName) {
	this.stdName = stdName;
}
public double getSfee() {
	return sfee;
}
public void setSfee(double sfee) {
	this.sfee = sfee;
}
public String getScourse() {
	return scourse;
}
public void setScourse(String scourse) {
	this.scourse = scourse;
}
public String getSaddr() {
	return saddr;
}
public void setSaddr(String saddr) {
	this.saddr = saddr;
}
public String getSgen() {
	return sgen;
}
public void setSgen(String sgen) {
	this.sgen = sgen;
}
public List<String> getSlang() {
	return slang;
}
public void setSlang(List<String> slang) {
	this.slang = slang;
}
@Override
public String toString() {
	return "Student [stdId=" + stdId + ", stdName=" + stdName + ", sfee=" + sfee + ", scourse=" + scourse + ", saddr="
			+ saddr + ", sgen=" + sgen + ", slang=" + slang + "]";
}
}
