package br.ufal.ic.p2.wepayu.ModuleVendas.Model;

import java.util.HashMap;

public class Vendas {
    public HashMap<String, Double> VendaDoEmpregado = new HashMap<>();

    public Vendas(String id){
    }
    public void cadastrarNovaVenda(String data, Double valor) {
        VendaDoEmpregado.put(data, valor);
    }
    public Double obterValorVenda(String data) {
        return VendaDoEmpregado.get(data);
    }
}


