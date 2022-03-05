// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {


//drive
public static int FLMotor = 9; //0
public static int BLMotor = 1;
public static int FRMotor = 2;
public static int BRMotor = 3;

//intake
public static int intakeMotor = 4;
//public static int secondIntakeMotor = 15; //will need to change later

//arm
public static int arm = 14; //change later

//shooter
public static int shooterMotor1 = 9;
public static int shooterMotor2 = 8;

//hang
public static int hangMotor1 = 30;   //will need to change these later
public static int hangMotor2 = 31;

//transport 
public static int transportMotor1 = 6;
public static int transportMotor2 = 7;



//compressor
public static int Compressor = 0;

//solenoid 
public static int Extend = 7, Retract = 0;




}
