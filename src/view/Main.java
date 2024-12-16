package view;

import dao.ProdutoDao;
import model.Produto;

public class Main {

    public static void main(String[] args) {

        ProdutoDao dao = new ProdutoDao();
        dao.adicionar(new Produto(1, "Arroz", 6));
        dao.adicionar(new Produto(2, "Feijão", 9));
        dao.adicionar(new Produto(2, "Feijão2", 9));
        dao.adicionar(new Produto(3, "Carne", 40));

        dao.update(new Produto(2, "Feijão", 9.5));
        dao.remover(new Produto(3, "Carne", 40));

        System.out.println(dao.getProdutos());


    }

}
