package com.qdu.echarts.beans;
/**
 * 
 * 	��ϵ���ݰ���source����ʼ�ڵ㣬target�������ڵ㣬value����ϵ���ơ�ͨ���ڵ�name�������ӡ�
 *
 */
public class RelsBangFuRen extends Rels{

	
	private String bangfukaishishijian;
	
	public String getBangfukaishishijian() {
		return bangfukaishishijian;
	}
	public void setBangfukaishishijian(String bangfukaishishijian) {
		this.bangfukaishishijian = bangfukaishishijian;
	}
	
	public RelsBangFuRen(Long source, Long target, String value, String bangfukaishishijian) {
		super(source, target, value);
		this.bangfukaishishijian = bangfukaishishijian;
	}
	public RelsBangFuRen() {
		super();
		
	}
	
	
	
}
