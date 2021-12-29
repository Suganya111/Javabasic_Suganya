package com.aaludra.basicprograms.generics;

public class MapGenericsClass<K, V> implements MapsGenericsInterface<K, V> {

	K key;
	V value;
	int size;
	@Override
	public void add(K k, V v) {
		this.key = k;
		this.value = v;
	}


	@Override
	public K getKey(V v) {
		return key;

	}

	@Override
	public V getValue(K k) {
		return value;

	}







}
