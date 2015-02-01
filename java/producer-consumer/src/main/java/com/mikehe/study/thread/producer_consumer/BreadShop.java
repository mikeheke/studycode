package com.mikehe.study.thread.producer_consumer;

import java.util.LinkedList;

import org.apache.log4j.Logger;

public class BreadShop {
	
	private static Logger log = Logger.getLogger(BreadShop.class);
	
	private String name;
	
	/**
	 * contain bread
	 */
	private LinkedList<Bread> breadBasket = new LinkedList<Bread>();
	
	public static final int MAX_NUM = 100;

	public BreadShop() {
		super();
	}

	public BreadShop(String name) {
		super();
		this.name = name;
	}

	public synchronized void produce(int produceNum) {
		
		log.info("enter produce..........");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		while (breadBasket.size()+produceNum > MAX_NUM) {
			try {
				log.info("面包篮子最大存量："+MAX_NUM+"; "+
						 "当前存量："+breadBasket.size()+"; "+
						 Thread.currentThread().getName()+"要生产的数量:"+ produceNum+"; "+
						 "总数超过最大存量，暂时不能生产! 等待中...");
				//
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

		
		//
		for (int i=0; i<produceNum; i++) {
			this.breadBasket.add(new Bread());
		}
		
		log.info("面包篮子最大存量："+MAX_NUM+"; "+
				 Thread.currentThread().getName()+"生产了:"+ produceNum+"个; "+
				 "当前存量："+breadBasket.size()+"; ");
		
		//
		this.notify();
	}
	
	public synchronized void consume(int consumeNum) {
		
		log.info("enter consume..........");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		while (consumeNum > breadBasket.size()) {
			try {
				log.info("面包篮子最大存量："+MAX_NUM+"; "+
						   "当前存量："+breadBasket.size()+"; "+
						   Thread.currentThread().getName()+"要消费的数量:"+ consumeNum+"; "+
						   "消费数超过当前存量，暂时不能消费! 等待中...");
				
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for (int i=0; i<consumeNum; i++) {
			breadBasket.remove();
		}
		
		log.info("面包篮子最大存量："+MAX_NUM+"; "+
				Thread.currentThread().getName()+"消费了:"+ consumeNum+"个; "+
				   "当前存量："+breadBasket.size()+"; ");
		//
		this.notify();
	}
	
}
