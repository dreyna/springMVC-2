package pe.edu.upeu.springMVC2.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.springMVC2.dao.EscuelaDao;
import pe.edu.upeu.springMVC2.entity.Escuela;
import pe.edu.upeu.springMVC2.service.EscuelaService;
@Service
public class EscuelaServiceImp implements EscuelaService{
	
	@Autowired
	private EscuelaDao escuelaDao;
	@Override
	public List<Escuela> readAll() {
		// TODO Auto-generated method stub
		return escuelaDao.readAll();
	}
;


	

}
