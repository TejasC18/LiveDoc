package com.LiveDoc.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LiveDoc.dto.QueriesDTO;
import com.LiveDoc.pojo.Queries;
import com.LiveDoc.repository.QueriesRepository;

@Service
public class QueriesServiceImpl implements QueriesService
{
	@Autowired
	QueriesRepository queriesRepository;
	
	@Autowired
	SessionFactory sessionFactory;
	
	public QueriesDTO findQueryById(int ticketNumber) {
		Optional<Queries> optQuery = queriesRepository.findById(ticketNumber);
		if(optQuery.isPresent())
		{
			Queries objQuery = optQuery.get();
			QueriesDTO dtoQuery = new QueriesDTO();
			BeanUtils.copyProperties(objQuery, dtoQuery);
			return dtoQuery;
		}
		return null;
	}
	
	@Override
	public boolean addQuery (QueriesDTO query)
	{
		Queries queryEntity = new Queries();
		BeanUtils.copyProperties(query, queryEntity);
		queriesRepository.save(queryEntity);
		return true;
	}
	
	@Override
	public boolean removeQuery(int ticketNumber)
	{
		queriesRepository.deleteById(ticketNumber);
		return true;
	}
	
	public List<QueriesDTO> getaAllPendingQueries(){
		try(Session session = sessionFactory.openSession())
		{
			Query query = session.getNamedQuery("unresolvedQueries");
			List<QueriesDTO> list = query.getResultList();
			return list;
		}catch (Exception e) {
			return null;
		}
	}
}
