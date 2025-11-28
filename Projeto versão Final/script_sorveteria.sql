DROP DATABASE IF EXISTS sorveteria;
CREATE DATABASE sorveteria;
USE sorveteria;

CREATE TABLE cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20),
    email VARCHAR(100),
    data_cadastro DATE DEFAULT (CURDATE())
);

CREATE TABLE sabor_sorvete (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    categoria VARCHAR(50)
);

CREATE TABLE pedido (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT NOT NULL,
    id_sabor INT NOT NULL,
    quantidade INT NOT NULL,
    data_pedido DATETIME DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(30) DEFAULT 'PENDENTE',
    FOREIGN KEY (id_cliente) REFERENCES cliente(id),
    FOREIGN KEY (id_sabor) REFERENCES sabor_sorvete(id)
);
