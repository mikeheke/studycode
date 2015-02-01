package com.mikehe.study.thread.producer_consumer;

public class Producer extends Thread {

	private String userName;
	
	private int produceNum;
	
	private BreadShop breadShop;

	public Producer(String userName, BreadShop breadShop) {
		super();
		this.userName = userName;
		this.breadShop = breadShop;
	}
	//=================================================================================================
	
	
	
//	public void produce(int produceNum) {
//		breadShop.produce(produceNum);
//	}
	
	
	@Override
	public void run() {
		breadShop.produce(produceNum);
	}
	

	//=================================================================================================
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getProduceNum() {
		return produceNum;
	}

	public void setProduceNum(int produceNum) {
		this.produceNum = produceNum;
	}

	public BreadShop getBreadShop() {
		return breadShop;
	}

	public void setBreadShop(BreadShop breadShop) {
		this.breadShop = breadShop;
	}

	
}
