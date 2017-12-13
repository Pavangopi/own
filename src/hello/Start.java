package hello;

 class get {
public void print(){
	System.out.println("inheritances");
}
}
 class Start extends get{
	 public void pri(){
		 System.out.println("child class");
	 }
	public static void main(String pavan[]){
		Start og=new Start();
		og.pri();
		og.print();
	}
}