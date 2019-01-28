package uce.ona.jorge.entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "direccion")
@NamedQueries({ @NamedQuery(name = "direccion.findAll", query = "SELECT d FROM direccion d") })
@XmlRootElement
public class direccionDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int numero;

	@Column(length = 40)
	private String calle1;

	@Column(length = 40)
	private String calle2;

	public direccionDto() {
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCalle1() {
		return calle1;
	}

	public void setCalle1(String calle1) {
		this.calle1 = calle1;
	}

	public String getCalle2() {
		return calle2;
	}

	public void setCalle2(String calle2) {
		this.calle2 = calle2;
	}

	public direccionDto(int numero, String calle1, String calle2) {
		super();
		this.numero = numero;
		this.calle1 = calle1;
		this.calle2 = calle2;
	}

	@Override
	public String toString() {
		return calle1 + " " + numero + " " + calle2 + "";
	}

	@Override
	public boolean equals(Object obj) {
		if (null == obj)
			return false;
		if (!(obj instanceof direccionDto))
			return false;
		direccionDto that = (direccionDto) obj;
		if (that.calle1.equals(this.calle1) && that.numero == this.numero && that.calle2.equals(this.calle2))
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.numero, this.calle1, this.calle2);
	}
}
