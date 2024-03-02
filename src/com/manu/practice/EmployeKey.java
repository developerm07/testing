package com.manu.practice;

public class EmployeKey {

	String id;
	String dob;
	
	public EmployeKey(String theId, String theDob) {
		id=theId;
		dob=theDob;
	}
	
	
	
	
	@Override
	public String toString() {
		return "EmployeKey [id=" + id + ", dob=" + dob + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		EmployeKey other = (EmployeKey) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
