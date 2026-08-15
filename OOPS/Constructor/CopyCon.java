public class CopyCon {
 String name;
 int age;

      // parameterized construcoto
    public CopyCon( String studentname,int studentage) {
        name=studentname;
        age=studentage;
    }
    //copy constructor
    public CopyCon( CopyCon ref) {
        name= ref.name;
        age = ref.age;
    }
    void show(){
        System.out.println(name + " "+age);

    }
    public static void main(String[] args) {
        CopyCon c = new CopyCon("vinay",21);
        CopyCon c1 = new CopyCon(c);
        c.show();
        c1.show();


        
    }
    
    
}
