package pe.edu.upeu.springMVC2.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.springMVC2.dao.EscuelaDao;
import pe.edu.upeu.springMVC2.entity.Escuela;
@Repository
public class EscuelaDaoImp implements EscuelaDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Escuela> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT *FROM escuelas", 
		BeanPropertyRowMapper.newInstance(Escuela.class));
	}

}
