package pl.mloza.entities;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JsonbEntity {

    @Id
    @GeneratedValue
    private long id;

    @Column
    @Type(type = "pl.mloza.hibernate.CustomType")
    private JsonbObject jsonbObject;

    public long getId() {
        return id;
    }

    public JsonbEntity setId(long id) {
        this.id = id;
        return this;
    }

    public JsonbObject getJsonbObject() {
        return jsonbObject;
    }

    public JsonbEntity setJsonbObject(JsonbObject jsonbObject) {
        this.jsonbObject = jsonbObject;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("JsonbEntity{");
        sb.append("id=").append(id);
        sb.append(", jsonbObject=").append(jsonbObject);
        sb.append('}');
        return sb.toString();
    }
}
