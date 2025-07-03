class car {
    String carcolor;
    int noofwheels;
    float fuel;
    int maxspeed;
    int currentfuelinlitter;
    public void driver(){
        if(currentfuelinlitter == 0){
            System.out.println("car is out of fuel..");
        }else if(currentfuelinlitter <= 5){
            System.out.println("the car is in reserved mode");
        }else{
           System.out.println("car is driving");
           currentfuelinlitter--;
        }
       
        currentfuelinlitter--;
    }
    public void addfuel(float fuel){
        currentfuelinlitter+=fuel;
    }
}
