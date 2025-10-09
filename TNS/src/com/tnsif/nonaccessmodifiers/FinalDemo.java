package com.tnsif.nonaccessmodifiers;

class FinalDemo  {  // 'final' removed from class
    int Max = 100;   // 'final' removed from variable so it can be modified
    
    void display() {  // 'final' removed from method
        System.out.println("Show the value of max: " + Max);
    }

    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();
        fd.Max = 300; // now allowed since Max is not final
        fd.display();
        
        Child c = new Child();
        c.display();
    }
}

class Child extends FinalDemo {
    void display() {
        System.out.println("Show the value of max (from child): " + Max);
    }
}




