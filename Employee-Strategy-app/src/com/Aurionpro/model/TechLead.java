package com.Aurionpro.model;

public class TechLead implements IRole {

	@Override
	public String description() {
		return "TechLead";
	}

	@Override
	public String responsibility() {
		return "assign work";
	}

	@Override
	public String toString() {
		return "TechLead";
	}

}
