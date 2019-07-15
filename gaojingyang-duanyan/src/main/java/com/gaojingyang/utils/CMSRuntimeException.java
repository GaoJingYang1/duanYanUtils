package com.gaojingyang.utils;
/**
 * 
 * @ClassName: CMSRuntimeException 
 * @Description: 2.自定义运行时异常类
 * @author:高旌洋   
 * @date: 2019年7月15日 上午8:45:08
 */
public class CMSRuntimeException extends RuntimeException {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	public CMSRuntimeException() {
		super();
	}
	
	public CMSRuntimeException(String message) {
		super(message);
	}
}
