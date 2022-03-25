# iCode
Projeto desenvolvido para a disciplina de Programação Orientada a Objetos do curso de Ciência da Computação da Universidade Federal de Viçosa, desenvolvido pelos alunos:
- Mateus Aparecido - 3858
- Mariana Souza - 3898 

# Projeto 
O projeto tem como objetivo realizar a implementação da aplicação iCode que busca auxiliar os estudantes a filtrar os conteúdos para cada disciplina contida no curso de Ciência da Computação, dessa forma a aplicação tem a opção de escolher a disciplina que deseja visualizar os conteúdos, além de conter o modo administrador, onde é tem opções para cadastrar novos estudantes e administradores e novos conteúdos em cada matéria. 

# Esquema de Telas 

Abaixo é apresentado o esquema de telas que foi utilizado para realização do projeto, onde contamos com as telas de Login para um usuário comum e a tela para um administrador levando a diferentes caminhos, visto que o usuário comum poderá acessar apenas as partes que contém as disciplinas e visualiza-lás, já o modo administrador tem a opção de inserir novos usuários e administradores, podendo selecionar a opção desejada em uma checkbox, além disso poderá também cadastrar novos conteúdos dentro ads disciplinas selecionadas. 

![image](https://user-images.githubusercontent.com/55559983/160038118-c26848f7-2c4d-4fcb-92de-e49766957d28.png)

# Tabela de Dados 
Para os dados foi usado o Banco de dados SQLite onde foram divididos em duas tabelas apresentadas abixo, sendo que a primeira apresenta os dados do usuário comum que é usada para acessar a tela de login e a outra para acessar a tela no modo administrador, assim foram inseridos alguns usuários na tebela onde se for identificado que os dados inseridos na tela inicial estão na **tbl_aluno** já se for identicado que os dados inseridos forem compatíveis com a **tbl_admin** será direcionado para o modo admin da aplicação.


# Execução 
Para realizar a execução é necessário baixar o arquivo para utilizar o bando de dados SQLite, além de inserir o aquivo abaixo na Libraries localizado na pasta **executation** e também pode ser baixado no link abaixo:

- https://drive.google.com/file/d/1SxlQtOaU6-MPPIYv90Rsw7W1cMrY7KSm/view?usp=sharing 



# Ferramentas 
- Linguagem: Java
- IDE: Apache NetBeans
- Interface: Jframe
- Banco de dados: SQLite
