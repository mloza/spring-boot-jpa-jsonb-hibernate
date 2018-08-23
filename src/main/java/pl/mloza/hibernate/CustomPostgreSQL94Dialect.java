package pl.mloza.hibernate;

import org.hibernate.dialect.PostgreSQL94Dialect;

import java.sql.Types;

public class CustomPostgreSQL94Dialect extends PostgreSQL94Dialect {

    public CustomPostgreSQL94Dialect() {
        this.registerColumnType(Types.JAVA_OBJECT, "jsonb");
    }
}