package model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "events_jpa")
public class Evento implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_user")
	private Long id;
	@Column(nullable = false)
	private String titolo;
	@Column(nullable = false)
	private Date dataevento;
	@Column(nullable = false)
	private String descrizione;
	@Column(nullable = false)
	private String tipoevento;
	@Column(nullable = false)
	private Integer numeromassimopartecipanti;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return titolo;
	}
	public void setTitle(String title) {
		this.titolo = title;
	}
	public Date getDataEvento() {
		return dataevento;
	}
	public void setDataEvento(Date dataEvento) {
		this.dataevento = dataEvento;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getTipoEvento() {
		return tipoevento;
	}
	public void setTipoEvento(String tipoEvento) {
		this.tipoevento = tipoEvento;
	}
	public Integer getNumeroMassimoPartecipanti() {
		return numeromassimopartecipanti;
	}
	public void setNumeroMassimoPartecipanti(Integer numeroMassimoPartecipanti) {
		this.numeromassimopartecipanti = numeroMassimoPartecipanti;
	}
	@Override
	public String toString() {
		return "Evento [id=" + id + ", title=" + titolo + ", dataEvento=" + dataevento + ", descrizione=" + descrizione
				+ ", tipoEvento=" + tipoevento + ", numeroMassimoPartecipanti=" + numeromassimopartecipanti + "]";
	}
	
	
}