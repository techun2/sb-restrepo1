package com.myj.collect.hashmap;

public class DataKey {

	private String name;
	private int id;

	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		DataKey dk2 = (DataKey)obj;
		if ( name.equals(dk2.getName()) && (id == dk2.getId())  ){
			return true;
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		int prime = 31;
		int hCode = 1;
//		hcode = 31*hcode +
		hCode = prime*hCode + ( (name == null) ? 0:name.hashCode() );
		hCode = prime*hCode + id;
		return hCode;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


        // getter and setter methods

	@Override
	public String toString() {
		return "DataKey [name=" + name + ", id=" + id + "]";
	}

}
