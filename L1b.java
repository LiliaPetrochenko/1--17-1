public class L1b {

	public static void main(String[] args) 
	{
        String[] yourMasiv = new String[]{"sdfd", "sdfbgdsfbn", "sfgdf", "adfbdfbb", "sdvasd", "nba"};//������� �����
		q(args, yourMasiv);
    }
 
    public static void q(String[] word, String[] yourMasiv) {
        boolean yes = false;
		int L2 = word[0].length();
        for(int i = 0; i < yourMasiv.length; i++){
            if(yourMasiv[i].equals(word[0])){
                yes = true;
                break;
            }
        }
        System.out.println(yes);
		if (yes == true)
			for(int i=0; i < yourMasiv.length; i++)
			{
				int L1 = yourMasiv[i].length();
				int L3 = L1-L2;
				if (L3 < 0)
					System.out.println(word[0]+" ������ ��� "+yourMasiv[i]+" �� "+Math.abs(L3)+" ��������");
				else if (L3 == 0)
					System.out.println("����� "+word[0]+" � "+yourMasiv[i]+" ����� �� �����");
				else
					System.out.println(word[0]+" ������ ��� "+yourMasiv[i]+" �� "+Math.abs(L3)+" ��������");
			}
    }
}