package dao;

import model.Produto;

import java.util.HashSet;
import java.util.Set;

public class ProdutoDao {

    private Set<Produto> produtos;

    public ProdutoDao(){
        produtos = new HashSet<>();
    }

    public boolean adicionar(Produto produto){
        return produtos.add(produto);
    }

    public Set<Produto> getProdutos(){
        return produtos;
    }

}
