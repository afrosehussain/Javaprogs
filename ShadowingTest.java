public  class ShadowingTest{
    static int x;
    int y;
    
    void methodOne(int x, int y){
        //accessing hidden static variable using classname
        ShadowingTest.x=x;
        //accessing hidden instance variable using this keyword
        this.y=y;
    }
    
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
    
    public static void main(String...args){
        ShadowingTest shadow = new ShadowingTest();
        shadow.methodOne(30,40);
        shadow.display();
    }
}

