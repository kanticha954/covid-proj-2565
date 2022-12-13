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
@Table(name = "COVID_WEEK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CovidWeek.findAll", query = "SELECT c FROM CovidWeek c"),
    @NamedQuery(name = "CovidWeek.findById", query = "SELECT c FROM CovidWeek c WHERE c.id = :id"),
    @NamedQuery(name = "CovidWeek.findByYearnum", query = "SELECT c FROM CovidWeek c WHERE c.yearnum = :yearnum"),
    @NamedQuery(name = "CovidWeek.findByWeeknum", query = "SELECT c FROM CovidWeek c WHERE c.weeknum = :weeknum"),
    @NamedQuery(name = "CovidWeek.findByNewCase", query = "SELECT c FROM CovidWeek c WHERE c.newCase = :newCase"),
    @NamedQuery(name = "CovidWeek.findByTotalCase", query = "SELECT c FROM CovidWeek c WHERE c.totalCase = :totalCase"),
    @NamedQuery(name = "CovidWeek.findByNewCaseExcludeabroad", query = "SELECT c FROM CovidWeek c WHERE c.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "CovidWeek.findByTotalCaseExcludeabroad", query = "SELECT c FROM CovidWeek c WHERE c.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "CovidWeek.findByNewRecovered", query = "SELECT c FROM CovidWeek c WHERE c.newRecovered = :newRecovered"),
    @NamedQuery(name = "CovidWeek.findByTotalRecovered", query = "SELECT c FROM CovidWeek c WHERE c.totalRecovered = :totalRecovered"),
    @NamedQuery(name = "CovidWeek.findByNewDeath", query = "SELECT c FROM CovidWeek c WHERE c.newDeath = :newDeath"),
    @NamedQuery(name = "CovidWeek.findByTotalDeath", query = "SELECT c FROM CovidWeek c WHERE c.totalDeath = :totalDeath"),
    @NamedQuery(name = "CovidWeek.findByCaseForeign", query = "SELECT c FROM CovidWeek c WHERE c.caseForeign = :caseForeign"),
    @NamedQuery(name = "CovidWeek.findByCasePrison", query = "SELECT c FROM CovidWeek c WHERE c.casePrison = :casePrison"),
    @NamedQuery(name = "CovidWeek.findByCaseWalkin", query = "SELECT c FROM CovidWeek c WHERE c.caseWalkin = :caseWalkin"),
    @NamedQuery(name = "CovidWeek.findByCaseNewPrev", query = "SELECT c FROM CovidWeek c WHERE c.caseNewPrev = :caseNewPrev"),
    @NamedQuery(name = "CovidWeek.findByCaseNewDiff", query = "SELECT c FROM CovidWeek c WHERE c.caseNewDiff = :caseNewDiff"),
    @NamedQuery(name = "CovidWeek.findByDeathNewPrev", query = "SELECT c FROM CovidWeek c WHERE c.deathNewPrev = :deathNewPrev"),
    @NamedQuery(name = "CovidWeek.findByDeathNewDiff", query = "SELECT c FROM CovidWeek c WHERE c.deathNewDiff = :deathNewDiff"),
    @NamedQuery(name = "CovidWeek.findByUpdateDate", query = "SELECT c FROM CovidWeek c WHERE c.updateDate = :updateDate")})
public class CovidWeek implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "YEARNUM")
    private int yearnum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "WEEKNUM")
    private int weeknum;
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
    @Column(name = "NEW_RECOVERED")
    private int newRecovered;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL_RECOVERED")
    private int totalRecovered;
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
    @Column(name = "CASE_FOREIGN")
    private int caseForeign;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CASE_PRISON")
    private int casePrison;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CASE_WALKIN")
    private int caseWalkin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CASE_NEW_PREV")
    private int caseNewPrev;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CASE_NEW_DIFF")
    private int caseNewDiff;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DEATH_NEW_PREV")
    private int deathNewPrev;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DEATH_NEW_DIFF")
    private int deathNewDiff;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "UPDATE_DATE")
    private String updateDate;

    public CovidWeek() {
    }

    public CovidWeek(Integer id) {
        this.id = id;
    }

    public CovidWeek(Integer id, int yearnum, int weeknum, int newCase, int totalCase, int newCaseExcludeabroad, int totalCaseExcludeabroad, int newRecovered, int totalRecovered, int newDeath, int totalDeath, int caseForeign, int casePrison, int caseWalkin, int caseNewPrev, int caseNewDiff, int deathNewPrev, int deathNewDiff, String updateDate) {
        this.id = id;
        this.yearnum = yearnum;
        this.weeknum = weeknum;
        this.newCase = newCase;
        this.totalCase = totalCase;
        this.newCaseExcludeabroad = newCaseExcludeabroad;
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
        this.newRecovered = newRecovered;
        this.totalRecovered = totalRecovered;
        this.newDeath = newDeath;
        this.totalDeath = totalDeath;
        this.caseForeign = caseForeign;
        this.casePrison = casePrison;
        this.caseWalkin = caseWalkin;
        this.caseNewPrev = caseNewPrev;
        this.caseNewDiff = caseNewDiff;
        this.deathNewPrev = deathNewPrev;
        this.deathNewDiff = deathNewDiff;
        this.updateDate = updateDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getYearnum() {
        return yearnum;
    }

    public void setYearnum(int yearnum) {
        this.yearnum = yearnum;
    }

    public int getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(int weeknum) {
        this.weeknum = weeknum;
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

    public int getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(int newRecovered) {
        this.newRecovered = newRecovered;
    }

    public int getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(int totalRecovered) {
        this.totalRecovered = totalRecovered;
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

    public int getCaseForeign() {
        return caseForeign;
    }

    public void setCaseForeign(int caseForeign) {
        this.caseForeign = caseForeign;
    }

    public int getCasePrison() {
        return casePrison;
    }

    public void setCasePrison(int casePrison) {
        this.casePrison = casePrison;
    }

    public int getCaseWalkin() {
        return caseWalkin;
    }

    public void setCaseWalkin(int caseWalkin) {
        this.caseWalkin = caseWalkin;
    }

    public int getCaseNewPrev() {
        return caseNewPrev;
    }

    public void setCaseNewPrev(int caseNewPrev) {
        this.caseNewPrev = caseNewPrev;
    }

    public int getCaseNewDiff() {
        return caseNewDiff;
    }

    public void setCaseNewDiff(int caseNewDiff) {
        this.caseNewDiff = caseNewDiff;
    }

    public int getDeathNewPrev() {
        return deathNewPrev;
    }

    public void setDeathNewPrev(int deathNewPrev) {
        this.deathNewPrev = deathNewPrev;
    }

    public int getDeathNewDiff() {
        return deathNewDiff;
    }

    public void setDeathNewDiff(int deathNewDiff) {
        this.deathNewDiff = deathNewDiff;
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
        if (!(object instanceof CovidWeek)) {
            return false;
        }
        CovidWeek other = (CovidWeek) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.CovidWeek[ id=" + id + " ]";
    }
    
}
