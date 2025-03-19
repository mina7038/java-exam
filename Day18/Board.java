package pro02.sec2;

public class Board {
	private int bno;
	private String title;
	private String content;
	private String regdate;
	private String author;
	private int hits;
	
	public void posting(String title, String content) {
		System.out.println("새 글이 등록되었습니다.");
	}
	
	public void editing(int bno) {
		System.out.println(bno+"번 글이 수정되었습니다.");
	}
	
	public void reading(int bno) {
		System.out.println(bno+"번 글 상세보기를 진행합니다.");
	}
	
	public void delete(int bno) {
		System.out.println(bno+"번 글을 삭제합니다.");
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", content=" + content + ", regdate=" + regdate + ", author="
				+ author + ", hits=" + hits + "]";
	}
	
	
}
