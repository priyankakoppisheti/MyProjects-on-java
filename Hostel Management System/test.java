package Main;

import java.util.*;
import hostel.feeCollection;
import HostelDetails.hostel;
import roomDetails.Room;
import Storage.Inventory;
import StudentDetails.Student;
public class test {
static int c1=0,c2=0;
public static void main(String[] args)
{
	int var1,var2;
	String ch="y";
	feeCollection f[] = new feeCollection[10];
	Room r[] = new Room[10];
	Inventory i[] = new Inventory[10];
	Student s[]  = new Student[10];
	hostel h[] = new hostel[10];
	System.out.println("******HOSTEL MANAGEMENT SYSTEM*****");
	while(ch.equalsIgnoreCase("y"))
	{
		System.out.println("select your choice");
		System.out.println("1.Add Details\n2.Update Details\n3.Display Details\n4.Exit");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("1.Hostel Details\n2.Student Details");
				int choice2=sc.nextInt();
				switch(choice2)
				{
				case 1:h[c1]=new hostel();
						i[c1]=new Inventory();
						System.out.println("enter Hostel name,Student Count,Room Count");
						String name = sc.next();
						long scount =sc.nextLong();
						long rcount =sc.nextLong();
						h[c1].setHname(name);
						h[c1].setRcount(scount);
						h[c1].setRcount(rcount);
						System.out.println("enter no. of beds,desks,sportsgoods,DamageGoods");
						int beds = sc.nextInt();
						int desks = sc.nextInt();
						int sp = sc.nextInt();
						int dg = sc.nextInt();
						i[c1].setBeds(beds);
						i[c1].setDesks(desks);
						i[c1].setSportgoods(sp);
						i[c1].setDamagedGoods(dg);
						c1++;
						break;
				case 2: s[c2] = new Student();
						r[c2] = new Room();
						f[c2] = new feeCollection();
						System.out.println(" enter Student name,Register id, Phone no:");
						String sname = sc.next();
						String reg = sc.next();
						long phno = sc.nextLong();
						s[c2].setHname(sname);
						s[c2].setRegNo(reg);
						s[c2].setPhno(phno);
						System.out.println("enter Room no. , Room Type, Hostel name");
						int rno = sc.nextInt();
						String rtype = sc.next();
						String hname2 = sc.next();
						r[c2].setRoomNo(rno);
						r[c2].setRoomType(rtype);
						sc.next();
						r[c2].setHostels(hname2);
						System.out.println("enter the Mess Name");
						String mess = sc.next();
						r[c2].setMess(mess);
						
						
						if(r[c2].getRoomType().equalsIgnoreCase("Single Seater"))
						{
							f[c2].setRoomfees(40000);
						}
						else
						{
							f[c2].setRoomfees(10000);
						}
						if(r[c2].getMess().equalsIgnoreCase("North"))
						{
							f[c2].setMessfees(4000);
						}
						else if(r[c2].getMess().equalsIgnoreCase("South"))
						{
							f[c2].setMessfees(3000);
						}
						else
						{
							f[c2].setMessfees(6000);
						}
						f[c2].computeFees();
						c2++;
						break;
		
				}
				break;
		case 2:System.out.println("1.Hostel Details\n2.Student Details");
				int choice3 = sc.nextInt();
				switch(choice3)
				{
			
				case 1: System.out.println("enter the name of the hostel");
						String hname =sc.next();
						for(var1=0;var1<=c1;var1++)
						{
							if(h[var1].getHname().equalsIgnoreCase(hname))
							{
								System.out.println("enter your choice to update\n1.Bed\n3.Desks"+"\n3.Sportsgoods\n4.DamageGoods\n5.StudentCount");
								int choice4 =sc.nextInt();
								System.out.println("enter:");
								switch(choice4) {
								case 1:int bed =sc.nextInt();
										i[var1].setBeds(bed);
										break;
								case 2:int desk = sc.nextInt();
										i[var1].setDesks(desk);break;
								case 3:int sg =sc.nextInt();
										i[var1].setSportgoods(sg);
										break;
								case 4:int dg =sc.nextInt();
										i[var1].setDamagedGoods(dg);
										break;
								case 5:long scount2 =sc.nextLong();
										h[var1].setRcount(scount2);break;
								}break;
							}
							}break;
							
						case 2:System.out.println("enter the Register Id of the Student");
								String reg =sc.next();
								for(var2=0;var2<=c2;var2++) {
									if(s[var2].getRegNo().equalsIgnoreCase(reg)) {
										System.out.println("enter your choice to update\n1.phonr no.\n2.Room no.\n"+"\n3.Mess Name");
										int choice5=sc.nextInt();
										System.out.println("enter:");
										switch(choice5) {
										case 1:long phno=sc.nextLong();
												s[var2].setPhno(phno);break;
										case 2:int rno=sc.nextInt();
												r[var2].setRoomNo(rno);break;
										case 3:String mname=sc.next();
												r[var2].setMess(mname);
												if(r[var2].getMess().equalsIgnoreCase("North")) {
													f[var2].setMessfees(4000);
												}
												else if(r[var2].getMess().equalsIgnoreCase("South")) {
													f[var2].setMessfees(3000);
												}
												else {
													f[var2].setMessfees(6000);
												}
												f[var2].computeFees();
												break;
										}break;
										}
									}
								}break;
										
		case 3:		System.out.println("enter your choice to display\n1.Hostel Details\n2.Student Details");
						int choice6=sc.nextInt();
						switch(choice6) {
						case 1:System.out.println("Enter the name of the hostel");
								String hname=sc.next();
								for(var1=0;var1<=c1;var1++) {
									if(h[var1].getHname().equalsIgnoreCase(hname)) {
										System.out.println("Hostel Name"+h[var1].getHname()+"\nStudent Count:"+h[var1].getRcount()
												+"\nRoom Count:"+h[var1].getRcount()+"\nBed Count:"+i[var1].getBeds()
												+"\nDesk Count:"+i[var1].getDesks()+"\nSportsGoods:"+i[var1].getSportgoods()
												+"\nDamageGoods:"+i[var1].getDamagedGoods());
										break;
									}
								}break;
						case 2: System.out.println("Enter the Register Id of the student");
								String reg=sc.next();
								for(var2=0;var2<=c2;var2++) {
									if(s[var2].getRegNo().equalsIgnoreCase(reg)) {
										System.out.println("Student Name: "+s[var2].getSname()+"\nPhone No:"+s[var2].getPhno()+
												"\nRoom No:"+r[var2].getRoomNo()+"\nRoom Type:"+r[var2].getRoomType()+"\nHostel Name:"+
												h[var2].getHname()+"\nMess Name:"+r[var2].getMess()+"\nRoom Fees:"+f[var2].getRoomfees()+
												"\nMess Fees:"+f[var2].getMessfees()+"\nTotal Fees:"+f[var2].getFees());
										break;
									}
								}break;
						}break;
		}
					System.out.println("Do you wanna continue???");
					ch=sc.next();
									}
								}
						
						
								
							
						}
				
		
	
	

