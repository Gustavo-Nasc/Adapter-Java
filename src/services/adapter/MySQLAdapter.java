package services.adapter;

import model.database.MySQLCommands;

// Criamos agora a classe 'services.adapter.MySQLAdapter'
// Essa classe irá implementar a classe services.adapter.DBAdapter
public class MySQLAdapter implements DBAdapter {
    private final MySQLCommands mySQLCommands;

    // Método construtor que recebe como parâmetro um 'MySQLCommands' para realizar a adaptação
    public MySQLAdapter(MySQLCommands mySQLCommands) {
        this.mySQLCommands = mySQLCommands;
    }

    // E então, para cada método da classe DbAdapter, nós passamos a classe de Comando do Banco de Dados MySQL
    @Override
    public String insert() {
        // Mensagem para mostrar como passaria
        return "Convertendo: INSERT FROM MySQL\n" + this.mySQLCommands.insertMySQL();
    }

    @Override
    public String update() {
        return "Convertendo: UPDATE FROM MySQL\n" + this.mySQLCommands.updateMySQL();
    }

    @Override
    public String delete() {
        return "Convertendo: DELETE FROM MySQL\n" + this.mySQLCommands.deleteMySQL();
    }
}
