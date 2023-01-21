package com.cetpa.services;

import com.cetpa.models.EmployeeOutIn;

public interface EmployeeOutInService 
{

	boolean saveOutTime(EmployeeOutIn outtime);

	boolean updateIntime(int eid);
}
