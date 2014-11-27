package JsonClasses;

public class createEvents {

	
	private String userName;
	private String Title;
	private String Type;
	private String Description;
	private String Location;
	private String Createdby;
	private String ActivityID;

	
	public String getuserName(){
		return userName;
	}
	
	public void setuserName(String userName){
		this.userName = userName;
	}
	
	public String getTitle(){
		return Title;
	}
	
	public void setTitle(String Title){
		this.Title = Title;
	}
	
	public String getType(){
		return Type;
	}
	
	public void setType(String Type){
		this.Type = Type;
	}
	
	public String getDescription(){
		return Description;
	}
	
	public void setDescription(String Description){
		this.Description = Description;
	}
	
	public String getLocation(){
	return Location;
	}
	
	public void setLocation(String Location){
		this.Location = Location;
	}
	

	
	public String getCreatedby(){
		return Createdby;
	}
	
	public void setCreatedby(String Createdby){
		this.Createdby = Createdby;
}
	public String getActivityID(){
	return ActivityID;
	}
	
	public void setActivityID(String ActivityID){
		this.ActivityID = ActivityID;
	}
}

