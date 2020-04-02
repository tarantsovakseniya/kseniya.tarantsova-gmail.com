package com.spring.springcore.propertiesplaceholder.assignment;

public class Client {
	private String url;
	private String userName;
	private String password;

	public Client(String url, String userName, String password) {
		super();
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Client [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}
}