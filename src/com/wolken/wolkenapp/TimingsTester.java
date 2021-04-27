package com.wolken.wolkenapp;

public class TimingsTester {
	public static void main(String[] args) throws TimingsException {
		Timings timings = new Timings();
		try {
			timings.check(10);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
