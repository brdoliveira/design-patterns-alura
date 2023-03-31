package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(deveAplicar(orcamento)){
            return efutuarCalculo(orcamento);
        }

        return proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efutuarCalculo(Orcamento orcamento);
    public abstract boolean deveAplicar(Orcamento orcamento);
}
