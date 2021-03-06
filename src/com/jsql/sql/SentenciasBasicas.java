package com.jsql.sql;

/**
 *
 * @author jp
 */
public interface SentenciasBasicas {

    public String INSERT(String tabla, String datos);

    public String INSERT(String tabla, String campos, String datos);

    public String INSERT(String tabla, String campos, String datos, String where);

    public String UPDATE(String tabla, String campos_datos, String where);

    public String UPDATE(String tabla, String campos, String datos, String where);

    public String DELETE(String tablas, String where);

    public String SELECT(String tabla);

    public String SELECT(String tabla, String campos);

    public String SELECT(String tabla, String campos, String where);
}
