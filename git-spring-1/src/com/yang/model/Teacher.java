package com.yang.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	
	@Autowired
	private Student student ;
}
