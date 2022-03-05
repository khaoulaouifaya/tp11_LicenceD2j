package tp11.spring.models;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CompanyId implements Serializable{
	private long rc;
	private long idTribunal; 
	
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}

}
