package com.qdu.echarts.beans;
/**
 * 
 * 	��ϵ���ݰ���source����ʼ�ڵ㣬target�������ڵ㣬value����ϵ���ơ�ͨ���ڵ�name�������ӡ�
 *
 */
public class Rels {

	private String source;
	private String target;
	private String value;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Rels(String source, String target, String value) {
		super();
		this.source = source;
		this.target = target;
		this.value = value;
	}
	
	public Rels() {
		super();
		
	}
	@Override
	public String toString() {
		return "Rels [source=" + source + ", target=" + target + ", value=" + value + "]";
	}
	
	
}
