package com.oocl.burgoka.hw2;

public class NetworkManager {

	public HttpConnection connection;
	
	public HttpConnection getUrlConnection() {
		return connection;
	}
	
	public void setUrlConnection(HttpConnection connection) {
		this.connection = connection;
	}
	
	public void init() {
		System.out.println("Init method!");
		//this.connection.Initialization();
	}

	public void destroy() {
		System.out.println("Destroy...");
		//this.connection.Destroy();
	}
}