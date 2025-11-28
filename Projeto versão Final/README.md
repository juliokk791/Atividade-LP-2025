# Projeto Sorveteria - Swing (JPanel)

Versão com interface gráfica usando Swing (JDialogs e JPanels).

## Requisitos
- Java JDK 20
- MySQL com banco `sorveteria` (ou rode o script em `script/sql/script_sorveteria.sql`)
- Driver JDBC `mysql-connector-java` adicionado às Bibliotecas do projeto no NetBeans

## Como rodar
1. Importe a pasta `src` em um novo projeto Java no NetBeans (ou crie um projeto e cole os pacotes).
2. Adicione o driver JDBC (`mysql-connector-java`) nas Bibliotecas do projeto.
3. Configure o MySQL e execute o script SQL para criar as tabelas (arquivo em `script/sql/script_sorveteria.sql`).
4. Rode a classe `ui.MainFrame` (main() está em `MainFrame`).
5. A conexão em `db.Conexao` está com usuário `root` e sem senha. Se for diferente, ajuste o campo PASS.

## Funcionalidades
- Cadastrar cliente (JDialog)
- Cadastrar sabor (JDialog)
- Registrar pedido (JDialog, combobox com clientes e sabores)
- Listar dados (JDialog com abas: clientes, sabores, pedidos)

## Observações
- Para ver as IDs de clientes e sabores (necessárias para pedidos), use 'Listar Dados' ou veja o console do banco.
