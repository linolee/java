package day1203;

/**
 * ����� ����Ư¡�� Person���� �����ٰ� ����ϰ� �ڽŸ��� Ư¡�� ������ Ŭ����
 * 
 * @author owner
 */
public final class Clark extends Person implements Fly {
	public int power;

	public Clark() {
		super(3, 1, 1);
		power = 9;
	}

	public String power(String stone) {
		String result = "";

		if (stone.equals("Ŭ���䳪��Ʈ")) {
			power = 0;
			result = "�� ����";
		} else if (stone.equals("���̾Ƹ��")) {
			power = 10;
			result = "�����մϴ�!";
		} else {
			power = 12;
			result = "����";
		} // end if
		return result;
	}

	@Override
	public String eat() {
		return getName() + "�� ������ ���� �Դ´�.";
	}

	public String eat(String menu, int price) {
		return getName() + "�� ����������� " + price + "�޷� ¥�� " + menu + "�� �Դ´�.";
	}

	@Override
	public String[] language() {
		return "����, �ܰ��".split(",");
	}

	@Override
	public String[] language(String lang) {
		String[] tempLang = getLanguage();

		int idx = 0;
		for (int i = 0; i < tempLang.length; i++) {
			if (tempLang != null) {
				if (lang.equals(tempLang[i])) {
					// �Էµ� �� �̹� ������ ����� ���� ���� �ε����� ������.
					idx++;
				} // end if
				break;
			} // end if

		}
		tempLang[idx] = lang;
		return tempLang;
	}

	@Override
	public String speed(String speed) {
		return getName()+"�� ����ӵ��� "+speed+"�ϴ�.";
	}

	@Override
	public String height(String height) {
		return getName()+"�� ������̰� "+height+"�ϴ�.";
	}
}// class
