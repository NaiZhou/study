package com.qdu.echarts.beans;
/**
 * 
 * 	��ϵ���ݰ���source����ʼ�ڵ㣬target�������ڵ㣬value����ϵ���ơ�ͨ���ڵ�name�������ӡ�
 *
 */
public class Rels {

	private Long source;
	private Long target;
	private String value;
	public Long getSource() {
		return source;
	}
	public void setSource(Long source) {
		this.source = source;
	}
	public Long getTarget() {
		return target;
	}
	public void setTarget(Long target) {
		this.target = target;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Rels(Long source, Long target, String value) {
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
