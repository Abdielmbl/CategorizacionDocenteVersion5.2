package pe.edu.upeu.sprintemplate.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.sprintemplate.dao.TipoAtributoDao;
import pe.edu.upeu.sprintemplate.service.TipoAtributoService;

public class TipoAtributoServiceImp implements TipoAtributoService {

	@Autowired
	private TipoAtributoDao tipoatributoDao;
	
	
	
	@Override
	public List<Map<String, Object>> readAll_tipodedicacion() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_tipodedicacion();
	}

	@Override
	public List<Map<String, Object>> readAll_tipoidioma() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_tipoidioma();
	}

	@Override
	public List<Map<String, Object>> readAll_nivelidioma() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_nivelidioma();
	}

	@Override
	public List<Map<String, Object>> readAll_dominioidioma() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_dominioidioma();          
	}

	@Override
	public List<Map<String, Object>> readAll_tipocurso() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_tipocurso();
	}

	@Override
	public List<Map<String, Object>> readAll_modalidadeducativa() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_modalidadeducativa();   
	}

}
