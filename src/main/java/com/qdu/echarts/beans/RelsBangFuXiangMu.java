package com.qdu.echarts.beans;
/**
 * 
 * 	��ϵ���ݰ���source����ʼ�ڵ㣬target�������ڵ㣬value����ϵ���ơ�ͨ���ڵ�name�������ӡ�
 *
 */
public class RelsBangFuXiangMu extends Rels{


	private String fuchinianfen;
	private String jiansheneirong;
	

	public String getFuchinianfen() {
		return fuchinianfen;
	}
	public void setFuchinianfen(String fuchinianfen) {
		this.fuchinianfen = fuchinianfen;
	}
	public String getJiansheneirong() {
		return jiansheneirong;
	}
	public void setJiansheneirong(String jiansheneirong) {
		this.jiansheneirong = jiansheneirong;
	}
	
	public RelsBangFuXiangMu(String fuchinianfen, String jiansheneirong) {
		super();
		this.fuchinianfen = fuchinianfen;
		this.jiansheneirong = jiansheneirong;
	}
	public RelsBangFuXiangMu() {
		super();
		
	}
	public RelsBangFuXiangMu(Long source, Long target, String value, String fuchinianfen, String jiansheneirong) {
		super(source, target, value);
		this.fuchinianfen = fuchinianfen;
		this.jiansheneirong = jiansheneirong;
	}
	
	
	
}
