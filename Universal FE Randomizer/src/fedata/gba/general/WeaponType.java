package fedata.gba.general;

public enum WeaponType {
	NOT_A_WEAPON, SWORD, LANCE, AXE, BOW, ANIMA, LIGHT, DARK, STAFF;
	
	public boolean isPhysical() {
		switch (this) {
		case SWORD:
		case LANCE:
		case AXE:
		case BOW:
			return true;
		default:
			return false;
		}
	}
	
	public boolean isMagical() {
		switch (this) {
		case ANIMA:
		case LIGHT:
		case DARK:
		case STAFF:
			return true;
		default:
			return false;
		}
	}
	
	public WeaponType typeAdvantage() {
		switch (this) {
		case SWORD: return AXE;
		case LANCE: return SWORD;
		case AXE: return LANCE;
		case ANIMA: return LIGHT;
		case LIGHT: return DARK;
		case DARK: return ANIMA;
		default:
			return NOT_A_WEAPON;
		}
	}
}
