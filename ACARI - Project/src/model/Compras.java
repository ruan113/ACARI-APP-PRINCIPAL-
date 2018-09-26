package model;
// Generated 08/08/2018 15:24:22 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Compras generated by hbm2java
 */
public class Compras  implements java.io.Serializable {


     private long idCompra;
     private Integer idAssociado;
     private Integer idMaterial;
     private float QuantidadeKG;
     private float precoPorKilo;
     private float precoTotal;
     private Set itensCompradores = new HashSet(0);
     
    public Compras() {
    }

	
    public Compras(long idCompra) {
        this.idCompra = idCompra;
    }
    public Compras(long idCompra, Integer idAssociado, Set itensCompradores) {
       this.idCompra = idCompra;
       this.idAssociado = idAssociado;
       this.itensCompradores = itensCompradores;
    }

    public Compras(Integer idAssociado, Integer idMaterial, float QuantidadeKG, float precoPorKilo, float precoTotal) {
        this.idAssociado = idAssociado;
        this.idMaterial = idMaterial;
        this.QuantidadeKG = QuantidadeKG;
        this.precoPorKilo = precoPorKilo;
        this.precoTotal = precoTotal;
    }
    
    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public float getQuantidadeKG() {
        return QuantidadeKG;
    }

    public void setQuantidadeKG(float QuantidadeKG) {
        this.QuantidadeKG = QuantidadeKG;
    }

    public float getPrecoPorKilo() {
        return precoPorKilo;
    }

    public void setPrecoPorKilo(float precoPorKilo) {
        this.precoPorKilo = precoPorKilo;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }
   
    public long getIdCompra() {
        return this.idCompra;
    }
    
    public void setIdCompra(long idCompra) {
        this.idCompra = idCompra;
    }
    public Integer getIdAssociado() {
        return this.idAssociado;
    }
    
    public void setIdAssociado(Integer idAssociado) {
        this.idAssociado = idAssociado;
    }
    public Set getItensCompradores() {
        return this.itensCompradores;
    }
    
    public void setItensCompradores(Set itensCompradores) {
        this.itensCompradores = itensCompradores;
    }

}


