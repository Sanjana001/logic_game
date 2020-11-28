import java.util.*;
class information{
	String name;
	Scanner sc = new Scanner(System.in);
	information(){
		System.out.print("Enter your name: ");
	    this.name = sc.nextLine();
		if(Character.isLowerCase(name.charAt(0)))
			change();
		System.out.print("Hello "+ this.name+ ", Do you want to play with us?(Y/N) ");
	}
	public void change(){
		String split[] = name.split("");
		split[0] = split[0].toUpperCase();
		this.name = String.join("",split);
	}
	public boolean ans(){
		boolean ans;
		if(sc.next().toLowerCase().equals("y")) ans = true;
		else {
			ans = false;
			System.out.println("Thank you "+name+" for joining us.");
		}
		return ans;
	}
}
class game{
	public static void main(String[] args){
		Thread t = Thread.currentThread();
		information info = new information();
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(10);lst.add(78);lst.add(56);lst.add(40);lst.add(100);
		lst.add(46);lst.add(34);lst.add(68);lst.add(80);lst.add(30);
		while(info.ans()){
			int num = get(lst);
			System.out.println("\nChoose any number between "+num+" in your mind.");
			thread();
			System.out.println("\nNow choose the same number for your mother");
			thread();
			System.out.println("\nAlso add "+num+" from my side and then divide your number by 2");
			thread();
			System.out.println("\nNow subtract that number which you have chosen ");
			thread();
			System.out.println("\nThe answer stored in your mind is: "+num/2);
			try{
			   Thread.sleep(10000);
		           //delay for 10 seconds or 10000 milliseconds
		        }
		        catch(InterruptedException e){
			   System.out.println("Thread Interrupted");
		        }
			System.out.println("\nInteresting....");
			System.out.print("Do you want to continue or not (Y/N): ");
		}
	}
	public static int get(List<Integer> lst){
		Random rand = new Random();
		return lst.get(rand.nextInt(lst.size()));
	}
	public static void thread(){
		Thread t = Thread.currentThread();
		try{
			Thread.sleep(15000);
			//delay for 15 seconds or 15000 milliseconds
		}
		catch(InterruptedException e){
			System.out.println("Thread Interrupted");
		}
	}
}
