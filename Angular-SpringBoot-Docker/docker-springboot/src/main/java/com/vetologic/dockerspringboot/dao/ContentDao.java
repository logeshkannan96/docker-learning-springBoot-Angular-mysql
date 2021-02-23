package com.vetologic.dockerspringboot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vetologic.dockerspringboot.bean.ContentBean;

@Repository
public interface ContentDao extends CrudRepository<ContentBean, Integer> {
	
}
