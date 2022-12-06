package com.pw3.movie_theater.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pw3.movie_theater.dao.GenericDao;
import com.pw3.movie_theater.model.Movie;

@Service
public class MovieServiceImpl implements GenericService<Movie, Long>{

    @Autowired
    private GenericDao<Movie, Long> dao;

    @Transactional(readOnly = false)
    @Override
    public void save(Movie Movie) {
        dao.save(Movie);
    }

    @Transactional(readOnly = false)
    @Override
    public void update(Movie movie) {
        dao.update(movie);  
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Movie> findAll() {
        return dao.findAll();
    }

    @Override
    public Movie findById(Long id) {
        return dao.findById(id);
    }
    
}
