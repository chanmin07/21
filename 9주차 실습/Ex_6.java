interface FaxMachine {
	  void copy();
	  void fax(String from, String to);
	  void print();
}

class CopyMachine implements FaxMachine {
	  @Override
	  public void copy() {
	    System.out.println("### ���� ###");
	  }

	  @Override
	  public void fax(String from, String to) {
	    // ������� �ʴ� �������̽��� ����Ǿ copy �� ����� ���ÿ� ������ �Ͼ��.
	  }

	  @Override
	  public void print() {
	    // ������� �ʴ� �������̽��� ����Ǿ copy �� ����� ���ÿ� ������ �Ͼ��.
	  }
}

public class Ex_6 {

}
