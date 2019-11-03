package com.stock.services.impl;

import java.io.InputStream;

import com.stock.dao.IFlickrDao;
import com.stock.dao.impl.FlickrDaoImpl;
import com.stock.services.IFlickrService;

public class FlickrServiceImpl extends FlickrDaoImpl implements IFlickrService {
	
	private IFlickrDao dao;
	
	public FlickrServiceImpl(FlickrDaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public String upload(InputStream stream, String fileName) throws Exception {
		return dao.upload(stream, fileName);
	}

}
