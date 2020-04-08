package com.jse.inheritance;

public class PhoneService {
	private Phone[] phones;
	private int count;
	private CelPhone[] celphones;
	private Iphone[] iphones;
	private GalaxyNote[] galaxyNotes;
	
	public PhoneService() {
		galaxyNotes = new GalaxyNote[3];
		iphones = new Iphone[3];
		phones = new Phone[3];
		celphones = new CelPhone[3];
		count = 0;
		}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public CelPhone[] getCelphones() {
		return celphones;
	}
	public void setCelphones(CelPhone[] celphones) {
		this.celphones = celphones;
	}
	public Phone[] getPhones() {
		return phones;
	}
	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}
	public void add(Phone phone) {
		phones[count] = phone;
		count++;
	}
	public void add(CelPhone celphone) {
		celphones[count] = celphone;
		count++;
	}
	public Iphone[] getIphones() {
		return iphones;
	}
	public void setIphones(Iphone[] iphones) {
		this.iphones = iphones;
	}
	public void add(Iphone iphone) {
		iphones[count] = iphone;
		count++;
	}
	public GalaxyNote[] getGalaxynote() {
		return galaxyNotes;
	}
	public void setGalaxynote(GalaxyNote[] galaxyNote) {
		this.galaxyNotes = galaxyNote;
	}
	public void add(GalaxyNote galaxyNote) {
		galaxyNotes[count] = galaxyNote;
		count++;
		
	}
	
	
}