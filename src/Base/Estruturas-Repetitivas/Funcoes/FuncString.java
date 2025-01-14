public class FuncString {
	public static void main(String[] args) {

		
		String original = "abcde FGHI ABC abc DEFG   ";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");

		System.out.println(original);
		System.out.println("Minuscula: -"+s01+"-");
		System.out.println("Maiuscula: -"+s02+"-");
		System.out.println("Tirar espaços das bordas: -"+s03+"-");
		System.out.println("Recortar a partir do 2: -"+s04+"-");
		System.out.println("Recortar do 3 ao 9: -"+s05+"-");
		System.out.println("Trocar a por x: -"+s06+"-");
		System.out.println("Trocar abc po xy: -"+s07+"-");
		System.out.println("A primeira ocorrencia do bc: "+i);
		System.out.println("A ultima ocorrencia do bc: "+j);

		
	}
}