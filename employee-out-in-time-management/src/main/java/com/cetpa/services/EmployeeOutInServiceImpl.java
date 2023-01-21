package com.cetpa.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.models.EmployeeOutIn;
import com.cetpa.repositories.EmployeeOutInRepository;
import com.cetpa.util.LocalDateTime;
@Service
public class EmployeeOutInServiceImpl implements EmployeeOutInService
{
	@Autowired
	private EmployeeOutInRepository repo;
	@Override
	public boolean saveOutTime(EmployeeOutIn outtime)
	{
		int eid=outtime.getEid();
		String date=LocalDateTime.getCurrentDate();
		int n=repo.getInTime(eid, date, "Not in yet");
		if(n>=1)
		
			return false;
		outtime.setOuttime(LocalDateTime.getCurrentTime());
		outtime.setDate(date);
		outtime.setIntime("Not in yet");
		outtime.setTotaltime("Not applicable");
		repo.save(outtime);
		return true;
	}
	public boolean updateIntime(int eid) 
	{
		String date=LocalDateTime.getCurrentDate();
		EmployeeOutIn outin=repo.getOutTime(eid,date,"Not in yet");
		if(outin==null)
		{
			return false;
		}
		String intime=LocalDateTime.getCurrentTime();
		String totaltime=LocalDateTime.getTotal(intime, outin.getOuttime());
		repo.updateInTime(intime,totaltime,eid,date);
		return true;
	}	
}
