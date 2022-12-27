package webproject.webpalm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import webproject.webpalm.bean.RegistDTO;
import webproject.webpalm.repository.RegistInterface;

@Component
public class RegistDao {
	@Autowired
	RegistInterface registInterface;
	public boolean saveRecord(RegistDTO r)
	{
		RegistDTO rdto	= registInterface.save(r);
		if(rdto.getId()>0)
		{
			return true;
		}
		return false;
		
	}
	public List<RegistDTO> getRecords()
	{
		List<RegistDTO> l=	(List<RegistDTO>) registInterface.findAll();

	return l;
	}
	
	
	

}
