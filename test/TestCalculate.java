import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import  org.junit.Test;
import org.junit.After;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



//静态导入
import static org.junit.Assert.*;

public class TestCalculate {
 
	private Calculate cal = new Calculate();
	
	public TestCalculate() {
		
		//System.out.println("TestCaculate 初始化");
	}
	
	@BeforeClass  //这里必须是static ，因为是在初始化之前执行的
	public static void before(){
		//System.out.println("测试之前");
	}
	
	@Before   //执行任何方法之前都会执行setUp
	public void setUp(){
		//System.out.println("一个测试开始");
		
	}
	
	@Test   //@Test表示是一个单元测试
	public void testAdd(){
		/*
		 * 通过断言来判断
		 * Junit4 中提供了Assert 类，有大量的断言方法
		 * 上面将它静态引入，可以直接使用Assert中的静态方法
		 * AssertEquals,AssertNull,AssertTrue
		 * */
		assertEquals(12,cal.add(4,8));
		
	}
	
	@Test
	public void testDivide(){
		assertTrue(cal.divide(1, 2)==0);
	}
	
	@Test
	public void testMulti(){
		assertEquals(cal.multi(1, 2),2);
	}
	
	@Test(timeout=1000)
	public void tetsSquart(){
		cal.squart();
	}
	
	@After
	public void after(){
		//System.out.println("一个测试结束");
	}
	
}



