package InfoDto;

public class InfoDto {
	private int num;
	private String name;
	private String addr;
			
	public InfoDto() {}
	
	public InfoDto(int num, String name, String addr) {
		System.out.println("Stage Map 이 열립니다");
			this.num=num;
			this.name=name;
			this.addr=addr;
						
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}