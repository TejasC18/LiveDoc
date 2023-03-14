package com.LiveDoc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "queries")
@NamedQueries({@NamedQuery(name = "unresolvedQueries",query = "select objQuery from Queries objQuery where status='pending'")})
public class Queries
{
	@Id
	@GeneratedValue(generator = "increment")
	@Column(name = "ticketnumber")
	int ticketNumber;
	
	@Column(name = "doctorid")
	int doctorId;
	
	@Column(name = "query")
	String query;
	
	@Column(name = "status")
	String status;
	public int getTicketNumber()
	{
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber)
	{
		this.ticketNumber = ticketNumber;
	}
	public int getDoctorId()
	{
		return doctorId;
	}
	public void setDoctorId(int doctorId)
	{
		this.doctorId = doctorId;
	}
	public String getQuery()
	{
		return query;
	}
	public void setQuery(String query)
	{
		this.query = query;
	}
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	
}
