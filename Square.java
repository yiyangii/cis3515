class Square extends Shape{
    private double length,height,area;

    
    public Square(String name){
        super(name);
    } 
    
    public void setDimension(double length,double height){
        this.length = length;
        this.height = height;
    }
    public void printDimensions(){
        System.out.println("Length : "+ length +" height : "+ height);
    }
    public double getArea(){
        return length * height;
    }
   
}