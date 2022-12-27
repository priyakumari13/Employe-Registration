package webproject.webpalm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webproject.webpalm.Controller.LoginBean;
import webproject.webpalm.bean.RegistDTO;

@Service
public class RegistService {
	@Autowired
	RegistDTO r;
	@Autowired
	RegistDao registDao;
	public boolean getRegistrationDetails(LoginBean lb)
	{
		
		r.setEmail(lb.getEmail());
		r.setCompany(lb.getCompany());
		r.setLocation(lb.getLocation());
		r.setProject(lb.getProject());
		return registDao.saveRecord(r);
		
	}
	

}
