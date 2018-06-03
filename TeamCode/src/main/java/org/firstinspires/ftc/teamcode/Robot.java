package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name = "Robot", group = "TeleOp")
public class Robot extends LinearOpMode {
    DcMotor Left;
    DcMotor Right;

    @Override
    public void runOpMode() {
        Left = hardwareMap.dcMotor.get("LeftMotor");
        Right = hardwareMap.dcMotor.get("RightMotor");

        waitForStart();

        while (opModeIsActive()){
            // -------Arcade Mode-------- //
            /*double speed = -gamepad1.left_stick_y;
            double direction = gamepad1.right_stick_x;

            Left.setPower(Range.clip((speed + direction),-1,1));
            Right.setPower(Range.clip((speed - direction),-1,1)); */

            // -------Tank Mode----------//
            double leftPower = -gamepad1.left_stick_y;
            double rightPower = -gamepad1.right_stick_y;

            Left.setPower(Range.clip((leftPower),-1,1));
            Right.setPower(Range.clip((rightPower),-1,1));


            idle();
        }
    }
}
