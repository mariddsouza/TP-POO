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

![image](https://user-images.githubusercontent.com/55559983/160042272-a00202fc-aede-47a4-9198-cc3782554827.png)

![image](https://user-images.githubusercontent.com/55559983/160042295-8fa57193-4ee7-46d6-bd91-aaa84df6d665.png)

# Interface 

Para a implementação da interface foi utilizado o JFrame e o Swing para realizar a estilizar a página, onde foram criadas telas com final "admin" referindo-se ao contexto do modo administrador, abaixo está sendo apresentado nas imagens as telas de Login que é a tela inicial do projeto e a tela de programação onde contém alguns conteúdos já listados na mesma, pondeno assim ser acessado onde após ser clicado será direcionado para o link que está contido no botão.

![image](https://user-images.githubusercontent.com/55559983/160043958-dac738d9-daaf-4820-8013-411d433a44af.png)

![image](https://user-images.githubusercontent.com/55559983/160044145-c689c39e-ac74-4fe8-a9f6-a52fa90823a3.png)


# Execução 
Para realizar a execução é necessário baixar o arquivo para vizualizar o bando de dados SQLite é necessário acessar o arquivo contido na pasta **executation** desse repositório, e para ecxecutar é necessário inserir o aquivo abaixo na **Libraries** localizado na pasta dentro da IDE NetBeans o arquivo também pode ser baixado no link abaixo:

- https://drive.google.com/file/d/1SxlQtOaU6-MPPIYv90Rsw7W1cMrY7KSm/view?usp=sharing 



# Ferramentas 
- Linguagem: Java
- IDE: Apache NetBeans
- Interface: Jframe
- Banco de dados: SQLite
