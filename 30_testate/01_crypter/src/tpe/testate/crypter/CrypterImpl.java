package tpe.testate.crypter;

public class CrypterImpl implements Crypter {
	
	/**
	Buchstaben und Zahlen, die gültig sind, sind hier mit einem final String gegeben.
	**/
	private final String stringAllowsChars = "abcdefghijklmnopqrstuvwxyz0123456789 ";
	
	/**
	*@param Die Methode encrypt verschlüsselt, dass was eingegeben wird, indem sie die bei return die 
	Methode replace aufruft die das input verschlüsselt.
	*@return verschlüsseltes input.
	**/
	@Override
	public String encrypt(String input) {
		input = input.toLowerCase();
		return replace(input);
	}
	
	/**
	*@exception Die Methode entschlüsselt und throws eine Exception IllegalArgumentException.
	*@return entschlüsselter input
	**/
	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		for(int i = 0; i < input.length(); i++) {
			if(!isValidChar(input.charAt(i))) {
				
				throw new IllegalArgumentException("String contains invalid character.");
			}
		}

		input = input.toLowerCase();

		return replace(input);
	}
	
	/**
	*@param Die methode replace, vertauscht zeichen durch eine Zahl oder buchstabe und überspringt invalide buchstaben.
	*@return result
	**/
	private String replace(String input) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			Character curChar = input.charAt(i);
			if(!isValidChar(curChar)) {
				
				continue;
			}
			switch (curChar) {
			case 'e':
				result += '3';
				break;
			case '3':
				result += 'e';
				break;
			case 'l':
				result += '1';
				break;
			case '1':
				result += 'l';
				break;
			case 'o':
				result += '0';
				break;
			case '0':
				result += 'o';
				break;
			case 'a':
				result += '4';
				break;
			case '4':
				result += 'a';
				break;
			case 't':
				result += '7';
				break;
			case '7':
				result += 't';
				break;
			default:
				result += curChar;
			}
		}
		return result;
	}
	
	/**
	@param Bei dieser Methode gibt die Methode entweder false aus, wenn invalide buchstaben überspringt werden oder ein true, 
	wenn es nicht der fall sein sollte.
	@return false od true
	**/
	private boolean isValidChar(Character ch) {
		if(!stringAllowsChars.contains(ch.toString())) {
			return false;
		}
		return true;
	}
}
