package com.cg.capstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.capstore.bean.MerchantBean;
@Repository
public interface IMerchantRepo extends JpaRepository<MerchantBean, String> {

	
}
