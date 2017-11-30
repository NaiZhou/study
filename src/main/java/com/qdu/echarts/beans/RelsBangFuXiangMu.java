package com.qdu.echarts.beans;
/**
 * 
 * 	关系数据包括source：起始节点，target：结束节点，value：关系名称。通过节点name属性连接。
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
