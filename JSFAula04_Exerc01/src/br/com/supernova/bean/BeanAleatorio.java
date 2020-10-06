package br.com.supernova.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named("aleatorio")
@RequestScoped
public class BeanAleatorio{
	
	private List<Integer> retorno = new ArrayList<>();
	private Integer qtdNumeros, vlrMn, vlrMx;
	
	public String processar(){
		
		Random rd = new Random();
		
		for(int i=0; i < qtdNumeros; i++){			
			int resultado = rd.nextInt(vlrMx - vlrMn) + vlrMn + 1;
			retorno.add(resultado);
		}
		
		return null;
	}
	
	public Integer getQtdNumeros(){
		return this.qtdNumeros;
	}

	public void setQtdNumeros(Integer qtd){
		this.qtdNumeros = qtd;
	}

	public Integer getVlrMn(){
		return this.vlrMn;
	}

	public void setVlrMn(Integer valor){
		this.vlrMn = valor;
	}

	public Integer getVlrMx(){
		return this.vlrMx;
	}

	public void setVlrMx(Integer valor){
		this.vlrMx = valor;
	}
	
	public void setRetorno(List<Integer> lista) {
		this.retorno = lista;
	}
	
	public List<Integer> getRetorno(){
		return 	retorno;
	}
	
}
