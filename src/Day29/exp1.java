package Day29;

class Waibu{
	private class Neibu{
		int i = 1;
	}
	public void myVoid(){
		Neibu n = new Neibu();
		int ii = n.i;
		System.out.print("�ڲ���ı���ֵΪ��"+ii);
	}
}

public class exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Waibu w = new Waibu();
		w.myVoid();


	}

}
