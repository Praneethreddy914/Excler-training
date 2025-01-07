class Employee{
    int id;
    String firstname;
    String lastname;
    String address;

    public Employee(){}
    public Employee(int id, String firstname, String lastname, String address){
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.address=address;
    }
    public String getfullname(){
        return firstname+" "+lastname;
    }
}