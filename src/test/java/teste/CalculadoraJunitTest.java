package teste;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.calculadora.Calculadora;

public class CalculadoraJunitTest {
    // Variável para calculadora
    Calculadora conta = new Calculadora();
   
    //Testes de Soma
    
    @Test
    public void SomaDoisPositivos(){
        conta.soma(3, 7);
    }
    @Test
    public void SomaValoresUmZero(){
        conta.soma(3, 0);
    }
    @Test
    public void SomaValoresAmbosZero(){
        conta.soma(0, 0);
    }
     @Test
    public void SomaValoresumUmNegativo(){
        conta.soma(-3, 7);
    }
    @Test
    public void SomaValoresDoisNegativo(){
        conta.soma(-3, -7);
    }
    @Test
    public void SomaValoresUmNegativoUmZero(){
        conta.soma(-3, 0);
    }
      @Test
    public void SomaValoresumPositivoUmZero(){
        conta.soma(-3, 7);
    }
    @Test
    public void SomaValoresUmZeroUmNegativo(){
        conta.soma(0,-7);
    }
    @Test
    public void SomaValoresUmZeroUmPositivo(){
        conta.soma(0,3);
    }
    
    //Testes de Subtração
    @Test
    public void SubtracaoDoisPositivos(){
        conta.subitracao(3, 7);
    }
    @Test
    public void SubtracaoValoresUmZero(){
        conta.subitracao(3, 0);
    }
    @Test
    public void SubtracaoValoresAmbosZero(){
        conta.subitracao(0, 0);
    }
     @Test
    public void SubtracaoValoresumUmNegativo(){
        conta.subitracao(-3, 7);
    }
    @Test
    public void SubtracaoValoresDoisNegativo(){
        conta.subitracao(-3, -7);
    }
    @Test
    public void SubtracaoValoresUmNegativoUmZero(){
        conta.subitracao(-3, 0);
    }
      @Test
    public void SubtracaoValoresUmNegativoUmPositivo(){
        conta.subitracao(-3, 7);
    }
    @Test
    public void SubtracaoValoresUmZeroUmNegativo(){
        conta.subitracao(0,-7);
    }
    @Test
    public void SubtracaoValoresUmZeroUmPositivo(){
        conta.subitracao(0,3);
    }
    
     //Testes de Multiplicação
    @Test
    public void MultiplicacaoDoisPositivos(){
        conta.Multiplicacao(3, 7);
    }
    @Test
    public void  MultiplicacaoValoresUmZero(){
        conta.Multiplicacao(3, 0);
    }
    @Test
    public void  MultiplicacaoValoresAmbosZero(){
        conta.Multiplicacao(0, 0);
    }
     @Test
    public void  MultiplicacaoValoresumUmNegativo(){
        conta.Multiplicacao(-3, 7);
    }
    @Test
    public void  MultiplicacaoValoresDoisNegativo(){
        conta.Multiplicacao(-3, -7);
    }
    @Test
    public void  MultiplicacaoValoresUmNegativoUmZero(){
        conta.Multiplicacao(-3, 0);
    }
      @Test
    public void  MultiplicacaoValoresumPositivoUmZero(){
        conta.Multiplicacao(-3, 7);
    }
    @Test
    public void  MultiplicacaoValoresUmZeroUmNegativo(){
        conta.Multiplicacao(0,-7);
    }
    @Test
    public void  MultiplicacaoValoresUmZeroUmPositivo(){
        conta.Multiplicacao(0,3);
    }
    
     //Testes de Divisão
    @Test
    public void DivisaoDoisPositivos(){
        conta.divisao(3, 7);
    }
    @Test
    public void  DivisaoValoresUmZero(){
        conta.divisao(3, 0);
    }
    @Test
    public void  DivisaoValoresUmNegativo(){
        conta.divisao(300, -7);
    }
     @Test
    public void  DivisaoValoresUmZeroUmNegativo(){
        conta.divisao(0,-3);
    }
    @Test
    public void  DivisaoValoresUmNegativoUmPositivo(){
        conta.divisao(-3, 3);
    }
    @Test
    public void  DivisaoValoresDoisNegativo(){
        conta.divisao(-7, -7);
    }
    
}
