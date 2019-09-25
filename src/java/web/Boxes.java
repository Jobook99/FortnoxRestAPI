/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

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
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "boxes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Boxes.findAll", query = "SELECT b FROM Boxes b")})
public class Boxes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "receiver")
    private String receiver;
    @Basic(optional = false)
    @NotNull
    @Column(name = "weight")
    private float weight;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shippingcost")
    private float shippingcost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "red")
    private int red;
    @Basic(optional = false)
    @NotNull
    @Column(name = "green")
    private int green;

    public Boxes() {
    }

    public Boxes(Integer id) {
        this.id = id;
    }

    public Boxes(Integer id, String receiver, float weight, float shippingcost, int red, int green) {
        this.id = id;
        this.receiver = receiver;
        this.weight = weight;
        this.shippingcost = shippingcost;
        this.red = red;
        this.green = green;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getShippingcost() {
        return shippingcost;
    }

    public void setShippingcost(float shippingcost) {
        this.shippingcost = shippingcost;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
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
        if (!(object instanceof Boxes)) {
            return false;
        }
        Boxes other = (Boxes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "web.Boxes[ id=" + id + " ]";
    }
    
}
