package lineproblem;

public class twolinesuc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1,x2,y1,y2,x3,y3,x4,y4;
	    double dis;
	    x1=1;y1=1;x2=4;y2=4;x3=1;y3=1;x4=7;y4=7 ;
	    dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	    dis=Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
	    System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
	    System.out.println("distancebetween"+"("+x3+","+y3+"),"+"("+x4+","+y4+")===>"+dis);

	}

}
