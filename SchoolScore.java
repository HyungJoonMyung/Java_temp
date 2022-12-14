package homework.schoolscoremanage;
import java.util.Scanner;

public class SchoolScore {

	public static String[] StringInput(String[] name) {
		System.out.println("입력할 이름을 넣으세요.");
		Scanner scaninput = new Scanner(System.in);
//		for(int i=0; i < name.length; i++) {
//			if(name[i].equals("")) {
//				name[i] = (String) scaninput.;
//				break;
//			}
//			System.out.println(name[i]);
//		}
		scaninput.close();
		return name;
	}
	
//	public static int StudentCheck(String[] name) {
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생관리프로그램
//		const STUDNET_MAX 10;
		boolean onOff = true;			// 프로그램 실행중 또는 종료.
		int studentNumber = 0;			// 현재 입력된 학생수.
		int subjectNumber = 0;			// 현재 입력된 과목수.
//		const STUDENT_MAX = 50;
//		const SUBJECT_MAX = 10;
//		String[] studentName = new String[STUDENT_MAX];
//		String[] subjectName = new String[SUBJECT_MAX];		
//		int score[STUDENT_MAX][SUBJECT_MAX];
		String[] studentName = new String[50];		// 학생 명단.
		String[] subjectName = new String[10];		// 과목 명단.
		int[][] score = new int[50][10];			// 학생별 과목 점수.
		Scanner scaninput = new Scanner(System.in);

		for(int i = 0 ; i< 50 ; i++) {				// 점수 초기화.
			for(int j = 0; j<10 ; j++) {
				score[i][j] = 0;
			}
		}
		
		System.out.println("학생관리프로그램");
		while(onOff) {
			System.out.println("1. 입력  | 2. 출력  |  3. 수정  |  4. 전체평균  |  5. 과목평균  |  6. 종료");
			String menuInput = scaninput.nextLine();
			switch(menuInput) {
				case "1" :		//	1.입력
//					InputData(score, studentNumber, subjectNumber);
					System.out.println("1. 학생  |  2. 과목  |  3. 점수");
					String submenuInput = scaninput.nextLine();
					if(submenuInput.equals("1")) {
						System.out.println("1입력이 되었습니다.");		// 체크용.
//						studentName = StringInput(studentName);
//						studentNumber = StudentCheck(studentName);	// 학생수 체크
						// 입력값 이상 체크. 정상시 데이터 끝에 입력 단 MAX는 넘기지 않는다. 학생수+1(숫자를 올리거나 다시 함수불러오기)
						for(int i=0; i< studentNumber; i++) {
							System.out.printf("[ %5s ]", studentName[i]);
						}
						System.out.println("\n추가할 학생이름으로 입력하세요.");
						String name = scaninput.nextLine();
						studentName[studentNumber] = name;
						studentNumber++;
					} else if(submenuInput.equals("2")) {
						System.out.println("2입력이 되었습니다.");		// 체크용.
//						subjectName = StringInput(subjectName);
//						subjectNumber = SebjeckCheck(subjectName);	// 과목수 체크
						// 입력값 이상 체크. 정상시 데이터 끝에 입력 단 MAX는 넘기지 않는다. 과목수+1(숫자를 올리거나 다시 함수불러오기)
						for(int i=0; i< subjectNumber; i++) {
							System.out.printf("[ %5s ]", subjectName[i]);
						}
						System.out.println("\n추가할 과목을 입력하세요.");	
						String subject = scaninput.nextLine();
						subjectName[subjectNumber] = subject;
						subjectNumber++;
					} else if(submenuInput.equals("3")) {
						System.out.println("3입력이 되었습니다.");		// 체크용.
//						score = ScoreInput(score);
						for(int i=0; i< 50 && studentName[i] != null; i++) {
							System.out.printf("\n%5s", studentName[i]);
							for(int j=0; j< 10 && subjectName[j] != null; j++) {
								System.out.printf("\n%5s :", subjectName[j]);
								score[i][j] = scaninput.nextInt();
							}
						}
					} else {
						System.out.println("입력이 잘못되었습니다.");
					}
					break;
				case "2" :		// 2.출력
					System.out.printf("%5s ", "");
					for(int j = 0 ; j< 10 && subjectName[j] != null; j++) {
						System.out.printf("%5s ", subjectName[j]);
					}
					System.out.printf("\n");
					for(int i = 0; i< 50 && studentName[i] != null; i++) {
						System.out.printf("%5s ", studentName[i]);
						for(int j = 0 ; j< 10 && subjectName[j] != null; j++) {
							System.out.printf("%5d ", score[i][j]);
						}
						System.out.printf("\n");
					}
					break;
				case "3" :		// 3. 수정
					System.out.printf("%5s ", "");
					for(int j = 0 ; j< 10 && subjectName[j] != null; j++) {
						System.out.printf("%5s ", subjectName[j]);
					}
					System.out.printf("\n");
					for(int i = 0; i< 50 && studentName[i] != null; i++) {
						System.out.printf("%5s ", studentName[i]);
						for(int j = 0 ; j< 10 && subjectName[j] != null; j++) {
							System.out.printf("%5d ", score[i][j]);
						}
						System.out.printf("\n");
					}
					// 수정부분 입력받을부분
					System.out.println("\n수정할 학생이름을 입력하세요.");
					String studentIn = scaninput.nextLine();
					System.out.println("\n수정할 과목이름을 입력하세요.");
					String subjectIn = scaninput.nextLine();
					System.out.println("\n수정할 점수를 입력하세요.");
					int scoreIn = scaninput.nextInt();
					int check = 0;
					for(int i = 0; i< 50 && studentName[i] != null; i++) {
						for(int j = 0 ; j< 10 && subjectName[j] != null; j++) {
							if(studentIn.equals(studentName[i]) && subjectIn.equals(subjectName[j])) {
								score[i][j] = scoreIn;
								System.out.printf("\n %5s(학생) %5s(과목) %5d로 수정되었습니다.", studentName[i], subjectName[j], score[i][j]);
								check =1;
							}
							if(check ==1) break;
						}
						System.out.printf("\n");
						if(check ==1) break;
					}
					if(check == 0)
						System.out.printf("\n 입력이 잘못되었거나 값이 수정되지 않았습니다.");
					
					break;
				case "4" :		// 4. 전체평균
					for(int i=0; i<50 && studentName[i] != null; i++) {
						int sum = 0;
						for(int j=0; j<10 && subjectName[j] != null; j++) {
							sum+= score[i][j];
						}
						System.out.printf("\n %5s  총점 : %5d   평균 : %7.1f", studentName[i], sum, (float) sum/subjectNumber);
					}
					break;
				case "5" :		// 5. 과목평균
					for(int j=0; j<10 && subjectName[j] != null; j++) {
						int sum2 = 0;
						for(int i=0; i<50 && studentName[i] != null; i++) {
							sum2+= score[i][j];
						}
//						System.out.printf("\n %5s ", subjectName[j])
						System.out.printf("\n %5s  총점 : %5d   평균 : %7.1f", subjectName[j], sum2, (float) sum2/studentNumber);
					}
					break;
				case "6" :		// 6. 종료
					onOff = false;
					break;
				default :
					System.out.println("\n입력이 잘못되었습니다. 다시 입력해주세요.");
					break;

			}
			
		}

		scaninput.close();
	}

}
