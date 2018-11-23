package com.cg.mobshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.mobshop.dto.Mobiles;

@Repository("dao")
public class MobileDaoImpl implements MobileDao{

	
	@PersistenceContext
	EntityManager entitymanager;
	
	
	public EntityManager getEntitymanager() {
		return entitymanager;
	}


	public void setEntitymanager(EntityManager entitymanager) {
		this.entitymanager = entitymanager;
	}


	@Override
	public List<Mobiles> getAllMobiles(){
		System.out.println("In dao Class");
		String str = "select mobile from Mobiles mobile";
		TypedQuery<Mobiles> query = entitymanager.createQuery(str,Mobiles.class);
		return query.getResultList();
		
	}


	@Override
	public Mobiles getMobileDetails(int mobid) {
		// TODO Auto-generated method stub
		Mobiles mobile = entitymanager.find(Mobiles.class, mobid);
		return mobile;
	}


	@Override
	public int updateMobiles(Mobiles mobile) {
		// TODO Auto-generated method stub
		entitymanager.merge(mobile);
		return mobile.getMobileId();
	}


	@Override
	public List<Mobiles> delete(int mobid) {
		// TODO Auto-generated method stub
		Mobiles mobile = getMobileDetails(mobid);
		entitymanager.remove(mobile);
		return getAllMobiles();
	}
}
