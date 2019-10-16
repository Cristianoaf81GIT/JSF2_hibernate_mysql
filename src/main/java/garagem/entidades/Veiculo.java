package garagem.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 29494442495207797L;
	@Id
	@GeneratedValue
	private Integer id_veiculo;
	private String marca_veiculo;
	private String modelo_veiculo;
	private String tipo_veiculo;
	private String fabricacao_veiculo;
	private String preco;
	
	public Integer getId_veiculo() {
		return id_veiculo;
	}
	public void setId_veiculo(Integer id_veiculo) {
		this.id_veiculo = id_veiculo;
	}
	public String getMarca_veiculo() {
		return marca_veiculo;
	}
	public void setMarca_veiculo(String marca_veiculo) {
		this.marca_veiculo = marca_veiculo;
	}
	public String getModelo_veiculo() {
		return modelo_veiculo;
	}
	public void setModelo_veiculo(String modelo_veiculo) {
		this.modelo_veiculo = modelo_veiculo;
	}
	public String getTipo_veiculo() {
		return tipo_veiculo;
	}
	public void setTipo_veiculo(String tipo_veiculo) {
		this.tipo_veiculo = tipo_veiculo;
	}
	public String getFabricacao_veiculo() {
		return fabricacao_veiculo;
	}
	public void setFabricacao_veiculo(String fabricacao_veiculo) {
		this.fabricacao_veiculo = fabricacao_veiculo;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fabricacao_veiculo == null) ? 0 : fabricacao_veiculo.hashCode());
		result = prime * result + ((id_veiculo == null) ? 0 : id_veiculo.hashCode());
		result = prime * result + ((marca_veiculo == null) ? 0 : marca_veiculo.hashCode());
		result = prime * result + ((modelo_veiculo == null) ? 0 : modelo_veiculo.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		result = prime * result + ((tipo_veiculo == null) ? 0 : tipo_veiculo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (fabricacao_veiculo == null) {
			if (other.fabricacao_veiculo != null)
				return false;
		} else if (!fabricacao_veiculo.equals(other.fabricacao_veiculo))
			return false;
		if (id_veiculo == null) {
			if (other.id_veiculo != null)
				return false;
		} else if (!id_veiculo.equals(other.id_veiculo))
			return false;
		if (marca_veiculo == null) {
			if (other.marca_veiculo != null)
				return false;
		} else if (!marca_veiculo.equals(other.marca_veiculo))
			return false;
		if (modelo_veiculo == null) {
			if (other.modelo_veiculo != null)
				return false;
		} else if (!modelo_veiculo.equals(other.modelo_veiculo))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		if (tipo_veiculo == null) {
			if (other.tipo_veiculo != null)
				return false;
		} else if (!tipo_veiculo.equals(other.tipo_veiculo))
			return false;
		return true;
	}
	
	

}
