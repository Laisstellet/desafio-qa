package blu.desafio.tests;

import org.junit.Assert;
import org.junit.Test;

import blu.desafio.core.Utils;
import blu.desafio.pages.ListaImportacoesPage;

public class ListaImportacoesTest extends BaseTest {
	ListaImportacoesPage listaPage = new ListaImportacoesPage();
	
	
	@Test
	public void validaTotalBrutoImportacoesTitulo(){
		Assert.assertEquals("190,00", listaPage.retornaTotalTitulo());
	}
	
	@Test
	public void validaTotalBrutoImportacoesSubTitulo(){
		Assert.assertEquals("R$190,00", listaPage.retornaTotalImportacao());
	}
	
	@Test
	public void validaDescricaoColunaComprador(){
		Assert.assertEquals("Comprador", listaPage.retornaTextoColunaComprador());
	}

	@Test
	public void validaDescricaoColunaDescricao(){
		Assert.assertEquals("Descri��o", listaPage.retornaTextoColunaDescricao());
	}
	
	@Test
	public void validaDescricaoColunaPreco(){
		Assert.assertEquals("Pre�o", listaPage.retornaTextoColunaPreco());
	}
	
	
	@Test
	public void validaDescricaoColunaEndereco(){
		Assert.assertEquals("Endere�o vendedor", listaPage.retornaTextoColunaEndereco());
	}
	
	@Test
	public void validaDescricaoColunaNomeVendedor(){
		Assert.assertEquals("Nome vendedor", listaPage.retornaTextoColunaNomeVendedor());
	}
	
	@Test
	public void validaDescricaoColunaQtd(){
		Assert.assertEquals("Qtde.", listaPage.retornaTextoColunaQtd());
	}
	
	@Test
	public void validaDescricaoColunaTotal(){
		Assert.assertEquals("Total", listaPage.retornaTextoColunaTotal());
	}
	
	@Test
	public void validaValotTotalJoao(){
		Assert.assertEquals(listaPage.retonaValorTotal("Jo�o Silva"), Utils.removerFormatacao(listaPage.retonaValorColunaTotal("Jo�o Silva")));
	}
}
