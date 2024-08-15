package com.proyecto.dao;

import com.proyecto.domain.PopularSeries;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PSeriesDao extends JpaRepository<PopularSeries, Long> {

}
