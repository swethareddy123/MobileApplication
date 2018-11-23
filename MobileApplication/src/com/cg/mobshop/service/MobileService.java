package com.cg.mobshop.service;

import java.util.List;

import com.cg.mobshop.dto.Mobiles;

public interface MobileService {

	public List<Mobiles> getAllMobiles();
	public Mobiles getMobileDetails(int mobid);
	public int updateMobiles(Mobiles mobile);
	public List<Mobiles> deleteMobile(int mobid);

}
