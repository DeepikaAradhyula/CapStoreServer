package com.cg.capstore.controller;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.capstore.bean.CustomerBean;
import com.cg.capstore.bean.MerchantBean;
import com.cg.capstore.service.ICapStoreService;


@RestController
public class CapStoreController {
	@Autowired
	private ICapStoreService service;
	@RequestMapping(value="/custdet")
public CustomerBean getMessage(String id){
		
		return service.getCust(id);
	}
	
	@RequestMapping(value="/viewallcust",method=RequestMethod.GET)
	public List<CustomerBean> viewAllCustomerDetails(){
		//int i=0;
		List<CustomerBean> l=service.getAllCustomerDetails();
		/*for(i=0;i<l.size();i++) {
			System.out.println(i.get);
		}*/
		return l;
	}
	
	@RequestMapping(value="/viewallmer",method=RequestMethod.GET)
	public List<MerchantBean> viewAllMerchant(){
		return service.getAllMerchants();
	}
}
