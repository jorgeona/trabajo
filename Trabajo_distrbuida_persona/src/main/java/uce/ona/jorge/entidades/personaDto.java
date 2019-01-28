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
@Table(name = "persona")
@NamedQueries({
        @NamedQuery(name = "persona.findAll", query = "SELECT p FROM persona p")
})
@XmlRootElement
public class personaDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 40)
    private String nombre;
    
    @Column(length = 40)
    private String fecha_nacimiento;
    
    @Column(length = 40)
    private String direccion;
    

    public personaDto() {
    }

    
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public personaDto(int id, String nombre, String fecha_nacimiento, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.direccion = direccion;
	}


    @Override
    public String toString() {
        return nombre + " " + id;
    }
    @Override
    public boolean equals(Object obj) {
        if (null == obj)
            return false;
        if (!(obj instanceof personaDto))
            return false;
        personaDto that = (personaDto) obj;
        if (that.nombre.equals(this.nombre) && that.id == this.id)
            return true;
        else
            return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.nombre);
    }
}
