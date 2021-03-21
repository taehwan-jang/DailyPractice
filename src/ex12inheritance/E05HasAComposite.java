package ex12inheritance;

class Gun {
	int bullet;
	public Gun(int num) {
		bullet = num;
	}
	public void shotGun() {
		System.out.println("발사");
		bullet--;
	}
}

class Police {
	
	int handCuffs;
	Gun gun; // 다른 클래스에서 HasA 관계의 참조변수 불러올 수 있음
	
	public Police(int bNum, int hCuff) {
		handCuffs = hCuff;
		
		if(bNum<=0) {
			gun = null;
		}
		else {
			gun = new Gun(bNum);
		}
	}
	public void putHandCuff() {
		System.out.println("수갑채우기");
		handCuffs--;
	}
	public void shot() {
		if(gun == null) {
			System.out.println("총 없음");
		}
		else if(gun.bullet<=0){
			System.out.println("총알없음");
		}
		else{
			gun.shotGun();
		}
	}
}



public class E05HasAComposite {

	public static void main(String[] args) {
		
		Police pol1 = new Police(6, 2);
		
		pol1.putHandCuff();
		pol1.shot();
		pol1.shot();
		pol1.shot();
		pol1.shot();
		pol1.shot();
		pol1.shot();
		pol1.shot();
		pol1.shot();
		pol1.shot();
		pol1.shot();
		pol1.shot();
		pol1.shot();
		pol1.shot();
		pol1.shot();
		System.out.println("총알 :"+pol1.gun.bullet);
		
	}

}
