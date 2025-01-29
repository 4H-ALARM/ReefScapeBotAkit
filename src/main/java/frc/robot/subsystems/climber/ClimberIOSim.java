// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.climber;

import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.math.system.plant.LinearSystemId;
import edu.wpi.first.wpilibj.simulation.DCMotorSim;
import frc.robot.RobotConstants;

/** Add your docs here. */
public class ClimberIOSim {
  private final DCMotorSim motor;
  // private final LoggedMechanism2d climberMechanism;
  private final DCMotor gearbox = DCMotor.getKrakenX60Foc(1);

  public ClimberIOSim() {
    motor =
        new DCMotorSim(
            LinearSystemId.createDCMotorSystem(
                gearbox, 1, RobotConstants.ClimberConstants.sensorToMechanismRatio),
            gearbox,
            null);
  }
}
