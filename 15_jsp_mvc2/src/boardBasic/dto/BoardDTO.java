package boardBasic.dto;

import java.util.Date;

public class BoardDTO {

	private long boardId;
	private String writer;
	private String email;
	private String subject;
	private String password;
	private Date enrollDt;
	private long readCnt;
	private String content;
	
	public long getBoardId() {
		return boardId;
	}
	public void setBoardId(long boardId) {
		this.boardId = boardId;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getEnrollDt() {
		return enrollDt;
	}
	public void setEnrollDt(Date enrollDt) {
		this.enrollDt = enrollDt;
	}
	public long getReadCnt() {
		return readCnt;
	}
	public void setReadCnt(long readCnt) {
		this.readCnt = readCnt;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "BoardDTO [boardId=" + boardId + ", writer=" + writer + ", email=" + email + ", subject=" + subject
				+ ", password=" + password + ", enrollDt=" + enrollDt + ", readCnt=" + readCnt + ", content=" + content
				+ "]";
	}
	
	
}
