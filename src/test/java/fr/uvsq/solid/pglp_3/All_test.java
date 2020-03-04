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
	mon_robot_1=new RobotType1(20);
	mon_robot_2=new RobotType2(20);
	mon_robot_statique=new RobotStatique(20);
	//monrobot.add(mon_robot_statique);
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
	
	assertTrue(monrobot.get(0).position==30);
	assertTrue(monrobot.get(1).position==35);
}
@Test(expected = UnsupportedOperationException.class)
public void robotStatiqueTestExceptionGenerer() {
	mon_robot_statique.avancer(); 
}
@Test
public void robotstatiqueNeBougePas()
{
	assertTrue(mon_robot_statique.position==20);
}

}
