class Student {
	int studentID;
	String studentName;
	static int num = 0;
	
	Student(int id, String name){
		this.studentID = id;
		this.studentName = name;
		num++;
		
	}
	void printInfo() {
		System.out.println("登録番号："+ num+ "・学籍番号："+ this.studentID+ "・氏名："+ this.studentName);
	}
}
