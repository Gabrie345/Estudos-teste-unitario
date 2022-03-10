package br.ce.wcaquino.servicos;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;

public class LocacaoServiceTest {
	
	@Rule
	private ErrorCollector error = new ErrorCollector();
	
	@Test
	public void testAlugaFilme() {
			LocacaoService service = new LocacaoService();
			Usuario usuario = new Usuario("usuario1");
			Filme filme = new Filme("filme", 2 , 5.0);
			
			Locacao alugarFilme = service.alugarFilme(usuario, filme);
			
			Assert.assertThat(alugarFilme.getValor(), is((5.0)));
			//Assert.assertThat(alugarFilme.getValor(), is(CoreMatchers.not(6.0)));
			
			error.checkThat(alugarFilme.getValor(), is((5.0)));
			
;		}

}
