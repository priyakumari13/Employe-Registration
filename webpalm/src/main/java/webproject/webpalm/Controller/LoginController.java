package webproject.webpalm.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import webproject.webpalm.bean.AdminBean;
import webproject.webpalm.bean.RegistDTO;
import webproject.webpalm.dao.RegistDao;
import webproject.webpalm.dao.RegistService;

@Controller
public class LoginController {
	@Autowired
	AdminBean adminBean;
	@Autowired
	LoginBean loginBean;
	
	
	@Autowired
	 RegistService rr;
	@RequestMapping(value="login",method=RequestMethod.GET)
	public ModelAndView welcomePage()
	{
		
		return new ModelAndView("login","lg",loginBean);
		
	}
	@RequestMapping(value="open" ,method=RequestMethod.GET)
	public ModelAndView openPage()
	{
		return new ModelAndView("welcompage");
	}
	@RequestMapping(value="admin" ,method=RequestMethod.GET)
	public ModelAndView openadmin()
	{
		return new ModelAndView("admin","ad",adminBean);
	}
	
	@RequestMapping(value="logdata" ,method=RequestMethod.POST)
	public ModelAndView getRegistDetails(@ModelAttribute("lg")LoginBean loginBean)
	{
		if(rr.getRegistrationDetails(loginBean))
		{
			return new ModelAndView("success");
		}
		else
		{
			return new ModelAndView("error");
		}
		
	}
	
	
	
	
	
	
}
