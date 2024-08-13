package com.example.Service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entities.Announcement;


@Service
public interface AnnoucementService {
	
	public String getText();
	public void Add(Announcement annoucement);
	public void updateAnno(Announcement annoucement, int id);
	void delete(int id);
	
}