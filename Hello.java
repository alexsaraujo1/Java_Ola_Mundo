class Hello {
    public static void main (String[] args) {
    	int inteiro = 34;
        boolean booleana = true;
        char caracter = 'C';
        char codigo = 56;
        float flutuante = 0.700000f;
        double dobro = 142.6f;
        String palavra = "Foobar";
        
        if(inteiro <= 34){
            palavra = "Verdadeiro";
        }else{
            palavra = "Falso";
        }
        
        for(char i = 'a'; i != 'k'; i++){
        	System.out.println(i);
        }
        
        System.out.println(palavra + inteiro);
    }
}