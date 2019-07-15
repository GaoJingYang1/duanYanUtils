package com.gaojingyang.utils;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
/**
 * 
 * @ClassName: AssertUtilTest 
 * @Description: 测试断言工具类
 * @author:高旌洋   
 * @date: 2019年7月15日 上午9:11:48
 */
public class AssertUtilTest {

	@Test
	public void testIsTrue() {
		String a = "123";
		String b = "456";
		AssertUtil.isTrue(a.equals(b), "不为真");
	}
	
	@Test
	public void testIsFalse() {
		String a = "123";
		String b = "123";
		AssertUtil.isFalse(a.equals(b), "这是真的");
	}

	@Test
	public void testNotNull() {
		AssertUtil.notNull(null, "对象为空");
	}
	
	@Test
	public void testIsNull() {
		AssertUtil.isNull(null, "对象必须空");
	}
	
	@Test
	public void testNotEmpty() {
//		List list = new ArrayList<>();
//		list.add(1);
		AssertUtil.notEmpty(null, "集合为空");
	}
	
	@Test
	public void testIsNotEmpty() {
		//Map map = new HashMap();
		AssertUtil.isNotEmpty(null, "map集合或对象为空");
	}
	
	@Test
	public void testHasText() {
		AssertUtil.hasText("", "字符串没值");
	}
	
	@Test
	public void testGreaterThanZero() {
		AssertUtil.greaterThanZero(-4, "值小于或等于0");
	}
}
