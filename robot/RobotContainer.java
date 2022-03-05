// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.PneumaticsDEPLOYCommand;
import frc.robot.commands.PneumaticsRETRACTCommand;
import frc.robot.commands.rightTarmacAutonomousGroupCommand;
import frc.robot.commands.intakeIN_Command;
import frc.robot.commands.leftTarmacAutonomousCommandGroup;
import frc.robot.commands.lowShooterCommand;
import frc.robot.commands.shooterCommand;
import frc.robot.commands.arcadeCommand;
import frc.robot.commands.transportBackCommand;
import frc.robot.commands.transportForwardCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.PneumaticsSub;
import frc.robot.subsystems.hangSub;
import frc.robot.subsystems.intakeSub;
import frc.robot.subsystems.shooterSub;
import frc.robot.subsystems.arcadeSub;
import frc.robot.subsystems.armSub;
import frc.robot.subsystems.transportSub;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  public static arcadeSub maArcadeSub = new arcadeSub();

  public static shooterSub mShooterSub = new shooterSub();

  public static hangSub mHangSub = new hangSub();

  public static transportSub mTransportSub = new transportSub();

  public static intakeSub mIntakeSub = new intakeSub();

  public static PneumaticsSub mPneumaticsSub = new PneumaticsSub();

  public static armSub mArmSub = new armSub();


//autonomous declarations
public static rightTarmacAutonomousGroupCommand mRightTarmacAutonomousGroupCommand = new rightTarmacAutonomousGroupCommand();
public static leftTarmacAutonomousCommandGroup mLeftTarmacAutonomousCommandGroup = new leftTarmacAutonomousCommandGroup();


  public static Joystick driver = new Joystick(0);

  public static Joystick coDriver = new Joystick(1);




  //driver
  JoystickButton deployPneumatics = new JoystickButton(driver, 1);
  JoystickButton retractPneumatics = new JoystickButton(driver, 2);

  //coDriver
  JoystickButton shooter = new JoystickButton(coDriver, 1);
  JoystickButton lowShooter = new JoystickButton(coDriver, 5);


  JoystickButton transport = new JoystickButton(coDriver, 2);
  JoystickButton transportBack = new JoystickButton(coDriver, 3);

  JoystickButton intakeIn = new JoystickButton(coDriver, 4);




  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
maArcadeSub.setDefaultCommand(new arcadeCommand());

  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

shooter.whileHeld(new shooterCommand());
lowShooter.whileHeld(new lowShooterCommand());

transport.whileHeld(new transportForwardCommand());
transportBack.whileHeld(new transportBackCommand());
intakeIn.whileHeld(new intakeIN_Command());

deployPneumatics.whenPressed(new PneumaticsDEPLOYCommand());
retractPneumatics.whenPressed(new PneumaticsRETRACTCommand());


}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return mRightTarmacAutonomousGroupCommand;
  }
}
