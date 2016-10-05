package com.centurylink.pctl.mod.common.utils;

import java.io.Serializable;


public class KeyValuePair<K,V> implements Serializable {


    public KeyValuePair() {
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final KeyValuePair other = (KeyValuePair) obj;
        if (this.key != other.key &&
                (this.key == null || !this.key.equals(other.key)))
        {
            return false;
        }
        if (this.value != other.value &&
                (this.value == null || !this.value.equals(other.value)))
        {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 37 * hash + (this.key != null ?
                this.key.hashCode() : 0);
        hash = 37 * hash + (this.value != null ? this.value.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString()
    {
        return String.format("KeyValuePair[%s,%s]", key, value);
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

}
