public class Loops{
	
	public static void main(String[] args){
		loop1();
	}

	static void loop1(){
		//System.out.println("Loop1");
		for(int a = 1; a <= 6; a++){
			System.out.print(a);
			for(int i=a; i<6; i++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}