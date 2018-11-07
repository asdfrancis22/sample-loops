public class Loops{
	
	public static void main(String[] args){
		loop1();
		loop2();
		loop3();
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
		System.out.println();
	}

	static void loop2(){
		for (int a=0; a<6; a++){
			for(int i=(6-a); i>0; i--){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void loop3(){
		for (int a=1; a<=6; a++){
			for(int i=0; i<a; i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	System.out.println();
}