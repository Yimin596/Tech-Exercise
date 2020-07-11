package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	public void testSetName() {
		Student s = new Student();
		s.setName("Hello");
	}
	
	@Test
	public void testGetName() {
		Student s = new Student("Name", "eee");
		assertEquals("Name", s.getName());
	}
	
	@Test
	public void testGetEmail() {
		Student s = new Student("Name", "eee");
		s.setEmail("ggg");
		assertEquals("ggg", s.getEmail());
	}
	
	@Test
	public void testGetId() {
		Student s = new Student();
		s.setId(123123);
		assertEquals(123123, s.getId());
	}
	
	@Test
	public void testGetPhoneNo() {
		Student s = new Student();
		s.setPhoneNo(123456);
		assertEquals(123456, s.getPhoneNo());
	}
}
