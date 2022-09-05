package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "TBL_VEICULO")
public class Veiculo {

	
	@Id
	@Column (name = "ID_VEICULO")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column (name = "TX_FABRICANTE")
	private String fabricante;
	
	@Column (name = "TX_MODELO")
	private String modelo;
	
	private Integer anoFabricacao;
	private Integer anoModelo;
	private double valor;
	 
}
