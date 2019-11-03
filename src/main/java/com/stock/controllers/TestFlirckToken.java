package com.stock.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.stock.dao.impl.FlickrDaoImpl;

public class TestFlirckToken {

	public static void main(String[] args) {
		FlickrDaoImpl flickr = new FlickrDaoImpl();
		//flickr.getToken();
		
		try {
			InputStream stream = new FileInputStream(new File("D:\\coder-icon-26.jpg"));
			String url = flickr.upload(stream, "coder");
			System.out.println("Photo added "+url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
