public class Associate {
	
	private int associateId;
	private String associateName;
	private String workStatus;


	public Associate() {
	super();
	}



	public int getAssociateId() {
		return associateId;
	}



	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}



	public String getAssociateName() {
		return associateName;
	}



	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}



	public String getWorkStatus() {
		return workStatus;
	}



	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}


	public void trackAssociateStatus(int x){
	     if(x>=0 && x<=20)
	     {
	    	 setWorkStatus("Core skills");
	     }
	     else if(x>=20 && x<=40)
	     {
	    	 setWorkStatus("Advanced modules");
	     }
	     else if(x>=40 && x<=60)
	     {
	    	 setWorkStatus("Project phase");
	     }
	     else
	     {
	    	 setWorkStatus("Deployed in project"); 
	     } 
	}

}
