package com.vetologic.dockerspringboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vetologic.dockerspringboot.bean.ContentBean;
import com.vetologic.dockerspringboot.dao.ContentDao;

@Service
public class ContentService {

	@Autowired
	ContentDao contentDao;
	
	public Optional<ContentBean> getContent(int contentId) {
		return contentDao.findById(contentId);
	}
	
	public void createContent(ContentBean content) {
		contentDao.save(content);
	}
}
