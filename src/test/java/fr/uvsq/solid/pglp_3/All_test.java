package fr.uvsq.solid.pglp_3;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
public class All_test {

private RobotType1 mon_robot_1;
private RobotType2 mon_robot_2;
private RobotStatique mon_robot_statique;
ArrayList<Robot> monrobot = new ArrayList<Robot>();

@Before
public void setup()
{
	monrobot.add(mon_robot_statique);
	monrobot.add(mon_robot_1);
	monrobot.add(mon_robot_2);
}
@Test
public void afficher_test()
{
	for (int i =0;i<monrobot.size();i++)
		monrobot.get(i).avance();
	for (int i =0;i<monrobot.size();i++)	
		System.out.println("Robot du type"+(i+1)+" : "+monrobot.get(i).position );
}
}
