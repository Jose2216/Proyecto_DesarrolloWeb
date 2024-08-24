package com.proyecto.service;

import com.proyecto.domain.PopularSeries;
import java.util.List;

public interface PopularSeriesService {

    List<PopularSeries> getPopularSeries(boolean activos);

    PopularSeries getPopularSerie(PopularSeries popularSeries);

    void save(PopularSeries popularSeries);

    void delete(PopularSeries popularSeries);
}
