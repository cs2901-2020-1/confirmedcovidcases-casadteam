package cs_utec.cs2901.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table (name = "dailycases")
public class DailyCases implements Serializable {

    @Id
    private Long id;

    @Column
    private Integer quantity;

    @Column
    private Date fecha;

    public DailyCases(){
    }

    public DailyCases(Long id, Integer quantity, Date date){
        this.id = id;
        this.quantity = quantity;
        this.fecha = date;
    }

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public Integer getQuantity(){return quantity;}
    public void setQuantity(){this.quantity = quantity;}
    public Date getDate(){return fecha;}
    public void setDate(Date date){this.fecha = date;}
}
