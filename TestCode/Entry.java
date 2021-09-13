package TestCode;
abstract class A{
    public int x = 10;
}
class C{

}
class B extends A{
    public int x = 20;
    
    public void display(){
        System.out.print(this.x);
    }
}

public class Entry {
    public static void main(String[] args) {
		Author[] authors = new Author[3];
		authors[0] = new Author("Viet", "VietCV@codelearn.io");
		authors[1] = new Author("Tuan", "TuanLQ@codelearn.io");
		authors[2] = new Author("Kien", "KienNT@Codelearn.io");
		
		Book book1 = new Book("C++ for Beginners", authors, 210000);
		System.out.println(book1.getAuthorNames());
        B b = new B();
        b.display();
	}
}
