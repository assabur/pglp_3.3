package fr.uvsq.solid.pglp_3;

public class Robot {
	protected int position;

	public Robot(int position)
	{
		this.position=position;
	}

	public  void  avance()
	{
		this.position+=5;
	}
}
