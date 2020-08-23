package projeto2;

public class Ordenacao {
	public static String[][] ordenar(String [][] dic, int ord) {
		ord--; 
		int ord2=0;
		ord2=ord ==1 ? 0 :1;
		
		int in, min; 
		String temp1, temp2 = null; 
			for (int out=0; out<dic.length; out++) { 
				min = out;
				for (in = out + 1; in < dic.length; in++) 
					if (dic[in][ord].compareToIgnoreCase(dic[min][ord])>=1)
						min = in; 
				temp1 = dic[out][ord];
				temp2 = dic[out][ord2];
				dic[out][ord] = dic[min][ord];
				dic[out][ord2] = dic[min][ord2];
				dic[min][ord] = temp1;  
				dic[min][ord2] = temp2;
			}
			return dic;
		}
}