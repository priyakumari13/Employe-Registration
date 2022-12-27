package webproject.webpalm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import webproject.webpalm.bean.RegistDTO;
import webproject.webpalm.dao.RegistDao;

@Controller
public class RegistrationController {
	
	@Autowired
	RegistDao registDao;
	@RequestMapping(value="userDetail",method=RequestMethod.GET)
	public ModelAndView viewDetails()
	{
		List<RegistDTO> list = registDao.getRecords();
		
		return new ModelAndView("viewrecord","l",list);
		
	}

}
