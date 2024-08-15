package com.proyecto.service.impl;

import com.proyecto.dao.PSeriesDao;
import com.proyecto.domain.PopularSeries;
import com.proyecto.service.PSeriesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class PSeriesServiceImpl implements PSeriesService{
    
    @Autowired
    private PSeriesDao pseriesDao; //

    @Override
    @Transactional(readOnly = true)
    public List<PopularSeries> getPopularSeries() {
        var lista = pseriesDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true) 
    public PopularSeries getPopularSeries(PopularSeries popularseries) {
        return pseriesDao.findById(popularseries.getIdPSerie()).orElse(null);
    }

    @Override
    @Transactional 
    public void save(PopularSeries popularseries) {
        pseriesDao.save(popularseries);
    }

    @Override
    @Transactional
    public void delete(PopularSeries popularseries) {
        pseriesDao.delete(popularseries);
    }
}
