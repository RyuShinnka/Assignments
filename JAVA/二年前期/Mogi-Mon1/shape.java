abstract class Shape {//スーパークラス（抽象クラス）
	int no;//形番号
	String name;//形名

	Shape(int no, String name) {
	    this.name = name;
	    this.no = no;
	}
//	抽象メソッド
	public abstract void draw();
	
	void showInfo() {
	    System.out.println("ーーー番号：" + no + "ーーー");
	    System.out.println("図形の形：" + name);
	}

}
