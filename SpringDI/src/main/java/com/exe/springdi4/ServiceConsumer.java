package com.exe.springdi4;


public class ServiceConsumer {
	
	MessageService ms;
	TimeService ts;
	JobService js;
	
	public ServiceConsumer(MessageService ms) {
		this.ms = ms;
	}
	
	public void setTimeService(TimeService ts) {
		this.ts = ts;
	}
	
	public void setabc(JobService js) {
		this.js = js;
	}
	
	public void consumerService() {
		
		/* ���̷�Ʈ ��� ������ �����ÿ�
		 * GenericXmlApplicationContext context = new
		 * GenericXmlApplicationContext("app-context.xml");
		 * 
		 * MessageService ms = (MessageService)context.getBean("messageService");
		 */
		
		String message = ms.getMessage();
		System.out.println(message);
		
		String time = ts.getTimeString();
		System.out.println(time);
		
		js.getJob();
		
	}
	
}
