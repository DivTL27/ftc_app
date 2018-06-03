package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcore.internal.android.dex.Leb128;

@TeleOp(name = "Robot", group = "TeleOp")
public class Robot extends LinearOpMode {
    DcMotor L1;
    DcMotor R1;
    DcMotor L2;
    DcMotor R2;

    @Override
    public void runOpMode() {
        L1 = hardwareMap.dcMotor.get("L1");
        R1 = hardwareMap.dcMotor.get("R1");
        L2 = hardwareMap.dcMotor.get("L2");
        R2 = hardwareMap.dcMotor.get("R2");


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


            L1.setPower(Range.clip((leftPower),1,1));
            R1.setPower(Range.clip((rightPower),-1,1));
            L2.setPower(Range.clip((leftPower),-1,1));
            R2.setPower(Range.clip((rightPower),-1,1));


            idle();
        }
    }
}
