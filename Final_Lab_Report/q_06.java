/* 
6. Create class named as ‘a’ and create a sub class ‘b’ which is extends from class ‘a’. Write
a program to give the example for method overriding concepts.
*/

public class a {

    String name="Sourav Kumar Das";
    public void display(){
        System.out.println("Name : "+this.name);
    }
}




public class b extends a{

    public void display(){
        System.out.println("Name of person : "+super.name);
    }

    public static void main(String args[]){
        b ob = new b();
        ob.display();
        a ob2 = new a();
        ob2.display();
    }
}
