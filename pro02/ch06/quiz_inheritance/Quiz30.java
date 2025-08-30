package ch06.quiz_inheritance;

/**
 * 날짜 : 2025. 8. 30.
 * 작성자 : 이혜린
 * 내용 : 문제30 - 다이어그램, 메인화면, 결과화면 참조해서 프로그램 작성
 */

abstract class CDInfo{
	protected int managerNum;
	
	public void setManagerNum(int managerNum) {
		this.managerNum = managerNum;
	}
	
	public int getManagerNum() {
		return managerNum;
	}
}

class Music extends CDInfo{
	protected String artist;
	protected String[] song;
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setSong(String[] song) {
		this.song = song;
	}
	
	public void disp() {
		System.out.println("관리자 번호 : " + super.managerNum);
		System.out.println("가수 : " + artist);
		for(int i = 0; i < song.length; i++) {
			System.out.println("힌트송[" + (i+1) + "] : " + song[i]);
		}
		
	}
}

public class Quiz30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music m = new Music();
		m.setManagerNum(123456);
		m.setArtist("플라이 투 더 스카이");
		String[] song = {"너를너를너를", "전화하지 말아요"};
		m.setSong(song);
		
		m.disp();
	}

}
