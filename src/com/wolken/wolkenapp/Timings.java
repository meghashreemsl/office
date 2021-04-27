package com.wolken.wolkenapp;

public class Timings {
	 public void check(float time) throws TimingsException  {
		 if(time<9) {
			 System.out.println("you are allowed ");
		 }
		 else {
			 TimingsException exception = new  TimingsException();
			 throw exception;
		 }
	 }

}
