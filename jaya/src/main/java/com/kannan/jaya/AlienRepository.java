package com.kannan.jaya;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
	
	List<Alien>  aliens;
	
	public AlienRepository()
	{
		aliens=new ArrayList<>();
		
		 Alien a1= new Alien();
		 a1.setName("Naga");
		 a1.setId(122);
		 
		 
		 Alien a2= new Alien();
		 a2.setName("Nivin");
		 a2.setId(187);
		 
		 Alien a3= new Alien();
		 a3.setName("praveena");
		 a3.setId(100);
		 
		 aliens.add(a1);
		 aliens.add(a2);
		 aliens.add(a3);
			
	}
	
	
	public List<Alien> getAliens()
	{
		return aliens;
	}

	
	
	public 	Alien getAlien(int id)
	{
		for(Alien a:aliens)
		{
			if(a.getId()==id)
			{
				return a;
			}
			
		}
		return null;
	}


	public void create(Alien a1) {
		// TODO Auto-generated method stub
		aliens.add(a1);
	}
}

		
	
	

