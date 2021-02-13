public class ReturnObject {

	public static void main(String[] args){ 
        ObjectDemo ob1 = new ObjectDemo(72,20); 
        ObjectDemo ob2 = new ObjectDemo(72,20); 
        ObjectDemo ob3 = new ObjectDemo(5,5); 
        System.out.println("object1 = object2: " + ob1.equalTo(ob2)); 
        System.out.println("object1 = object3: " + ob1.equalTo(ob3));
        System.out.println("object2 = object3: " + ob2.equalTo(ob3)); 
    } 
} 
class ObjectDemo 
{ 
    int a, b; 
  
    ObjectDemo(int i, int j) 
    { 
        a = i; 
        b = j; 
    } 
 
    boolean equalTo(ObjectDemo o) 
    { 
        return (o.a == a && o.b == b); 
    } 
} 		
