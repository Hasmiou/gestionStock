package com.stock.services;

import java.io.InputStream;

public interface IFlickrService {
	public String upload(InputStream stream, String fileName) throws Exception;
}
