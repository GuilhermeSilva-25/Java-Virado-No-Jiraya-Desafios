package br.com.nerdstore.domain;

public class StoreConfig {
    public static String[] allowedCategories;

    static {
        allowedCategories = new String[3];

        allowedCategories[0] = "RPG";
        allowedCategories[1] = "Ação";
        allowedCategories[2] = "Aventura";

        System.out.println("Log: Categorias globais da loja foram carregadas no Metaspace.");
    }

    {
        System.out.println("Log: Novo objeto StoreConfig foi instanciado.");
    }
}
