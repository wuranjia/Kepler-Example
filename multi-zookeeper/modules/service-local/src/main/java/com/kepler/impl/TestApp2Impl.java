package com.kepler.impl;

import com.kepler.TestApp2;
import com.kepler.annotation.Autowired;

@Autowired
public class TestApp2Impl implements TestApp2 {

	public String test(String kepler) throws Exception {
		return "Hello world 2 " + kepler + " on local zk";
	}
}
