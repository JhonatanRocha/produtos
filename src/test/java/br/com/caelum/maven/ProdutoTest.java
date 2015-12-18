package br.com.caelum.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {

	@Test
	public void setVariables(){
		Produto bala = new Produto("Bala 7 Belo", 15.30);
		assertEquals(15.30, bala.getPreco(), 0.0);
		assertEquals("Bala 7 Belo", bala.getName());
		
	}
}
