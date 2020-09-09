class Triangle extends Shape{
    private double a,b,c;
    
    public Triangle(String name){
        super(name);
    } 
    
    public void setDimension(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        
    }
    public void printDimensions(){
        System.out.println("Side a : "+ a + "Side b :" + b + "Side c :" + c);
    }
    public double getArea(){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
   
}