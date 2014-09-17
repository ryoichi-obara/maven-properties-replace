package com.ryoichi0102.ambitious.maven.replace_properties;

import java.util.ResourceBundle;

import org.junit.Test;


public class SampleReader {

	private static final ResourceBundle bundle = ResourceBundle.getBundle("sample");

	@Test
	public void test_TC101() {
		System.out.println(bundle.getString("path"));
	}

}
