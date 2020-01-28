package com.bill;

import com.pricematrix.PriceMatrix;

public interface Billing {

	void setPrice(PriceMatrix price);

	double getTotalPrice(String[] cart);

}