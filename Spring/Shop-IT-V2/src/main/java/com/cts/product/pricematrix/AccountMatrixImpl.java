package com.cts.product.pricematrix;

import org.springframework.stereotype.Repository;

@Repository("AccountMatrixImpl")
public class AccountMatrixImpl implements PriceMatrix {

	public AccountMatrixImpl() {
		System.out.println("AccountMatrixImpl object created...");
	}

	@Override
	public double getItemPrice(String itemCode) {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub

	}

}
