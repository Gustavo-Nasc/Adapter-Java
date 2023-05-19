package model.database;

import services.adapter.DBAdapter;

// Classe exclusiva para as operações de Banco de Dados Oracle
// Essa classe irá implementar a interface 'DbAdapter' criada anteriormente, com os métodos padrões de banco
public class OracleCommands implements DBAdapter {
    public OracleCommands() {
        // Método construtor sem parâmetro
    }

    // Sobrescrevemos os métodos da interface 'DbAdapter'
    @Override
    public String insert() {
        return "INSERT FROM Oracle";
    }

    @Override
    public String update() {
    	return "UPDATE FROM Oracle";
    }

    @Override
    public String delete() {
    	return "DELETE FROM Oracle";
    }
}
