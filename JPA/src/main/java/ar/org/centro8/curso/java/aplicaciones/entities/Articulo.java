/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.org.centro8.curso.java.aplicaciones.entities;

import ar.org.centro8.curso.java.aplicaciones.enums.Temporada;
import ar.org.centro8.curso.java.aplicaciones.enums.Tipo;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author lilia
 */
@Entity
@Table(name = "articulos")
@NamedQueries({
    @NamedQuery(name = "Articulo.findAll", query = "SELECT a FROM Articulo a"),
    @NamedQuery(name = "Articulo.findById", query = "SELECT a FROM Articulo a WHERE a.id = :id"),
    @NamedQuery(name = "Articulo.findByDescripcion", query = "SELECT a FROM Articulo a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Articulo.findByTipo", query = "SELECT a FROM Articulo a WHERE a.tipo = :tipo"),
    @NamedQuery(name = "Articulo.findByColor", query = "SELECT a FROM Articulo a WHERE a.color = :color"),
    @NamedQuery(name = "Articulo.findByTalleNum", query = "SELECT a FROM Articulo a WHERE a.talleNum = :talleNum"),
    @NamedQuery(name = "Articulo.findByStock", query = "SELECT a FROM Articulo a WHERE a.stock = :stock"),
    @NamedQuery(name = "Articulo.findByStockMin", query = "SELECT a FROM Articulo a WHERE a.stockMin = :stockMin"),
    @NamedQuery(name = "Articulo.findByStockMax", query = "SELECT a FROM Articulo a WHERE a.stockMax = :stockMax"),
    @NamedQuery(name = "Articulo.findByCosto", query = "SELECT a FROM Articulo a WHERE a.costo = :costo"),
    @NamedQuery(name = "Articulo.findByPrecio", query = "SELECT a FROM Articulo a WHERE a.precio = :precio"),
    @NamedQuery(name = "Articulo.findByTemporada", query = "SELECT a FROM Articulo a WHERE a.temporada = :temporada")})
public class Articulo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 7)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 20)
    @Column(name = "color")
    private String color;
    @Size(max = 20)
    @Column(name = "talle_num")
    private String talleNum;
    @Column(name = "stock")
    private Integer stock;
    @Column(name = "stockMin")
    private Integer stockMin;
    @Column(name = "stockMax")
    private Integer stockMax;
    @Basic(optional = false)
    @NotNull
    @Column(name = "costo")
    private double costo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Double precio;
    @Size(max = 8)
    @Column(name = "temporada")
    private String temporada;

    public Articulo() {
    }

    public Articulo(Integer id) {
        this.id = id;
    }

    public Articulo(String descripcion, double costo) {
      
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public Articulo(Integer id, String descripcion, String tipo, String color, String talleNum, Integer stock, Integer stockMin, Integer stockMax, double costo, Double precio, String temporada) {
        this.id = id;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.color = color;
        this.talleNum = talleNum;
        this.stock = stock;
        this.stockMin = stockMin;
        this.stockMax = stockMax;
        this.costo = costo;
        this.precio = precio;
        this.temporada = temporada;
    }

    public Articulo(String descripcion, String tipo, String color, String talleNum, Integer stock, Integer stockMin, Integer stockMax, double costo, Double precio, String temporada) {
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.color = color;
        this.talleNum = talleNum;
        this.stock = stock;
        this.stockMin = stockMin;
        this.stockMax = stockMax;
        this.costo = costo;
        this.precio = precio;
        this.temporada = temporada;
    }

    public Articulo(String descripcion, Tipo tipo, String color, String talle_num, int stock, int stockMin, int stockMax, double costo, double precio, Temporada temporada) {
        this.descripcion = descripcion;
        this.tipo = tipo.toString();
        this.color = color;
        this.talleNum = talleNum;
        this.stock = stock;
        this.stockMin = stockMin;
        this.stockMax = stockMax;
        this.costo = costo;
        this.precio = precio;
        this.temporada = temporada.toString();
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalleNum() {
        return talleNum;
    }

    public void setTalleNum(String talleNum) {
        this.talleNum = talleNum;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStockMin() {
        return stockMin;
    }

    public void setStockMin(Integer stockMin) {
        this.stockMin = stockMin;
    }

    public Integer getStockMax() {
        return stockMax;
    }

    public void setStockMax(Integer stockMax) {
        this.stockMax = stockMax;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articulo)) {
            return false;
        }
        Articulo other = (Articulo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Articulo{" + "id=" + id + ", descripcion=" + descripcion + ", tipo=" + tipo + ", color=" + color + ", talleNum=" + talleNum + ", stock=" + stock + ", stockMin=" + stockMin + ", stockMax=" + stockMax + ", costo=" + costo + ", precio=" + precio + ", temporada=" + temporada + '}';
    }

   
    
}
