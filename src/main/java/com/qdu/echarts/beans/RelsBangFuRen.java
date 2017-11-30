package com.qdu.echarts.beans;
/**
 * 
 * 	关系数据包括source：起始节点，target：结束节点，value：关系名称。通过节点name属性连接。
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
