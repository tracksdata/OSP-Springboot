package com.cts.product.entity;

import java.io.Serializable;

public class ItemLine {

	private Item item;
	private int qty;
	
	public ItemLine() {
	}

	public ItemLine(Item item, int qty) {
		super();
		this.item = item;
		this.qty = qty;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
