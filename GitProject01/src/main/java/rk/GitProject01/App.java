package rk.GitProject01;


public class App 
{
	public int sum(int x,int y)
	{
		return x+y;
	}
	
	public int sub(int x,int y)
	{
		return x-y;
	}
	public int mul(int x,int y)
	{
		return x*y;
	}
	public String revers(String name)
	{
		StringBuffer sb=new StringBuffer(name);
		sb.reverse().toString();
		return name;
	}
    public static void main( String[] args )
    {
        App app=new App();
        System.out.println(app.sub(20, 30));
       System.out.println( app.sum(100, 30));
    }
}
