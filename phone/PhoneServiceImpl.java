package com.jse.phone;

public class PhoneServiceImpl implements PhoneService {

	private Phone[] phones;
	private CelPhone[] celphones;
	private Iphone[] iphones;
	private GalaxyNote[] galaxynotes;
	private int count;
	
	public PhoneServiceImpl() {
		iphones = new Iphone[3];
		galaxynotes = new GalaxyNote[3];
		count = 0;
	}




	@Override
	public void add(Iphone iphone) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void add(GalaxyNote galaxyNote) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Iphone[] iphoneList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GalaxyNote[] galaxynoteList() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Iphone detail(Iphone iphone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GalaxyNote detail(GalaxyNote galaxyNote) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void update(Iphone iphone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GalaxyNote galaxynote) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Iphone iphone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(GalaxyNote galaxynote) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void add(Phone phone) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void add(CelPhone celphone) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public Phone[] phoneList() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public CelPhone[] celphoneList() {
		// TODO Auto-generated method stub
		return null;
	}

}
