package com.mikehe.study.thread.producer_consumer;

public class Consumer extends Thread {

	private String userName;
	
	private int consumeNum;
	
	private BreadShop breadShop;
	
	
	public Consumer(String userName, BreadShop breadShop) {
		super();
		this.userName = userName;
		this.breadShop = breadShop;
	}
	//=================================================================================================
	
	
//	public void consume(int consumeNum) {
//		breadShop.consume(consumeNum);
//	}
	
	@Override
	public void run() {
		breadShop.consume(consumeNum);
	}
	
	
	
	//=================================================================================================
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getConsumeNum() {
		return consumeNum;
	}

	public void setConsumeNum(int consumeNum) {
		this.consumeNum = consumeNum;
	}

	public BreadShop getBreadShop() {
		return breadShop;
	}

	public void setBreadShop(BreadShop breadShop) {
		this.breadShop = breadShop;
	}
	
	
	
}
