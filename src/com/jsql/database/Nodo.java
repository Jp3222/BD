package com.jsql.database;

import com.jsql.sentencias.sentencia;
import javax.lang.model.SourceVersion;

/**
 *
 * @author HP
 * @param <K>
 * @param <T>
 */
public class Nodo<K extends Comparable<K>, T extends Comparable<T>> extends sentencia {

    private K key;
    private T[] items;
    private Nodo izq,der;
    public Nodo(K key, T[] items) {
        this.key = key;
        this.items = items;
    }

    @SuppressWarnings("unchecked")
    public String getSentenciasSQL() {
        return sentencia(items);
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T[] getItems() {
        return items;
    }

    public void setItems(T[] items) {
        this.items = items;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
    
}