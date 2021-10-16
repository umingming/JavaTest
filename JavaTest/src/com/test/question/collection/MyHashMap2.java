package com.test.question.collection;

import java.util.Arrays;

public class MyHashMap2 {
	/*
	Implement the HashMap without other classes.
	
	plan>
	1. declare field; key, value array, keyIndex, index variable
	2. constructor; a length of the array is 4, keyIndex is initialized to -1, index is to 0
	3. void put(String key, Sting value); add/edit
		>if It has "key"?(call containsKey)
			>an element of keyIndex stores "value"
			>call doubleList()
				>the element of index store mediated values		
				>index++
	4. void doubleList(); if the array is full, double the lenth
		>is the length of key same as index? (because the length of array key is same as the length of array value
			>Define temp arrays doubled to origin arrays
			>for repeat the number of length
				>temp arrays store that elements
			>origin arrays are initialized to temps.
	5. boolean containsKey(String key)
		>for repeat the number of length
			>if the array has key?
				>keyIndex store i 
				>return true
	6. String get(String key)
		>if containsKey ?
			>return the elements of keyIndex 
	7. int size();
		>return index
	8. void remove(String key)
		>if containsKey ?
			>this.index--
			>for from keyIndex to this.index 
				>array[i] = array[i+1]
	9. boolean containsValue(String value)
		>for repeat the num of length
			>if the array has "value"?
				>return true
	10. void clear()
		>index store zero.
	 */
	
	private String[] key;
	private String[] value;
	private int index;
	private int keyIndex;
	
	public MyHashMap2() {
		this.key = new String[4];
		this.value = new String[4];
		this.index = 0;
		this.keyIndex = -1;
	}
	
	void put(String key, String value) {
		if(containsKey(key)) {
			this.value[keyIndex] = value;
		} else {
			doubleList();
			this.key[this.index] = key;
			this.value[this.index] = value;
			this.index++;
		}
	}

	private void doubleList() {
		if(this.index == key.length) {
			String[] tempKey = new String[key.length * 2];
			String[] tempValue = new String[value.length * 2];
			
			for(int i=0; i<this.index; i++) {
				tempKey[i] = this.key[i];
				tempValue[i] = this.value[i];
			}
			this.key = tempKey;
			this.value = tempValue;
		}
	}

	boolean containsKey(String key) {
		for(int i=0; i<this.index; i++) {
			if(this.key[i].equals(key)) {
				keyIndex = i;
				return true;
			}
		}
		return false;
	}
	
	String get(String key) {
		if(containsKey(key)) {
			return value[keyIndex];
		}
		return null;
	}
	
	int size() {
		return this.index;
	}
	
	void remove(String key) {
		if(containsKey(key)) {
			this.index--;
			for(int i=keyIndex; i<this.index; i++) {
				this.key[i] = this.key[i+1];
				this.value[i] = this.value[i+1];
			}
		}
	}
	
	boolean containsValue(String value) {
		for(int i=0; i<this.index; i++) {
			if(this.value[i].equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	void clear() {
		this.index = 0;
	}

	@Override
	public String toString() {
		return Arrays.toString(key) + "\r\n" + Arrays.toString(value) 
		+ "\r\n index=" + index + ", keyIndex=" + keyIndex;
	}
}
