package com.LiveDoc.dto;

public class QueriesDTO
{
	int ticketNumber;
	int doctorId;
	String query;
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
