package edu.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;

@Entity
@Table(name = "Company")
@SecondaryTable(
        name = "CompanyDetail", // Specifica tabelul secundar
        pkJoinColumns = @PrimaryKeyJoinColumn(name = "Company_id", referencedColumnName = "Company_id") // Cum se face legătura între tabele
)
public class Company {
    @Id
    @Column(name="Company_id", table="Company") // Mapare la câmpul Company_id din tabelul Company
    private int id;
    @Column(name="Company_name", table="Company") // Mapare la câmpul Company_name din tabelul Company
    private String name;
    @Column(name = "CompanyDetail_address", table = "CompanyDetail") // Mapare la câmpul CompanyDetail_address din tabelul CompanyDetail
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
