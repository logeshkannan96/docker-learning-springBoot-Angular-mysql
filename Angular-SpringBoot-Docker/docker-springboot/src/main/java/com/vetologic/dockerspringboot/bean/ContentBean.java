package com.vetologic.dockerspringboot.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.json.GsonJsonParser;

@Entity
@Table(name="contents")
public class ContentBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="content_id")
	private int contentId;
	
	@Column(name="content")
	private String content;

	public int getContentId() {
		return contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
