class User{
    int id;
    String name;
    int phoneNumber;
    String address;
    String email;
    int[] accountIds;
    
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPhoneNUmber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setEmail(String email){
        this.email =email;
    }
        
    
    public String getName(){
        return name;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    

}