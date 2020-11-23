package Main;

import InfoDto.InfoDto;

public class AddStageInfo {
	public static void main(String[] args) {
		// 각각 스테이지 생성 디버깅에서 확인 가능
		System.out.println();
		InfoDto ifd1=new InfoDto(1, "우주", "Space Stage");
		InfoDto ifd2=new InfoDto(2, "지구", "Earth Stage");
		InfoDto ifd3=new InfoDto(3, "바다", "Sea Stage");
		InfoDto ifd4=new InfoDto(4, "사막", "Desert");
	}
}
