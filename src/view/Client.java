package view;

import services.adapter.MySQLAdapter;

import javax.swing.JOptionPane;

import model.database.MySQLCommands;
import model.database.OracleCommands;

public class Client {

    // Criamos o método 'main', pois ela será uma classe de execução para a classe principal (Main)
    public void execute() {
        // Para o nosso 'view.Client', nós criamos inicialmente nossa classe referente aos Comandos Oracle
        OracleCommands oracleCommands = new OracleCommands();
        JOptionPane.showMessageDialog(null,
        		"Comandos do BD Oracle:\n"
        		+ "\n" + oracleCommands.insert()
        		+ "\n" + oracleCommands.update()
        		+ "\n" + oracleCommands.delete()
        );
        // Note que a classe 'OracleCommands' não possui problemas em utilizar os comandos, pois ela já possui o 'DBAdapter' implementado

        // Agora, para exemplificar o motivo pelo qual pode-se utilizar um 'Adapter' em uma aplicação, veja o exemplo abaixo:
        MySQLCommands mySQLCommands = new MySQLCommands();
        // mySQLCommands.insert();
        // Ao descomentar a linha acima, note que não seria possível utilizar o método 'insert'
        // Conforme criado, a classe de comandos do MySQL tem seus próprios métodos com nomes difentes


        // Por esse motivo, criamos anteriormente o 'services.adapter.MySQLAdapter', que irá adaptar os comandos do MySQL para a 'linguagem' utilizada no lado Cliente
        // Inclusive, passamos como parâmetro um MySQLCommands
        MySQLAdapter mySQLAdapter = new MySQLAdapter(mySQLCommands);
        
        JOptionPane.showMessageDialog(null,
        		"Convertendo Comandos do BD MySQL:\n"
        		+ "\n" + mySQLAdapter.insert() + "\n\n"
        		+ "\n" + mySQLAdapter.update() + "\n\n"
        		+ "\n" + mySQLAdapter.delete() + "\n\n"
        );
        
        /*
        Assim, o services.adapter.MySQLAdapter pega os métodos do MySQLCommands e realiza a conversão dos métodos para uma 'abordagem' melhor no lado Cliente

        Com tudo isso, podemos agora trabalhar com classes que não poderíamos trabalhar antes por intermédio do Adapter
        Posteriormente, é possível criar apenas um services.adapter.DBAdapter que implemente uma interface
        E toda vez que desejarmos que esse Adapter faça novos formatos de conexão, implementamos a classe Adapter as Classe de Banco de Dados
        */
    }
}
