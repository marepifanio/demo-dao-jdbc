package model.dao;

import java.util.List;

import model.etities.Seller;

public interface SellerDao {
	
		void insert(Seller obj);

		void update(Seller obj);

		void deletById(Integer id);

		Seller finById(Integer id);

		List<Seller> findAll();
	}
