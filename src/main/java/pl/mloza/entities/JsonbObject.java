package pl.mloza.entities;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class JsonbObject implements Serializable {
    private int intField;
    private String stringField;
    private int[] intArrayField;
    private Map<String, String> mapField = new HashMap<>();

    public int getIntField() {
        return intField;
    }

    public JsonbObject setIntField(int intField) {
        this.intField = intField;
        return this;
    }

    public String getStringField() {
        return stringField;
    }

    public JsonbObject setStringField(String stringField) {
        this.stringField = stringField;
        return this;
    }

    public int[] getIntArrayField() {
        return intArrayField;
    }

    public JsonbObject setIntArrayField(int[] intArrayField) {
        this.intArrayField = intArrayField;
        return this;
    }

    public Map<String, String> getMapField() {
        return mapField;
    }

    public JsonbObject setMapField(Map<String, String> mapField) {
        this.mapField = mapField;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("JsonbObject{");
        sb.append("intField=").append(intField);
        sb.append(", stringField='").append(stringField).append('\'');
        sb.append(", intArrayField=");
        if (intArrayField == null) {
            sb.append("null");
        } else {
            sb.append('[');
            for (int i = 0; i < intArrayField.length; ++i) {
                sb.append(i == 0 ? "" : ", ").append(intArrayField[i]);
            }
            sb.append(']');
        }
        sb.append(", mapField=").append(mapField);
        sb.append('}');
        return sb.toString();
    }
}
