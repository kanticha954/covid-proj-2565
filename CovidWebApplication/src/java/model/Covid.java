/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "COVID")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Covid.findAll", query = "SELECT c FROM Covid c"),
    @NamedQuery(name = "Covid.findById", query = "SELECT c FROM Covid c WHERE c.id = :id"),
    @NamedQuery(name = "Covid.findByYearCovid", query = "SELECT c FROM Covid c WHERE c.yearCovid = :yearCovid"),
    @NamedQuery(name = "Covid.findByWeeknum", query = "SELECT c FROM Covid c WHERE c.weeknum = :weeknum"),
    @NamedQuery(name = "Covid.findByProvince", query = "SELECT c FROM Covid c WHERE c.province = :province"),
    @NamedQuery(name = "Covid.findByNewCase", query = "SELECT c FROM Covid c WHERE c.newCase = :newCase"),
    @NamedQuery(name = "Covid.findByTotalCase", query = "SELECT c FROM Covid c WHERE c.totalCase = :totalCase"),
    @NamedQuery(name = "Covid.findByNewCaseExcludeabroad", query = "SELECT c FROM Covid c WHERE c.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "Covid.findByTotalCaseExcludeabroad", query = "SELECT c FROM Covid c WHERE c.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "Covid.findByNewDeath", query = "SELECT c FROM Covid c WHERE c.newDeath = :newDeath"),
    @NamedQuery(name = "Covid.findByTotalDeath", query = "SELECT c FROM Covid c WHERE c.totalDeath = :totalDeath"),
    @NamedQuery(name = "Covid.findByUpdateDate", query = "SELECT c FROM Covid c WHERE c.updateDate = :updateDate")})
public class Covid implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "YEAR_COVID")
    private int yearCovid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "WEEKNUM")
    private int weeknum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "PROVINCE")
    private String province;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NEW_CASE")
    private int newCase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL_CASE")
    private int totalCase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NEW_CASE_EXCLUDEABROAD")
    private int newCaseExcludeabroad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL_CASE_EXCLUDEABROAD")
    private int totalCaseExcludeabroad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NEW_DEATH")
    private int newDeath;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL_DEATH")
    private int totalDeath;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "UPDATE_DATE")
    private String updateDate;

    public Covid() {
    }

    public Covid(Integer id) {
        this.id = id;
    }

    public Covid(Integer id, int yearCovid, int weeknum, String province, int newCase, int totalCase, int newCaseExcludeabroad, int totalCaseExcludeabroad, int newDeath, int totalDeath, String updateDate) {
        this.id = id;
        this.yearCovid = yearCovid;
        this.weeknum = weeknum;
        this.province = province;
        this.newCase = newCase;
        this.totalCase = totalCase;
        this.newCaseExcludeabroad = newCaseExcludeabroad;
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
        this.newDeath = newDeath;
        this.totalDeath = totalDeath;
        this.updateDate = updateDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getYearCovid() {
        return yearCovid;
    }

    public void setYearCovid(int yearCovid) {
        this.yearCovid = yearCovid;
    }

    public int getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(int weeknum) {
        this.weeknum = weeknum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getNewCase() {
        return newCase;
    }

    public void setNewCase(int newCase) {
        this.newCase = newCase;
    }

    public int getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(int totalCase) {
        this.totalCase = totalCase;
    }

    public int getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    public void setNewCaseExcludeabroad(int newCaseExcludeabroad) {
        this.newCaseExcludeabroad = newCaseExcludeabroad;
    }

    public int getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    public void setTotalCaseExcludeabroad(int totalCaseExcludeabroad) {
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
    }

    public int getNewDeath() {
        return newDeath;
    }

    public void setNewDeath(int newDeath) {
        this.newDeath = newDeath;
    }

    public int getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(int totalDeath) {
        this.totalDeath = totalDeath;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
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
        if (!(object instanceof Covid)) {
            return false;
        }
        Covid other = (Covid) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Covid[ id=" + id + " ]";
    }
    
}
