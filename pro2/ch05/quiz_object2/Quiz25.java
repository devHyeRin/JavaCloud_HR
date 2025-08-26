package ch05.quiz_object2;

/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 이혜린
 * @설명 : 문제25 - Song 클래스 작성 -> 노래제목 title 필드, 생성자 getTitle() 메소드 구성
 */

class Song{
	private String title;
	
	public Song(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
}

public class Quiz25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song mySong = new Song("Let it go");
		Song yourSong = new Song("강남스타일");
		System.out.println("내 노래는 " + mySong.getTitle());
		System.out.println("너 노래는 " + yourSong.getTitle());
	}

}
