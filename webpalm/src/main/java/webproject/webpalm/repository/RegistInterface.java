package webproject.webpalm.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import webproject.webpalm.bean.RegistDTO;


public interface RegistInterface extends CrudRepository<RegistDTO, Integer>{
	

}
