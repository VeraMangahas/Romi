// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.OnBoardIO;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDrive extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
public AutonomousDrive(Drivetrain drivetrain, OnBoardIO light) {
    addCommands( 
    //new InstantCommand(() -> light.setRedLed(true), light),
    new DriveDistanceGyroPID(0.5, 10, drivetrain)
    //new TurnDegreesGyroPID(0.5, 90, drivetrain)
    //new DriveDistanceGyro(0.5, 5, drivetrain),
    //new TurnDegreesGyro(0.5, 90, drivetrain),
    //new DriveDistanceGyro(0.5, 5, drivetrain),
    //new TurnDegreesGyro(0.5, 90, drivetrain),
    //new DriveDistanceGyro(0.5, 5, drivetrain),
    //new TurnDegreesGyro(0.5, 90, drivetrain),
   //new InstantCommand(() -> light.setRedLed(false), light)
   );
  } 
}
