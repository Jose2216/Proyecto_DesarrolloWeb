package com.proyecto.service;

import com.proyecto.domain.PopularSeries;
import java.util.List;

public interface PSeriesService {

    public List<PopularSeries> getPopularSeries();

    public PopularSeries getPopularSeries(PopularSeries popularseries);

    public void save(PopularSeries popularseries);

    public void delete(PopularSeries popularseries);
}
