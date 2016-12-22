package tpe.testate.crypter;

	/**
	*class CrypterImpl, besitzt die encrypt() und decrypt() methode um die eingaben enntweder zu entschlüsseln oder verschlüsseln.
	*Desweiteren besitzt sie die Methoden replace() und isValidChar().
	**/
public class CrypterImpl implements Crypter {
	
	/**
	Buchstaben und Zahlen, die gültig sind, sind hier mit einem final String gegeben.
	**/
	private final String stringAllowsChars = "abcdefghijklmnopqrstuvwxyz0123456789 ";
	
	/**
	*Die Methode encrypt verschlüsselt, dass was eingegeben wird, indem sie bei return die 
	Methode replace() aufruft die das input verschlüsselt.
	*@param input, dass was verschlüsselt werden soll.
	*@return verschlüsseltes input.
	**/
	@Override
	public String encrypt(String input) {
		input = input.toLowerCase();
		return replace(input);
	}
	
	/**
	*Die Methode ruft die zu benötigende replace()-Methode auf um die Eingabe zu entschlüsseln.
	*@throws IllegalArgumentsException  wenn die Einagabe illegal, bzw. ungültig ist.
	*@param input, die zu entschlüssende Eingabe.
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
	*Die Methode replace(), vertauscht die Zeichen durch eine Zahl oder einen Buchstabe und überspringt invalide Buchstaben.
	*@param input
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
	*Bei dieser Methode gibt die Methode entweder false aus, wenn invalide Buchstaben überspringt werden oder ein true, 
	wenn es nicht der Fall sein sollte.
	@param ch
	@return false oder true
	**/
	private boolean isValidChar(Character ch) {
		if(!stringAllowsChars.contains(ch.toString())) {
			return false;
		}
		return true;
	}
}
