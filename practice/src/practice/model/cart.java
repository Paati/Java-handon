package practice.model;

import java.util.List;

public class cart {

	private float total;
	private List<menuitem> menuitemlist; 
	
	public cart(float total,List<menuitem> menuitemlist){
		this.total=total;
		this.menuitemlist=menuitemlist;
	}
	
	public float getTotal(){
		return total;
	}
	
	public void setTotal(float total){
		this.total=total;
	}
	
	public List<menuitem> getMenuitemlist(){
		return menuitemlist;
	}
	
	public void setMenuitemlist(List<menuitem> menuitemlist){
		this.menuitemlist=menuitemlist;
	}
}
