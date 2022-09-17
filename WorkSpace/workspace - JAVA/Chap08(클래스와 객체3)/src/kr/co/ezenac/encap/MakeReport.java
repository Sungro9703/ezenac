package kr.co.ezenac.encap;

public class MakeReport {
	
	StringBuffer buffer = new StringBuffer();
	private String line = "=======================================\n";
	private String title = " 이름\t	주소 \t\t 전화번호	\n";
	
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
		
	}
	
	private void generateBody() {
		buffer.append("이방원\t");
		buffer.append("서울시 강남구\t");
		buffer.append("010-1234-5678\n");
		
		buffer.append("이성계\t");
		buffer.append("전주시 한옥마을\t");
		buffer.append("010-1111-2222\n");
		
		buffer.append("이도\t");
		buffer.append("서울시 중구\t\t");
		buffer.append("010-2222-3333\n");
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	
	public String getReport() {
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
	
}
