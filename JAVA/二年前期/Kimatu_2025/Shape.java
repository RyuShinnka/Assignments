abstract class Shape {//スーパークラス（抽象クラス）
	int no;//形番号
	String name;//形名

	Shape(int no) {
	    this.no = no;
	    
	    switch(no) {
	        case 1: this.name = "直線"; break;
	        case 2: this.name = "円形"; break;
	        case 3: this.name = "四角形"; break;
	        case 4: this.name = "台形"; break;
	        case 5: this.name = "三角形"; break;
	    }
	}
//	抽象メソッド
	public abstract void draw();

	void showInfo() {
	    System.out.println("ーーー番号：" + no + "ーーー");
	    System.out.println("図形の形：" + name);
	}

}