package Day29;

class Wai{
	class Nei{
		int i = 1;
		int ii = 2;
	}
}

public class exp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wai.Nei wn1 = new Wai().new Nei();
		Wai w = new Wai();
		Wai.Nei wn2 = w.new Nei();
		System.out.println("�ڲ����еı���iֵΪ��"+wn1.i);
		System.out.println("�ڲ����еı���iiֵΪ��"+wn2.ii);			

	}

}
