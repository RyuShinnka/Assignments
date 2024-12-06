public class List06_06 {
    public static void main(String[] args) {
        // インスタンス生成前のカウンター値を表示
        System.out.println("StudentCard.counter = " + StudentCard.counter);

        // 最初のインスタンスを生成
        StudentCard a = new StudentCard(12345, "鈴木太郎");
        System.out.println("StudentCard.counter = " + StudentCard.counter);

        // 次のインスタンスを生成
        StudentCard b = new StudentCard(12346, "佐藤花子");
        System.out.println("StudentCard.counter = " + StudentCard.counter);
    }
}
