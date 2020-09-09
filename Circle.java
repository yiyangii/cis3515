class Circle extends Shape{
    private double radius;
    
    public Circle(String name){
        super(name);
    } 
    
    public void setDimension(double radius){
        this.radius = radius;
    }
    public void printDimensions(){
        System.out.println("radius : "+ radius);
    }
    public double getArea(){
        return radius * radius * 3.14;
    }
   
}