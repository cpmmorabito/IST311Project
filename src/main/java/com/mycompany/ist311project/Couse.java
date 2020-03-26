/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ist311project;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "Couse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Couse.findAll", query = "SELECT c FROM Couse c"),
    @NamedQuery(name = "Couse.findByCouseId", query = "SELECT c FROM Couse c WHERE c.couseId = :couseId"),
    @NamedQuery(name = "Couse.findByCredit", query = "SELECT c FROM Couse c WHERE c.credit = :credit"),
    @NamedQuery(name = "Couse.findByCourseName", query = "SELECT c FROM Couse c WHERE c.courseName = :courseName")})
public class Couse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "couseId")
    private Long couseId;
    @Column(name = "credit")
    private BigInteger credit;
    @Column(name = "courseName")
    private String courseName;

    public Couse() {
    }

    public Couse(Long couseId) {
        this.couseId = couseId;
    }

    public Long getCouseId() {
        return couseId;
    }

    public void setCouseId(Long couseId) {
        this.couseId = couseId;
    }

    public BigInteger getCredit() {
        return credit;
    }

    public void setCredit(BigInteger credit) {
        this.credit = credit;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (couseId != null ? couseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Couse)) {
            return false;
        }
        Couse other = (Couse) object;
        if ((this.couseId == null && other.couseId != null) || (this.couseId != null && !this.couseId.equals(other.couseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ist311project.Couse[ couseId=" + couseId + " ]";
    }
    
}
