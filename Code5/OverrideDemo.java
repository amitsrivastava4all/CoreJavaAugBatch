import java.util.Scanner;

class P
{
	int x,y;
	P(){
		x = 10;
		y = 20;
	}
}
class Q extends P{
	int z;
}
class T{
	
}

class Post{
	String title;
	String desc;
	int likes;
	Post(String title, String desc,int likes){
		this.title = title;
		this.desc = desc;
		this.likes = likes;

	}
	
}
class A1
{
	P print() {
		P obj = new P();
		return obj;
	}
	
	private Post getPost() {
		Post post = new Post("Hello","How are You ",1);
		return post;
		
	}
	Post login(String userid, String password) {
		// String userid  = "amit" //char []
		// String password = "12345" char []
//		if(userid == password) {
//			
//		}
		
		if(userid.equals(password)) {
			return getPost();
		}
		else {
			return null;
		}
	}
	void show() {
		System.out.println("A Show");
	}
Q display() {
	return new Q();
	}
}
class B1 extends A1{
	Q print() {
		Q obj = new Q();
		return obj;
	}
//	T display() {
//		return new T();
//	}
	protected void show() {
		System.out.println("B Show");
	}
}
public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String password = scanner.next();
		A1 obj = new A1();
		Post post = obj.login(userid, password);
		if(post!=null) {
			System.out.println("Post "+post.title+" "+post.desc+" "+post.likes);
		}
		else {
			System.out.println("Invalid Userid or Password");
		}
		scanner.close();
		
		
	}

}
