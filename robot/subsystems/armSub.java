// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.lang.invoke.ConstantBootstraps;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class armSub extends SubsystemBase {
  /** Creates a new armSub. */
  VictorSPX arm;
  public armSub() {
    arm = new VictorSPX(Constants.arm);
  }
  public void armOut(){
    arm.set(ControlMode.PercentOutput, 1.0);
  }
  public void armIn(){
    arm.set(ControlMode.PercentOutput, -1.0);
  }
  public void stopArm(){
    arm.set(ControlMode.PercentOutput, 0.0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
