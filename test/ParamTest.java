import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(value=Parameterized.class)
public class ParamTest{
	private Calculate cal =null;
	
	private int expected;
	private int v1;
	private int v2;
	
	public ParamTest(int expected,int v1,int v2){
		this.expected=expected;
		this.v1=v1;
		this.v2=v2;
	}
	
	@Parameters
	public static List<Integer[]> getParam(){
		
		List<Integer[]>  list = new ArrayList<Integer[]>();
		list.add(new Integer[]{0,1,0});
		list.add(new Integer[]{0,0,1});
		list.add(new Integer[]{0,1,2});
		
		return list;
	}
	
	
	@Before
	public void setUp(){
		cal = new Calculate();
	}
	
	@Test
	public void TestDiv(){
		int res = cal.divide(v1, v2);
		assertEquals(res,expected);
	}
	
}
