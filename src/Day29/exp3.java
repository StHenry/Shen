package Day29;

class Out{
	int i = 1;
	class In{
		public void myVoid(){
			System.out.print("�ⲿ���еĳ�Ա����ֵΪ��"+i);
		}
	}
}

public class exp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Out o = new Out();
		Out.In i = o.new In();
		i.myVoid();

	}
	
}
