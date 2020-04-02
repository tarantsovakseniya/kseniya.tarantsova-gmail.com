package com.spring.springcore.properties;

import java.util.Properties;

public class Languages {
	private Properties langs;

	@Override
	public String toString() {
		return "Languages [langs=" + langs + "]";
	}

	public Properties getLangs() {
		return langs;
	}

	public void setLangs(Properties langs) {
		this.langs = langs;
	}
}
