package model.database;

// E então, agora, criamos essa nova classe, referente às operações num banco de dados MySQL
// Note que essa classe não irá implementar a classe 'services.adapter.DBAdapter'
public class MySQLCommands {
    public MySQLCommands() {
        // Método construtor sem parâmetro
    }

    // Nessa classe, nós iremos criar métodos de inserção que são diferentes das classes do 'services.adapter.DBAdapter
    // É com esse conceito que iremos utilizar o Adapter da forma correta
    public String insertMySQL() {
        return "INSERT FROM MySQL";
    }

    public String updateMySQL() {
        return "UPDATE FROM MySQL";
    }

    public String deleteMySQL() {
        return "DELETE FROM MySQL";
    }
}
