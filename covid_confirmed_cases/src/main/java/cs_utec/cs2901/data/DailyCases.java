package cs_utec.cs2901.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class DailyCases implements Serializable {

    @Id
    private Long id;

    @Column
    private Integer quantity;

    @Column
    private Date date;

    public DailyCases(){
    }

    public DailyCases(Long id, Integer quantity, Date date){
        this.id = id;
        this.quantity = quantity;
        this.date = date;
    }

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public Integer getQuantity(){return quantity;}
    public void setQuantity(){this.quantity = quantity;}
    public Date getDate(){return date;}
    public void setDate(){this.date = date;}
}
