package com.cg.capstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.capstore.bean.CustomerBean;
import com.cg.capstore.bean.MerchantBean;
import com.cg.capstore.repo.ICustomerRepo;
import com.cg.capstore.repo.IMerchantRepo;

@Service
public class CapStoreService implements ICapStoreService{
	@Autowired
	private ICustomerRepo customerRepo;
	
	@Autowired
	private IMerchantRepo merchantRepo;

	@Override
	public List<CustomerBean> getAllCustomerDetails() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	@Override
	public List<MerchantBean> getAllMerchants() {
		// TODO Auto-generated method stub
		return merchantRepo.findAll();
	}

	@Override
	public CustomerBean getCust(String id) {
		// TODO Auto-generated method stub
		return customerRepo.getOne(id);
	}

}
