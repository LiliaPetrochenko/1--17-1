class L1a {
 
    public static void main(String[] args) {
        String[] yourMasiv = new String[]{"sdfdffdsffffffff", "1sdfbgdsfbn", "sfgdf", "adfbdfbb", "sdvasdqqqqqqqqqqqqqqqqqqqqq", "sdvdfbbbbb"};//входной масив
       
        boolean toSort = true;
       
        while (toSort) {
            toSort = false;
            
            for (int i = 0; i < yourMasiv.length - 1; i++) {
                if (yourMasiv[i].length() < yourMasiv[i + 1].length()) {
                    String tmp = yourMasiv[i];
                    yourMasiv[i] = yourMasiv[i + 1];
                    yourMasiv[i + 1] = tmp;
                    
                    toSort = true;
                }
            }       
        }
        
        for (String item : yourMasiv) {
            System.out.println(item);
        }
    }
}