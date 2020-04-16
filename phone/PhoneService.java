package com.jse.phone;

public interface PhoneService {
	
	
	public void add(GalaxyNote galaxyNote);
	public void add(Iphone iphone);
	public void add(Phone phone);
	public void add(CelPhone celphone);
	
	
	public GalaxyNote[] galaxynoteList();
	public Iphone[] iphoneList();
	public Phone[] phoneList();
	public CelPhone[] celphoneList();
	
	public GalaxyNote detail (GalaxyNote galaxyNote);
	public Iphone detail (Iphone iphone);
	
	public int count();
	
	public void update (GalaxyNote galaxynote);
	public void update (Iphone iphone);
	
	
	public void delete (GalaxyNote galaxynote);
	public void delete (Iphone iphone);
	
	
	}
	
	
