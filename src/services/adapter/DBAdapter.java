package services.adapter;

// Criação da Classe 'global' que irá se adaptar conforme do Banco de Dados
public interface DBAdapter {
    // Daí, cria-se os comandos "padrão" de manipulação de dados em Banco de Dados
    public String insert();

    public String update();

    public String delete();
}
