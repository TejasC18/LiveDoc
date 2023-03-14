package com.LiveDoc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback
{
	@Id
	@Column(name = "patientid")
	int patientId;
	
	@Column(name = "points")
	int points;
	
	@Column(name = "doc_nature")
	String doc_Nature;
	
	@Column(name = "location")
	String location;
	
	@Column(name = "patientcomment")
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
