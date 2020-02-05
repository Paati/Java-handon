package practice.model;

import java.util.Date;

public class menuitem {
	private long id;
	private String name;
	private float price;
	private boolean active;
	private Date dateoflaunch;
	private String category;
	private boolean freedelivery;
	
	public menuitem() {
		super();
	}

	public menuitem(long id, String name, float price, boolean active, Date dateoflaunch, String category,
			boolean freedelivery) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.active = active;
		this.dateoflaunch = dateoflaunch;
		this.category = category;
		this.freedelivery = freedelivery;
	}
	
	public long getId(){
		return id;
	}
	public void setId(long id){
	       this.id=id;		
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDateoflaunch() {
		return dateoflaunch;
	}

	public void setDateoflaunch(Date dateoflaunch) {
		this.dateoflaunch = dateoflaunch;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isFreedelivery() {
		return freedelivery;
	}

	public void setFreedelivery(boolean freedelivery) {
		this.freedelivery = freedelivery;
	}

	@Override
	public String toString() {
		return "menuitem [id=" + id + ", name=" + name + ", price=" + price + ", active=" + active + ", dateoflaunch="
				+ dateoflaunch + ", category=" + category + ", freedelivery=" + freedelivery + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		menuitem other = (menuitem) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
