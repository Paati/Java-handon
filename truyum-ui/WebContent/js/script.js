function validateForm() {
  var x = document.getElementById("name").value;
  if(x == "") {
    alert("Name must be filled out");
    return false;
   }
  
   if(x>='0' && x<='9') {
	   alert("name should not contain any integer");  
		return false; 
    }
	   
   if(x<2 || x>65){
	alert("name should have between 2 to 65 character");  
	return false;
  }
	 
  var y = document.getElementById("price").value;
  if(y == "") {
    alert("price must be filled out");
    return false;
  }
  
  if(y>='a' && y<='z') {
	    alert("price must be an integer");
	    return false;
	  }
    
    
    var z = document.getElementById("Dot").value;
    if(z == "") {
      alert("date must be filled out");
      return false;
    }
    
    
    var n = document.getElementById("category").value;
    if(n == "") {
      alert("category must be selected");
      return false;
    }
    return true;
 }