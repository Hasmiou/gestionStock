package com.stock.dao;

import java.io.InputStream;

public interface IFlickrDao {
	public String upload(InputStream stream, String fileName) throws Exception;
}
