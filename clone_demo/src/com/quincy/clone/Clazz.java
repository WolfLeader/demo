package com.quincy.clone;

public class Clazz implements Cloneable {
	private int clazzId;
	private String clazzName;

	public Clazz(String clazzName, int clazzId) {
		this.clazzId = clazzId;
		this.clazzName = clazzName;
	}

	public int getClazzId() {
		return clazzId;
	}

	public void setClazzId(int clazzId) {
		this.clazzId = clazzId;
	}

	public String getClazzName() {
		return clazzName;
	}

	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + clazzId;
		result = prime * result
				+ ((clazzName == null) ? 0 : clazzName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clazz other = (Clazz) obj;
		if (clazzId != other.clazzId)
			return false;
		if (clazzName == null) {
			if (other.clazzName != null)
				return false;
		} else if (!clazzName.equals(other.clazzName))
			return false;
		return true;
	}
	
	

}
