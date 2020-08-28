# SIGICOP 
Sistema de Gerenciamento de Impress�es e Copias

## Descri��o:
**A SIGICOP � um projeto de conclus�o do curso subsequente em inform�tica,
 realizado por Manacio Pereira de Souza ([@Manacio :octocat:](https://github.com/Manacio)) e por Magdiel Pereira de Souza ([@MagdielPS :octocat:](https://github.com/MagdielPS)).
 A SIGICOP � um sistema de gerenciamento de c�pias e impress�es,
 que facilite e agilize a demanda de impress�es e c�pias do IFRN-CAMPUS-JC,
 onde o usu�rio possa ter controle sobre a quantidade de solicita��o dispon�veis e o administrador possar gerenciar as solicita��es**

# Diagrama de Classes :page_facing_up:
![Diagrama_Classes_UML](https://user-images.githubusercontent.com/55263599/87580483-faf19680-c6ad-11ea-9e9f-1e07bcd80361.jpg)

# Diagrama de Caso de Uso do Usu�rio ![usu](https://user-images.githubusercontent.com/55263599/71699011-6f14be80-2d9c-11ea-9657-b5e8f9ab43d9.png)

![User Caso de Uso](https://user-images.githubusercontent.com/55263599/87580700-45731300-c6ae-11ea-8fb1-b9e4fc4dda0a.jpg)


# Diagrama de Caso de Uso do Administrador ![adm](https://user-images.githubusercontent.com/55263599/71698974-48ef1e80-2d9c-11ea-9963-3d43d39500d5.png)
![Admin Caso de Uso](https://user-images.githubusercontent.com/55263599/87580715-4c9a2100-c6ae-11ea-9e90-d57f1d125e0c.jpg)


# PASSO A PASSO DO USU�RIO ![usu](https://user-images.githubusercontent.com/55263599/71699011-6f14be80-2d9c-11ea-9657-b5e8f9ab43d9.png)

* O usu�rio dever� acessar o site da SIGICOP;
* Quando visitar a p�gina principal clicar em "Entrar" ou em "Entrar agora";
* Se caso o usu�rio ainda n�o for cadastrado, dever� se cadastrar clicando em "Cadastra-se", preencher o formul�rio e salvar os dados;
* Ao entrar na p�gina de login, fornecer o login e senha para entrar no sistema;
* O usu�rio ao logar, poder� visualizar seus pedidos anteriores (se houver), e poder� filtra-los e efetuar download;
* Em "Meus Dados" (icone de usu�rio) poder� visualizar a quantidade dispon�vel de solicita��es, clicando poder� vizualizar seu nome, email e ultimo acesso;
* Poder� solicitar pedidos de impress�es, ao solicitar, se houver solicitac�o disponivel, aparecer� o formul�rio, se n�o, aparecer� mensagem em vermelho informando que n�o � possivel efetuar nenhuma solicitac�o;
* Ao solicitar, os pedido ser�o listado ao lado do formul�rio, onde o usu�rio poder� cancelar e salvar quando quiser;
* Ap�s logar, o usu�rio poder� sair a qualquer momento;

## P�ginas da SIGICOP para Usu�rio :computer:
![desktop](https://user-images.githubusercontent.com/55263599/91240274-e88c6300-e717-11ea-9fdf-a78dcc2fccc1.gif)

## P�ginas da SIGICOP para Usu�rio - Vers�o Mobile :iphone: (260 x 450)
![cell](https://user-images.githubusercontent.com/55263599/91240348-2a1d0e00-e718-11ea-8568-f606c8e3bcd3.gif)

# PASSO A PASSO DO ADMINISTRADOR ![adm](https://user-images.githubusercontent.com/55263599/71698974-48ef1e80-2d9c-11ea-9963-3d43d39500d5.png)

* O administrador dever� acessar o site da SIGICOP;
* Quando visitar a p�gina principal clicar em "Logar" ou em "logar agora";
* Ao entrar na p�gina de login, fornecer o login e senha para entrar no sistema;
* O administrador ao logar, poder� visualizar todos os pedidos com o status "AGUARDANDO" (se houver), filtra-los e efetuar download;
* Em "Meus Dados" (icone do administrador) poder visualizar seu nome, email e ultimo acesso, e poder� editar seus dados;
* O administrador poder� concluir ou recusar os pedidos (se houver), se recusar ser� obrigado a d� uma justificativa, se concluir, ser� opcional a justificativa;
* O administrador poder� listar todos os pedidos conclu�dos, e poder� filtra-los;
* O administrador poder� listar todos os pedidos recusados, e poder� filtra-los;
* O administrador em lista de conclu�do, poder� entregar o pedido depois que o usu�rio recebe a impress�o;
* O administrador poder� realizar baixa para o usu�rio, quando for pedido de c�pia;
* O administrador padr�o poder� cadastrar novos administradores;
* O administrador padr�o poder� listar todos os administradores do sistema e remover-los;
* O administrador padr�o poder� restaurar a quantidade de solicita��es de todos os usu�rios, informando a quantidade;
* Ao logar, o administrador poder� sair a qualquer momento;

## P�ginas da SIGICOP para Administrador :computer:
![desktop_adm](https://user-images.githubusercontent.com/55263599/91241323-f7c0e000-e71a-11ea-8299-032dcabd297c.gif)

## P�ginas da SIGICOP para Administrador - Vers�o Mobile :iphone: (260 x 450)
![cell_adm](https://user-images.githubusercontent.com/55263599/91242162-12945400-e71d-11ea-88e4-2f0944c61242.gif)

## As importa��es mais importantes :exclamation: :

[*Jquery*](https://jquery.com/) (laySeg.html)
```html
<!-- JS JQUERY -->
		<script src="@{'/public/javascripts/Jquery/jquery-3.4.1.js'}" type="text/javascript" charset="${_response_encoding}"></script>		
		<script src="@{'/public/javascripts/Jquery/jquery.mask.js'}" type="text/javascript" charset="${_response_encoding}"></script>
```

[*Bootstrap*](https://getbootstrap.com/docs/4.4/getting-started/introduction/) (layPri.html e laySeg.html)
```html
<!-- BOOTSTRAP - CSS -->
		<link rel="stylesheet" type="text/css" href="@{'/public/bootstrap/css/bootstrap.css'}">
<!-- BOOTSTRAP JS -->
		<script src="@{'/public/bootstrap/js/bootstrap.bundle.min.js'}"></script>
 ``` 

[*Semantic*](https://semantic-ui.com/introduction/getting-started.html) (layPri.html e laySeg.html)
```html
<!--SEAMNTIC CSS -->
		<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/reset.min.css'}">
		<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/site.min.css'}">
		<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/container.min.css'}">
		<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/grid.min.css'}">
		<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/header.min.css'}">
		<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/menu.min.css'}">		
		<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/divider.min.css'}">
		<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/segment.min.css'}">
		<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/button.min.css'}">
		<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/icon.min.css'}">
		<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/sidebar.min.css'}">
		<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/transition.min.css'}">
		<link rel="stylesheet" type="text/css" href="@{'/public/stylesheets/SIGICOP.css'}">
		
<!-- SEMANTIC JS -->
		<script src="@{'/public/Semantic/js/jquery.min.js'}"></script>
		<script src="@{'/public/Semantic/js/visibility.min.js'}"></script>
		<script src="@{'/public/Semantic/js/sidebar.min.js'}"></script>
		<script src="@{'/public/Semantic/js/transition.min.js'}"></script>
		<script src="@{'/public/Semantic/js/meuJs.js'}"></script>
```

[*Sweetalert*](https://sweetalert2.github.io/) (layPri.html e laySeg.html)
```html
<!-- SWEETALERT2 -->
 		<script src="@{'/public/javascripts/meuJs/sweetalert2@9.js'}"></script>
```
## Tabela de Refer�ncias de Sites :link::
Refer�ncias    | Categoria   | Links
-------------- | :---------: | ----
Play Framework | Plataforma de Desenvolvimento |  [1.4.5](https://www.playframework.com/documentation/1.4.x/home) 
Bootstrap      | CSS         | [Bootstrap](https://getbootstrap.com/docs/4.4/getting-started/introduction/)
Semantic UI    | CSS         |  [Semantic](https://semantic-ui.com/introduction/getting-started.html) 
Sweeetalert2   | JS          |  [Sweeetalert2](https://sweetalert2.github.io/)
Animate        |CSS-ANIMA��O |  [Animate](https://daneden.github.io/animate.css/)
Jquery         | JS          |  [Jquery](https://jquery.com/)
W3school       | Plataforma de Conhecimento |  [W3school](https://www.w3schools.com/)
Icon8          | Plataforma de Icones | [Icons8](https://icons8.com.br/icons)
