package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;



public class TestAssert {
	
	@Test
	public void test(){
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		
		Assert.assertEquals(0, 0);
		Assert.assertEquals(1, 0);
		//Se comporta de forma diferente com double e float.
		
		Assert.assertEquals(0.1555555, 0.155555, 0.01);
		Assert.assertEquals(Math.PI, 3.14, 001);	
		//Esse 3 paramentro avisa o teste ate onde deve ir a comparação.
		
		Assert.assertSame(getClass(), getClass());
		//considera se o objeto for o mesmo 
		
		Assert.assertNull(getClass());
		Assert.assertNotNull(getClass());
		
		
		
	}
}
