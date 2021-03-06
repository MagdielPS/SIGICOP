package seguranca;

import java.util.Date;

import annotations.Admin;
import annotations.User;
import controllers.Administradores;
import controllers.Gerenciador;
import controllers.Usuarios;
import models.Operador;
import models.DadosSessao;
import models.DadosSessaoAdmin;
import play.cache.Cache;
import play.mvc.Before;
import play.mvc.Controller;

public class Seguranca extends Controller {
	@Before(unless = {"Gerenciador.login","Usuarios.cadastroDeUsuario","Usuarios.salvarUsuario"})
	static void verificarAutenticacao() {
	System.out.println("_____________________________________________________________________________________");
	System.out.println("Seguranca.verificarAutentificacao() ... ["+ new Date()+"]");
		if (!session.contains("usuarioLogado") && !session.contains("adminLogado")) {
			flash.error("Você precisa logar no sistema");
		Gerenciador.login();
		}else if(session.contains("usuarioLogado")) {
			System.out.println("Usuario possui sessao ativa... ["+ new Date()+"]");
			
			String perfil = session.get("adminLogado");
			Admin adminAnnotation = getActionAnnotation(Admin.class);
			if (adminAnnotation != null && perfil == null) {
				flash.error("Acesso restrito aos administradores do sistema");
			Gerenciador.login();
			}
			DadosSessao dadosSessao = (DadosSessao) Cache.get(session.getId());
			
			if (dadosSessao == null) {
			System.out.println("_____________________________________________________________________________________");
			System.out.println("Usuario NÃO possui mais sessao ativa... ["+ new Date()+"]");
				flash.error("Você precisa logar no sistema, a sessão expirou-se");
			Gerenciador.login();
			}
		}else if(session.contains("adminLogado")){
		System.out.println("Administrador possui sessao ativa... ["+ new Date()+"]");
			
			String perfil = session.get("usuarioLogado");
			User adminAnnotation = getActionAnnotation(User.class);
			if (adminAnnotation != null && perfil == null) {
				flash.error("Acesso restrito aos usuários do sistema");
			Gerenciador.login();
			}
			DadosSessaoAdmin dadosSessaoAdmin = (DadosSessaoAdmin) Cache.get(session.getId());
			
			if (dadosSessaoAdmin == null) {
			System.out.println("Administrador NÃO possui sessao ativa... ["+ new Date()+"]");
				flash.error("Você precisa logar no sistema, a sessão expirou-se");
				Gerenciador.login();
			}	
		}
	}
}