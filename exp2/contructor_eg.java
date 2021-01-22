class opr {
		int n1, n2;
		opr(int a, int b){
			n1=a;
			n2=b;		
		}
		opr(int a){
			n1=n2=a;
		}
		int sum(){
			return n1+n2;
		}
		int sub(){
			return n1-n2;
		}
	}
	public class Constr {
		public static void main(String[] args) {
			opr ref = new opr(7,8);
			opr ref1 = new opr(7,9);
		
			int result;
		
			result = ref.sum();
			System.out.println("Sum is : "+result);
		
			result = ref1.sub();
			System.out.println("sub is : "+result);
		}
	}

