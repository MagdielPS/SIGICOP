package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;

import net.sf.oval.constraint.MaxLength;
import play.data.validation.Required;
import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Pedido extends Model {		
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Long id;
	
	@Required
	public Blob arquivo;
	
	@Required
	public String nomeArquivo;
	
	@Required
	@Min(1)
	public int qtdCopias;
	
	@Required
	public String frenteVerso;
	
	public String descricao;
	
	@Required
	@Temporal(TemporalType.TIMESTAMP)
	public Date dataEnvio;
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date dataEntrega;

	@Enumerated(EnumType.STRING)
	public StatusPedido status = StatusPedido.AGUARDANDO;;

	@ManyToOne
	public Usuario usuario;
	
	@ManyToOne
	public Administrador adm;
	
	@Lob
	public String atendimento;
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date dataAtendimento;

}