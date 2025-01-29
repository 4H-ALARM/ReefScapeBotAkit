// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.climber;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotConstants;

public class Climber extends SubsystemBase {

  private final ClimberIO climber;
  private ClimberIOInputsAutoLogged inputs;

  /** Creates a new climber. */
  public Climber(ClimberIO climberimpl) {
    this.climber = climberimpl;
    this.inputs = new ClimberIOInputsAutoLogged();
  }

  public void moveUp() {
    this.climber.moveClimberArm(RobotConstants.Climber.climberSpeed);
  }

  public void moveDown() {
    this.climber.moveClimberArm(-RobotConstants.Climber.climberSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
