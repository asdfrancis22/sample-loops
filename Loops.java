public class Loops{
	
	public static void main(String[] args){
		loop1();
		loop2();
		loop3();
		loop4();
		loop5();

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
		System.out.println();	
	}

	static void loop4(){
		for(int a=1; a<=6; a++){
			for(int b=1; b<=a; b++)
				System.out.print(b);
			for(int b=a; b<6; b++){
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
	}

	static void loop5(){
		for (int a=1; a<=6; a++){
			for(int i=1; i<=(6-a); i++)
				System.out.print(i);
			for(int i=0; i<a; i++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();	
	}

}