package garagem.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import garagem.entidades.Veiculo;
import garagem.regrasdenegocio.VeiculoRN;


@ManagedBean(name="veiculoBEAN")
@RequestScoped
public class VeiculoBEAN {
	
	private Veiculo veiculo = new Veiculo();;
	private List<Veiculo> veiculos;
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public void salvar() {
		VeiculoRN veiculoRN = new VeiculoRN();
		veiculoRN.salvar(this.veiculo);
		limpar();
	}
	
	
	public String limpar() 
	{
		this.veiculo = new Veiculo();
		return "index";
	}
	
	public List<Veiculo> getVeiculos()
	{
		VeiculoRN  veiculoRN = new VeiculoRN();
		veiculos = veiculoRN.listar();
		System.out.println(veiculos.get(0).toString());
		return veiculos;
	}
	
	public String deletar(Veiculo veiculo)
	{
		VeiculoRN veiculoRN = new VeiculoRN();
		veiculoRN.excluir(veiculo);
		if(veiculos.contains(veiculo))
			veiculos.remove(veiculo);
		return null;
	}	
	
	
	public void setVeiculos(List<Veiculo> veiculos) 
	{
		this.veiculos = veiculos;
	}
	
	public String editar()
	{
		if(this.veiculo!=null)
			return "index";
		return null;
	}	
		
}
