class Triangle extends Polyline{
	Triangle(int no,int length){
		super(no, length);
	}
	public void draw() {
		super.showInfo();
		System.out.println("高さと幅が同じ直角三角形を描く");
        System.out.println("高さ：" + length);

        // ▲ を高さ分の行で出力
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("▲");
            }
            System.out.println(); // 行ごとに改行
        }
	}
}