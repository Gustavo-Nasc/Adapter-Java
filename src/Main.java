import view.Client;

public class Main {
    public static void main(String[] args) {
        /*
        Antes de executar o 'Main', aqui vão algumas dicas:
        Como esse seria um ambiente voltado a manipulação de dados com Banco de Dados,
        Optei por utilizar uma espécie de 'arquitetura MVC' apenas para ilustração e resolução de um problema.

        Uma ordem boa a ser seguida é:
        1. Visualizar as explicações inicias das classes 'model.database', que são referentes a um Banco de Dados específico
        2. Visualizar as explicações dos 'services.adapter', que irão explicar a respeito do Adapter, seu funcionamento e como ele é implementado
        3. Visualizar a explicação final que está em 'view.Client', que representa e explica como todos os conceitos se encaixam e como eles se entrelaçam
        */

        Client client = new Client();
        client.execute();
    }
}