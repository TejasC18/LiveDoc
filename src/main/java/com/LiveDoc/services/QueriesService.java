package com.LiveDoc.services;

import com.LiveDoc.dto.QueriesDTO;

public interface QueriesService
{
	public QueriesDTO findQueryById(int ticketNumber);
	public boolean addQuery (QueriesDTO query);
	public boolean removeQuery(int ticketNumber);
}
