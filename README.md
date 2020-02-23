# SIGICOP 
Sistema de Gerenciamento de Impress�es e Copias

## Descri��o:
**A SIGICOP � um projeto de conclus�o do curso subsequente em inform�tica,
 realizado por Manacio Pereira de Souza ([@Manacio :octocat:](https://github.com/Manacio)) e por Magdiel Pereira de Souza ([@MagdielPS :octocat:](https://github.com/MagdielPS)).
 A SIGICOP � um sistema de gerenciamento de c�pias e impress�es,
 que facilite e agilize a demanda de impress�es e c�pias do IFRN-CAMPUS-JC,
 onde o usu�rio possa ter controle sobre a quantidade de solicita��o dispon�veis e o administrdor possar gerenciar as solicitac�es**

# Diagrama de Classes :page_facing_up:
![DiagramaUMLClasses](https://user-images.githubusercontent.com/55263575/74077291-559b0e00-49fd-11ea-8b8e-d56638a05e86.jpg)

# Diagrama de Caso de Uso do Usu�rio ![usu](https://user-images.githubusercontent.com/55263599/71699011-6f14be80-2d9c-11ea-9657-b5e8f9ab43d9.png)

![Caso_de_Uso_Usuario](https://user-images.githubusercontent.com/55263599/73952983-7a4c9400-48de-11ea-91ec-7fe424556a6f.jpg)

# Diagrama de Caso de Uso do Administrador ![adm](https://user-images.githubusercontent.com/55263599/71698974-48ef1e80-2d9c-11ea-9963-3d43d39500d5.png)
![Caso_de_uso_Administrador](https://user-images.githubusercontent.com/55263599/73953103-b122aa00-48de-11ea-90f7-3f694b19540e.jpg)


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
![SIGICOP_USUARIO_COMPUTADOR](https://user-images.githubusercontent.com/55263599/74994975-4faa2180-542e-11ea-9496-7cd99505dd2b.gif)

## P�ginas da SIGICOP para Usu�rio - Vers�o Mobile :iphone: (260 x 450)
![CELULAR_USUARIO](https://user-images.githubusercontent.com/55263599/75049646-57f37280-54a9-11ea-9598-c4dd39cd6dbc.gif)

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
![Webp net-gifmaker](https://user-images.githubusercontent.com/55263599/71113258-f7e00780-21ab-11ea-8106-f04db75df755.gif)

## P�ginas da SIGICOP para Administrador - Vers�o Mobile :iphone: (260 x 450)
![Webp net-gifmaker](https://user-images.githubusercontent.com/55263599/71113258-f7e00780-21ab-11ea-8106-f04db75df755.gif)

## As importa��es mais importantes utlizado nos templates layPri.html e laySeg.html :exclamation: :

[*Jquery*](https://jquery.com/)
```html
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.11/jquery.mask.min.js"></script>
```

[*Bootstrap*](https://getbootstrap.com/docs/4.4/getting-started/introduction/)
```html
<link rel="stylesheet" type="text/css" href="@{'/public/bootstrap/css/bootstrap.css'}">

<link rel="stylesheet" media="screen" href="@{'/public/stylesheets/meuCss/cssPersonalizado.css'}">   
<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/meuCss.css'}">
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="@{'/public/bootstrap/js/bootstrap.bundle.min.js'}"></script>
 ``` 

[*Semantic*](https://semantic-ui.com/introduction/getting-started.html)
```html
<script src="@{'/public/Semantic/js/semantic.js'}"/></script>
<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/icon.css'}">
<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/grid.css'}"><!-- rodape utilizar-->
<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/header.css'}"><!-- utilizado em loginUser e logarAdm  -->
<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/segment.css'}"><!-- rodape utilizar-->
<link rel="stylesheet" type="text/css" href="@{'/public/Semantic/css/button.css'}">
```

## Tabela de Refer�ncias de Sites :link::
Refer�ncias    | Categoria   | Links
-------------- | :---------: | ----
Play Framework | Plataforma de Desenvolvimento |  [1.4.5](https://www.playframework.com/documentation/1.4.x/home) 
Bootstrap      | CSS         | [Bootstrap](https://getbootstrap.com/docs/4.4/getting-started/introduction/)
Semantic UI    | CSS         |  [Semantic](https://semantic-ui.com/introduction/getting-started.html) 
Uikit          | CSS         | [Uikit](https://getuikit.com/docs/introduction) 
Sweeetalert2   | JS          |  [Sweeetalert2](https://sweetalert2.github.io/)
Animate        |CSS-ANIMA��O |  [Animate](https://daneden.github.io/animate.css/)
Jquery         | JS          |  [Jquery](https://jquery.com/)
W3school       | Plataforma de Conhecimento |  [W3school](https://www.w3schools.com/)
Icon8          | Plataforma de Icones | [Icons8](https://icons8.com.br/icons)
