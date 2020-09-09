class EquilateralTriangle extends Triangle{
    private double a;
    
    public EquilateralTriangle(String name){
        super(name);
    } 
    
    public void setDimension(double a){
        super.setDimension(a,a,a);
        this.a = a;
    }

   
}