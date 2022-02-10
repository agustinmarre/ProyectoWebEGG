package com.grupo1.aplicacionweb.serviciosimpl;

import com.grupo1.aplicacionweb.entidades.Receta;
import com.grupo1.aplicacionweb.iservicios.RecetaServicio;
import com.grupo1.aplicacionweb.repositorios.RecetaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecetaServicioImpl implements RecetaServicio {
    @Autowired
    private RecetaDao recetaDao;
    @Override
    public List<Receta> listar() {
        return recetaDao.findAll();
    }

    @Override
    public void eliminar(Integer id) {
        recetaDao.deleteById(id);
    }

    @Override
    public void crear(Receta receta) {
        recetaDao.save(receta);
    }

    @Override
    public Receta findById(Integer id) {
        return recetaDao.findById(id).orElse(null);
    }
}
