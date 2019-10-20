-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE Usuarios (
id INT PRIMARY KEY,
tp_usuario_id INT,
nome VARCHAR(250),
email VARCHAR(250),
username VARCHAR(250),
senha VARCHAR(250),
data_criacao DATETIME
)

CREATE TABLE Medicamentos (
id INT PRIMARY KEY,
forma_farmaceutica_id INT,
status_id INT,
nome VARCHAR(250),
descricao VARCHAR(250),
quantidade INT,
valor DECIMAL(8,2),
estoque_min INT,
data_criacao DATE,
data_modificacao DATE
)

CREATE TABLE Unidades (
id INT PRIMARY KEY,
nome VARCHAR(250),
cidade VARCHAR(40)
)

CREATE TABLE Status (
id INT PRIMARY KEY,
nome VARCHAR(40)
)

CREATE TABLE Tp_usuarios (
id INT PRIMARY KEY,
nome VARCHAR(40)
)

CREATE TABLE Formas_farmaceuticas (
id INT PRIMARY KEY,
nome VARCHAR(250)
)

CREATE TABLE solicitacao (
id INT PRIMARY KEY,
medicamento_id INT,
usuario_id INT,
descricao VARCHAR(250),
data_solicitacao DATETIME,
FOREIGN KEY(medicamento_id) REFERENCES Medicamentos (id),
FOREIGN KEY(usuario_id) REFERENCES Usuarios (id)
)

CREATE TABLE unidade_medicamento (
unidade_id INT,
medicamento_id INT,
FOREIGN KEY(unidade_id) REFERENCES Unidades (id),
FOREIGN KEY(medicamento_id) REFERENCES Medicamentos (id)
)

ALTER TABLE Usuarios ADD FOREIGN KEY(tp_usuario_id) REFERENCES Tp_usuarios (id)
ALTER TABLE Medicamentos ADD FOREIGN KEY(forma_farmaceutica_id) REFERENCES Formas_farmaceuticas (id)
ALTER TABLE Medicamentos ADD FOREIGN KEY(status_id) REFERENCES Status (id)
