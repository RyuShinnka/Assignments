class Rectangle {
    double width;   // 幅（長方形・三角形用）
    double height;  // 高さ（長方形・三角形用）
    double radius;  // 半径（円用）

    // 円用のコンストラクタ
    Rectangle(double radius) {
        this.radius = radius;
    }

    // 長方形・三角形用のコンストラクタ
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 長方形の面積を計算するメソッド
    double getArea() {
        double area = this.width * this.height;
        return area;
    }

    // 三角形の面積を計算するメソッド
    double getTriangleArea() {
        double area = (this.width * this.height) / 2;
        return area;
    }

    // 円の面積を計算するメソッド
    double getCircleArea() {
        double area = this.radius * this.radius * 3.14;
        return area;
    }
}
