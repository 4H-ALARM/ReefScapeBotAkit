// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.climber;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.math.geometry.Rotation2d;
import frc.robot.RobotConstants;
import frc.robot.subsystems.climber.ClimberIO.ClimberIOInputs;

/** Add your docs here. */
public class ClimberIONeo implements ClimberIO {

  private final SparkMax motor;
  private final SparkMaxConfig config;

  public ClimberIONeo(){
    motor = new SparkMax(RobotConstants.ClimberConstants.climbermotorID, MotorType.kBrushless);
    config = new SparkMaxConfig();
    motor.getEncoder().setPosition(0);
  }

  @Override
  public void moveClimberArm(double speed) {
    motor.set(speed);
  }

  @Override
  public void stopClimberArm() {
    motor.stopMotor();
  }

  @Override
  public void updateInputs(ClimberIOInputs inputs) {
    inputs.climberAngle = Rotation2d.fromRotations(motor.getEncoder().getPosition());
    inputs.climberspeed = motor.get();
  }
  ;
}
