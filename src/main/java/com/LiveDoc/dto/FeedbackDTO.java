package com.LiveDoc.dto;

public class FeedbackDTO
{
	int patientId;
	int points;
	String doc_Nature;
	String location;
	String patientComment;
	public int getPatientId()
	{
		return patientId;
	}
	public void setPatientId(int patientId)
	{
		this.patientId = patientId;
	}
	public int getPoints()
	{
		return points;
	}
	public void setPoints(int points)
	{
		this.points = points;
	}
	public String getDoc_Nature()
	{
		return doc_Nature;
	}
	public void setDoc_Nature(String doc_Nature)
	{
		this.doc_Nature = doc_Nature;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public String getPatientComment()
	{
		return patientComment;
	}
	public void setPatientComment(String patientComment)
	{
		this.patientComment = patientComment;
	}
	
	
}
