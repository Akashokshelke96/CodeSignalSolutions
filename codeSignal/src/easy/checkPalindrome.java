public static void main(String[] args){

	System.out.println(solution("aabbaac));
	
	}
}


boolean solution(String inputString) {
    return inputString.equals(new StringBuilder(inputString).reverse().toString());
}
