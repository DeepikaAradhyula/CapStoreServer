package com.cg.capstore.service;

import java.util.List;



import com.cg.capstore.bean.CustomerBean;
import com.cg.capstore.bean.MerchantBean;


public interface ICapStoreService {
	public List<CustomerBean> getAllCustomerDetails();
	public List<MerchantBean> getAllMerchants();
	public CustomerBean getCust(String id);
}
